package com.boot.service;

import com.boot.dto.TicketDTO;

public interface TicketService {
	
	public void buyTicket(TicketDTO ticketDTO);//서비스는 한개만 한꺼번에처리
	
	
}
