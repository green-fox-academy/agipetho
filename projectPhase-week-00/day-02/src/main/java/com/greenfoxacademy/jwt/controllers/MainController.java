package com.greenfoxacademy.jwt.controllers;

import com.greenfoxacademy.jwt.models.*;
import com.greenfoxacademy.jwt.services.ApiInterface;
import com.greenfoxacademy.jwt.services.MovieService;
import com.greenfoxacademy.jwt.services.MyUserDetailsService;
import com.greenfoxacademy.jwt.services.UserService;
import com.greenfoxacademy.jwt.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

@RestController
public class MainController {

  private AuthenticationManager authenticationManager;
  private MyUserDetailsService userDetailsService;
  private UserService userService;
  private MovieService movieService;
  private JwtUtil jwtUtil;


  @Autowired
  public MainController(AuthenticationManager authenticationManager,
                        MyUserDetailsService userDetailsService,
                        UserService userService,
                        MovieService movieService,
                        JwtUtil jwtUtil) {
    this.authenticationManager = authenticationManager;
    this.userDetailsService = userDetailsService;
    this.userService = userService;
    this.movieService = movieService;
    this.jwtUtil = jwtUtil;
  }

  @GetMapping({"/ciao", "/hello"})
  public String hello() {
    return "Hello, this is Agi's first app with Spring Security:)";
  }

  @RequestMapping(value = "/add-new-user", method = RequestMethod.POST)
  public ResponseEntity<?> saveUser(@RequestBody User user) throws Exception {
    return ResponseEntity.ok(userService.saveUser(user));
  }

  @PostMapping("/authenticate")
  public ResponseEntity createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
    try {
      authenticationManager.authenticate(
          new UsernamePasswordAuthenticationToken(authenticationRequest
              .getUserName(), authenticationRequest.getPassword())
      );
    } catch (BadCredentialsException e) {
      throw new Exception("Incorrect username or password", e);
    }
    UserDetails userDetails =
        userDetailsService.loadUserByUsername(authenticationRequest.getUserName());
    String jwt = jwtUtil.generateToken(userDetails);
    return ResponseEntity.ok(new AuthenticationResponse(jwt));
  }

  @GetMapping("/latest-person")
  public ResponseEntity getLatestMoviePerson() throws IOException {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl(movieService.getBaseUrl())
        .addConverterFactory(GsonConverterFactory.create())
        .build();
    ApiInterface apiInterface = retrofit.create(ApiInterface.class);
    Call<MoviePersonDTO> call = apiInterface.getPopularMovies(
        movieService.getAPI_KEY(),
        movieService.getLANGUAGE(),
        movieService.getPAGE());
    Response<MoviePersonDTO> response = call.execute();
    MoviePerson moviePerson = new MoviePerson(response.body());
    movieService.saveMoviePerson(moviePerson);
    return ResponseEntity.ok(response.body());
  }
}
