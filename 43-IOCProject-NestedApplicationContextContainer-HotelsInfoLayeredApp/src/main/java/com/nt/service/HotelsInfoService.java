package com.nt.service;

import java.util.List;

import com.nt.dto.HotelsInfoDTO;

public interface HotelsInfoService {
	List<HotelsInfoDTO> findHotelsByCity(String[] city)throws Exception;
}
