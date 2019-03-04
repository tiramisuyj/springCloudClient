package com.example.springCloudClient.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.springCloudClient.user.entity.User;

/** 
* @author yj 
* @date 2019-03-04 
*/
@RestController
public class MovieController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/user/{id}")
	public User findById(@PathVariable Long id) {
		return restTemplate.getForObject("http://localhost:8000/" + id, User.class);
	}

}
