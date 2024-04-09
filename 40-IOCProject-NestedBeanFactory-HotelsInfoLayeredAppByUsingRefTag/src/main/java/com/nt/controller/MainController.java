package com.nt.controller;

import java.util.List;

import com.nt.dto.HotelsInfoDTO;
import com.nt.service.HotelsInfoService;

public class MainController {
	private HotelsInfoService service;

	public MainController(HotelsInfoService service,String name) {
		System.out.println("MainController.MainController()");
		System.out.println(name);
		this.service = service;
	}
	public List<HotelsInfoDTO> fetchHotelsByCity(String[] city)throws Exception{
		List<HotelsInfoDTO> listDTO=null;
		
		//use service
		listDTO=service.findHotelsByCity(city);
		return listDTO;
	}

}
