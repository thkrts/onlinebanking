package com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.RegisterUser;

@Repository
public interface RegisterUserRepository extends MongoRepository<RegisterUser, String> {

    // @Query("{'adhaarno': ?0}")
    // RegisterUser findByAdhaarno(String adhaarno);

    public RegisterUser findByUsername(String username);

    // // @Query("{'adhaarno': ?0},{'pass': ?1}")
    // // RegisterUser findByUserIdAndPassword(String userId, String password);

}
