package com.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.RegisterUser;
// import com.services.LoginService;
import com.services.RegisterUserService;

@RestController
@RequestMapping("/registeruser")
@CrossOrigin("*")
public class RegisterUserController {

    @Autowired
    private RegisterUserService registerUserService;

    // @Autowired
    // private LoginService loginService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    // @GetMapping
    // public ResponseEntity<List<RegisterUser>> getUserName() {
    //     List<RegisterUser> ex = registerUserService.getUserName();
    //     System.out.println(RegisterUser.getRole());
    //     return ResponseEntity.ok(registerUserService.getUserName());
    // }

    // @GetMapping("/{adhaarno}")
    // public ResponseEntity<RegisterUser> getUserName(@PathVariable String
    // adhaarno){
    // return null;
    // if (registerUserService.getUserName(adhaarno) == null)
    // System.out.println("not Found");
    // else
    // System.out.println("found");

    // return ResponseEntity.ok(registerUserService.getUserName(adhaarno));
    // }

    @PostMapping
    public RegisterUser createUser(@RequestBody RegisterUser user) throws Exception {
        user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));
        user.setTranspassword(this.bCryptPasswordEncoder.encode(user.getTranspassword()));
        user.setRole("NORMAL");

        return registerUserService.createUser(user);
    }

}
