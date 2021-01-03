package com.ticketbooking.app.entites;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TicketDetailFetcher {
	
	private Integer tickerID;

	public Integer getTickerID() {
		return tickerID;
	}

	public void setTickerID(Integer tickerID) {
		this.tickerID = tickerID;
	}
	

}
