package spring.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import spring.security.entity.User;
import spring.security.repository.UserRepository;


@RestController
public class UserController {
	@Autowired
	private UserRepository userRepo;
	@PostMapping("/register")
	public User register(@RequestBody User user) {
		return userRepo.save(user);
	}
	
	@GetMapping("path")
	public String getMethodName(@RequestParam String param) {
		return new String();
	}
	
}
