package com.ticketbooking.app.controller;

import org.springframework.http.MediaType;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.hibernate.validator.constraints.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ticketbooking.app.entites.Ticket;
import com.ticketbooking.app.service.TicketBookingService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")   //this is to allow then accessing from cross orgin side like accessing from angular UI
@RequestMapping(value = "/api/tickets")

public class TicketBookingController{
	@Autowired
	private TicketBookingService ticketBookingService;
	
	private static final String PATH= "/error";

	@RequestMapping(value = "/listAllTickets")  //By default REQUESTMAPPING uses get method..but we can hit this resource with post also
	public Iterable<Ticket> listAll() {
		return ticketBookingService.listAll();
	}

	@PostMapping(value = "/createTicket")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return ticketBookingService.createTicket(ticket);
	}

	@GetMapping(value = "/ticket/{ticketID}")
	public Ticket getTicketById(@PathVariable("ticketID") Integer ticketID) {
		boolean isPresent = ticketBookingService.getTicketByID(ticketID).isPresent();
		return isPresent ? ticketBookingService.getTicketByID(ticketID).get() : null;
	}

	@DeleteMapping(value = "/deleteTicket/{ticketID}")
	public void deleteTicketById(@PathVariable("ticketID") Integer ticketID) {
		ticketBookingService.deleteTicketByID(ticketID);
	}

	@PutMapping(value = "/updateEmail/{ticketID}/{email:.+}")
	public Ticket updateTicket(@PathVariable("ticketID") Integer id, @PathVariable("email") String email) {
		return ticketBookingService.updateEmail(id, email);
	}

	@RequestMapping(value = PATH,method = RequestMethod.GET)
	public String getErrorMessage(){
		return "Requested is not found. Sorry!";
		
	}

}
