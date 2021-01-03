package com.ticketbooking.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticketbooking.app.dao.TicketBookingDAO;
import com.ticketbooking.app.entites.Ticket;

@Service
public class TicketBookingService {
	@Autowired
	private TicketBookingDAO ticketDAO;

	public Ticket createTicket(Ticket ticket) {
		return ticketDAO.save(ticket);
	}

	public Optional<Ticket> getTicketByID(Integer ticketID) {
		return ticketDAO.findById(ticketID);

	}

	public boolean deleteTicketByID(Integer id) {
		try {
			ticketDAO.deleteById(id);
			return true;
		} catch (Exception e) {
			System.out.println("Could not delete : " + e.getMessage());
			return false;
		}
	}

	public Ticket updateEmail(Integer id, String email) {
		Ticket ticketfromDB = ticketDAO.findById(id).isPresent() ? ticketDAO.findById(id).get() : null;
		if (ticketfromDB != null) {
			ticketfromDB.setEmail(email);
		}
		return ticketfromDB;
	}

	public Iterable<Ticket> listAll() {
		return ticketDAO.findAll();
	}

}
