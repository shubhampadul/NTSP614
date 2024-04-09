package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.dto.HotelsInfoDTO;
import com.nt.service.HotelsInfoService;

@Controller("controller")
public class MainController {
	@Autowired
	private HotelsInfoService service;

	public List<HotelsInfoDTO> fetchHotelsByCity(String[] city)throws Exception{
		List<HotelsInfoDTO> listDTO=null;
		
		//use service
		listDTO=service.findHotelsByCity(city);
		return listDTO;
	}
}