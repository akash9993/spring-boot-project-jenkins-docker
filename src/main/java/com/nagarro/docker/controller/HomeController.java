package com.nagarro.docker.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class HomeController {
	@GetMapping
	public Map<String, Object> getValues() {
		Map<String, Object> data = new HashMap<>();
		data.put("message", "Docker Assignment -> Just one Controller is enough with Get Endpoint");
		data.put("technology", Arrays.asList("Java", "spring boot", "docker"));
		data.put("code", 1234);
		return data;
	}
}
