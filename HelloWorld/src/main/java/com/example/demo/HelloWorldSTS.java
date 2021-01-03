package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldSTS {

	@GetMapping(value = "/helloFromSTS")
	public String getHello() {
		return "Hello from STS!!!";
	}
}
