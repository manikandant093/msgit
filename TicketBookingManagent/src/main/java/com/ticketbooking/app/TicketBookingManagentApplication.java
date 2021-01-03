package com.ticketbooking.app;

import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ticketbooking.app.entites.Ticket;
import com.ticketbooking.app.service.TicketBookingService;

@SpringBootApplication
public class TicketBookingManagentApplication implements CommandLineRunner {
	@Autowired
	private TicketBookingService ticketBookingService;

	@Autowired
	private DataSource ds;

	public static void main(String[] args) {

		// To get the instance of a class from a container
//		ConfigurableApplicationContext confAppCont = SpringApplication.run(TicketBookingManagentApplication.class,
//				args);
//		TicketBookingService ticketService = confAppCont.getBean("ticketBookingService", TicketBookingService.class);
		SpringApplication.run(TicketBookingManagentApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		if(ticketBookingService!=null)
		{
			System.out.println("not null");
		}
		Ticket t = new Ticket();
		t.setPassengerName("Manisurya");
		t.setBookingDate(new Date());
		t.setDestStation("Erode");
		t.setSourceStation("Chennai");
		t.setEmail("manikandanssrk@gmail.com");
		ticketBookingService.createTicket(t);
		System.out.println("Data Source : " + ds);
		
		Ticket t1 = new Ticket();
		t1.setPassengerName("Manisurya");
		t1.setBookingDate(new Date());
		t1.setDestStation("Erode");
		t1.setSourceStation("Chennai");
		t1.setEmail("manikandanssrk@gmail.com");
		ticketBookingService.createTicket(t1);

	}

}
