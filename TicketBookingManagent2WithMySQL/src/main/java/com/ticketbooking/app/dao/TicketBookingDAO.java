package com.ticketbooking.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.ticketbooking.app.entites.Ticket;

public interface TicketBookingDAO extends CrudRepository<Ticket, Integer> {

}
