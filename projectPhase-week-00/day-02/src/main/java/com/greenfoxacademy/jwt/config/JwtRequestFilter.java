package com.greenfoxacademy.jwt.config;

import com.greenfoxacademy.jwt.services.MyUserDetailsService;
import com.greenfoxacademy.jwt.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtRequestFilter extends OncePerRequestFilter {

  private MyUserDetailsService myUserDetailsService;
  private JwtUtil jwtUtil;

  @Autowired
  public JwtRequestFilter(MyUserDetailsService myUserDetailsService, JwtUtil jwtUtil) {
    this.myUserDetailsService = myUserDetailsService;
    this.jwtUtil = jwtUtil;
  }

  @Override
  protected void doFilterInternal(HttpServletRequest request,
                                  HttpServletResponse response,
                                  FilterChain filterChain) throws ServletException, IOException {
    String authorizationHeader = request.getHeader("Authorization");
    String bearer="Bearer ";
    String username = null;
    String jwt = null;

    if (authorizationHeader != null && authorizationHeader.startsWith(bearer)){
      jwt = authorizationHeader.substring(bearer.length());
      username = jwtUtil.extractUsername(jwt);
    }

    if (username != null && SecurityContextHolder.getContext().getAuthentication() == null){
      UserDetails userDetails = this.myUserDetailsService.loadUserByUsername(username);
      if (jwtUtil.validateToken(jwt, userDetails)){
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
            new UsernamePasswordAuthenticationToken(userDetails, null,
                userDetails.getAuthorities());
        usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
        SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
      }
    }
    filterChain.doFilter(request, response);
  }
}