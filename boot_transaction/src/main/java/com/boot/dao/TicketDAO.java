package com.boot.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

import com.boot.dto.*;

public interface TicketDAO {
	public void insertCard(TicketDTO ticketDTO);//카드결제
	public void insertTicket(TicketDTO ticketDTO);//티켓수령
	
}















