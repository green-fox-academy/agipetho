package com.greenfoxacademy.jwt;

import com.greenfoxacademy.jwt.models.AuthenticationRequest;
import com.greenfoxacademy.jwt.models.AuthenticationResponse;
import com.greenfoxacademy.jwt.services.MyUserDetailsService;
import com.greenfoxacademy.jwt.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtController {

  private AuthenticationManager authenticationManager;
  private MyUserDetailsService userDetailsService;
  private JwtUtil jwtUtil;

  @Autowired
  public JwtController(AuthenticationManager authenticationManager,
                        MyUserDetailsService userDetailsService,
                        JwtUtil jwtUtil) {
    this.authenticationManager = authenticationManager;
    this.userDetailsService = userDetailsService;
    this.jwtUtil = jwtUtil;
  }

  @GetMapping("/hello")
  public String hello() {
    return "hello";
  }

  @PostMapping("/authenticate")
  public ResponseEntity createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
    try {
      authenticationManager.authenticate(
          new UsernamePasswordAuthenticationToken(authenticationRequest
              .getUsername(), authenticationRequest.getPassword())
      );
    } catch (BadCredentialsException e) {
      throw new Exception("Incorrect username or password", e);
    }
    UserDetails userDetails =
        userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
    String jwt = jwtUtil.generateToken(userDetails);
    return ResponseEntity.ok(new AuthenticationResponse(jwt));
  }
}