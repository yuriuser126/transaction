package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.dto.TicketDTO;
import com.boot.service.TicketService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class TicketController {

	@Autowired
	private TicketService service;

//티켓 보려고 write view사용
	@RequestMapping("/buy_ticket")
	public String buy_ticket() {
		log.info("@# buy_ticket()");
		
		return "buy_ticket";
	}

	
//visualstudio에서 만든거 jsp에서 오는거 
	@RequestMapping("/buy_ticket_card")
		public String write(TicketDTO ticketDTO, Model model) {
		log.info("@# buy_ticket_card()");
		
		log.info("@# TicketDTO(01)->"+ticketDTO);
		//"@# TicketDTO 01(aaa, 4 , 0)->"
		ticketDTO.setCountnum(ticketDTO.getAmount());
		log.info("@# TicketDTO(02)->"+ticketDTO);
		//작업 후"@# TicketDTO 02 ( aaa, 4 , 4)->"
		
		
		service.buyTicket(ticketDTO);
		
		model.addAttribute("ticketInfo",ticketDTO);
		
		
		return "buy_ticket_end";
	}
	
	
	

}







