package com.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exception.UserNotFoundException;
import com.model.RegisterUser;
import com.model.Registration;
import com.repository.RegisterUserRepository;
import com.repository.RegistrationRepository;

@Service
public class RegisterUserService {

    @Autowired
    private RegisterUserRepository registerUserRepository;

    @Autowired
    private RegistrationRepository registrationRepository;

    public RegisterUserService(RegisterUserRepository registerUserRepository) {
        this.registerUserRepository = registerUserRepository;
    }

    public RegisterUser createUser(RegisterUser user) throws Exception {
        // System.out.println("username" + user.getUsername());
        Registration local = this.registrationRepository.findByUsername(user.getUsername());
        // System.out.println(local);
        if (local != null) {
            this.registerUserRepository.save(user);
        } else {
            throw new UserNotFoundException();

        }
        return this.registerUserRepository.save(user);
    }

    // public RegisterUser getRole(RegisterUser user){
    // // System.out.println("in get role" +
    // this.registerUserRepository.findByUsername(user.getUsername()));
    // return this.registerUserRepository.findByUsername(user.getUsername());
    // }

    public List<RegisterUser> getUserName() {
        return registerUserRepository.findAll();
    }

}
