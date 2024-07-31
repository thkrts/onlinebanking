package com.model;

import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Document("RegisterUser")
public class RegisterUser implements UserDetails {

    @Id
    private String username;

    private String password;
    private String confirmpassword;
    private String transpassword;
    private String confirmtranspassword;
    private String role;
    // private int otp;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public RegisterUser(String username, String password, String confirmpassword, String transpassword,
            String confirmtranspassword, String role) {
        this.username = username;
        this.password = password;
        this.confirmpassword = confirmpassword;
        this.transpassword = transpassword;
        this.confirmtranspassword = confirmtranspassword;
        this.role = role;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmpassword() {
        return this.confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }

    public String getTranspassword() {
        return this.transpassword;
    }

    public void setTranspassword(String transpassword) {
        this.transpassword = transpassword;
    }

    public String getConfirmtranspassword() {
        return this.confirmtranspassword;
    }

    public void setConfirmtranspassword(String confirmtranspassword) {
        this.confirmtranspassword = confirmtranspassword;
    }

}
