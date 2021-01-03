package com.micro_service_1.app.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class Response {
	
	@Value("Hi am from value annotation")
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Response [message=" + message + "]";
	}
	
	
	

}
