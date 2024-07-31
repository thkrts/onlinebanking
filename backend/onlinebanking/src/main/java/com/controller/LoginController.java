package com.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import com.config.JwtUtils;
import com.exception.UserNotFoundException;
import com.services.LoginService;
// import com.services.RegisterUserService;
import com.model.Login;
import com.model.RegisterUser;

@RestController
@CrossOrigin("*")
public class LoginController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private LoginService loginService;

    @Autowired
    private JwtUtils jwtUtils;

    // @Autowired
    // private RegisterUserService registerUserService;

    // @Bean
    // public AuthenticationManager authenticationManager() {
    // return new authenticationManager();

    // }

    @PostMapping("/generate-token")
    public ResponseEntity<?> generateToken(@RequestBody Login login) throws Exception {
        // System.out.println(login.getPassword());
        // System.out.println(login.getUsername());

        try {

            authenticate(login.getUsername(), login.getPassword());
        } catch (UserNotFoundException e) {
            e.printStackTrace();

            throw new Exception("User not found ");
        }
        
        UserDetails userDetails = this.loginService.loadUserByUsername(login.getUsername());
        String token = this.jwtUtils.generateToken(userDetails);
        return ResponseEntity.ok(new Login(token));

    }

    private void authenticate(String username, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));

        } catch (DisabledException e) {
            throw new Exception("USER DISABLED " + e.getMessage());
        } catch (BadCredentialsException e) {
            throw new Exception("Invalid Credentials " + e.getMessage());
        }
    }

    @GetMapping("/current-user")
    public RegisterUser getCurrentUser(Principal principal) {
        // System.out.println(principal.getName());
        return ((RegisterUser) this.loginService.loadUserByUsername(principal.getName()));
    }

    // @GetMapping("/get-role/{username}")
    // public String getRole(@PathVariable RegisterUser username) throws Exception{
    // // RegisterUser S = getRole(this.registerUserService.getRole(username));
    // // System.out.println(username);
    // // System.out.println(this.registerUserService.getRole(username).toString());
    // return (this.registerUserService.getRole(username).getRole());
    // }

}
