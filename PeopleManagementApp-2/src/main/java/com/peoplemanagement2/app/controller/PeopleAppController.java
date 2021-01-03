package com.peoplemanagement2.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/PeopleApp")
public class PeopleAppController {

	@GetMapping
	public String getHello() {
		return "Hello Mani";
	}
	
	@GetMapping(value = "/getHi")
	public String getHi()
	{
		return "hi mani";
	}
	
}
