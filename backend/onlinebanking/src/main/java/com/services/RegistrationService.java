package com.services;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.exception.UserFoundException;
import com.model.Registration;
import com.repository.RegistrationRepository;

@Service
public class RegistrationService implements UserDetailsService {

	@Autowired
	private RegistrationRepository registrationRepository;

	public RegistrationService(RegistrationRepository registrationRepository) {
		this.registrationRepository = registrationRepository;
	}

	public String generateRandomNumber() {
		Random rand = new Random();
		int randno = rand.nextInt(10000000, 99999999);

		String s = String.valueOf(randno);

		return s;
	}

	public Registration addCustomers(Registration customers) throws Exception {
		Registration customer = this.registrationRepository.findByUsername(customers.getUsername());
		if (customer != null) {
			// System.out.println("User is already there !!");
			throw new UserFoundException();
		} else {
			customer = this.registrationRepository.save(customers);
		}

		return customer;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Registration user = this.registrationRepository.findByUsername(username);
		if (user == null) {

			throw new UsernameNotFoundException("No user found !!");
		}

		return user;
	}

}
