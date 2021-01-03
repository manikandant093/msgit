package com.micro_service_1.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro_service_1.app.models.Response;

@RestController
@RequestMapping(value = "/mic_ser_1")
public class micro_service_1_controller {
	
	@Autowired
	Response reponse;
	
	@GetMapping(value = "/getMessage")
	public String getMsg() {
		return "Hello from Micro Service";
	}
	
	@GetMapping(value = "/getAnotherMsg")
	public Response getAnotherMsg() {
		return reponse;
	}
	
	
	

}
