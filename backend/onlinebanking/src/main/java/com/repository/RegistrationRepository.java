package com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.model.Registration;

@Repository
public interface RegistrationRepository extends MongoRepository<Registration, String> {

    // public Registration findByAccountno(String username);

    public Registration findByUsername(String username);

}
