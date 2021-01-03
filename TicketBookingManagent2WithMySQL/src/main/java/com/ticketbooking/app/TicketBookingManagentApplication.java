package com.ticketbooking.app;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ticketbooking.app.service.TicketBookingService;

@SpringBootApplication
public class TicketBookingManagentApplication {
	@Autowired
	private TicketBookingService ticketBookingService;

	public static void main(String[] args) {

		SpringApplication.run(TicketBookingManagentApplication.class, args);

	}

}
