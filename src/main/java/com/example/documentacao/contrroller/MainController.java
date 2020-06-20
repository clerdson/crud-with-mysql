package com.example.documentacao.contrroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.documentacao.model.User;
import com.example.documentacao.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class MainController {

	@Autowired
	UserRepository userRepository;
	
	@GetMapping(path="/user")
	public List<User> getUsers() {
		return userRepository.findAll();
	}
}
