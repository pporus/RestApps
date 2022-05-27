package com.example.demo;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerApps {
	

	@GetMapping("/")
	public String  get()
	{
		return "Welcome to Jenkins RestApps  "+new Date();
	}

}
