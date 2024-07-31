package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.model.RegisterUser;
import com.repository.RegisterUserRepository;

@Service
public class LoginService implements UserDetailsService {

    @Autowired
    private RegisterUserRepository registerUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        RegisterUser user = this.registerUserRepository.findByUsername(username);
        // System.out.println(user);
        if (user == null) {

            throw new UsernameNotFoundException("No user found !!");
        }

        return user;
    }

}
