package com.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Registration;
import com.services.RegistrationService;

@RestController
@RequestMapping("/registration")
@CrossOrigin("*")
public class RegistrationController {

	@Autowired
	private RegistrationService registrationService;

	// @GetMapping
	// public ResponseEntity<List<Registration>> getAllCustomers(){
	// return ResponseEntity.ok(registrationService.getAllCustomers());
	// }

	@PostMapping
	public Registration addCustomers(@RequestBody Registration customers) throws Exception {
		customers.setAccountno(registrationService.generateRandomNumber());
		return registrationService.addCustomers(customers);
	}

	@GetMapping("/current-user-details")
	public Registration getCurrentUser(Principal principal) {
		// System.out.println(principal.getName());
		return ((Registration) this.registrationService.loadUserByUsername(principal.getName()));

	}

}
