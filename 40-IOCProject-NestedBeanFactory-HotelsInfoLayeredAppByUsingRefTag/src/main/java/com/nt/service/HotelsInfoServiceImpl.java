


package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.HotelsInfoBo;
import com.nt.dao.HotelsInfoDAO;
import com.nt.dto.HotelsInfoDTO;

public class HotelsInfoServiceImpl implements HotelsInfoService {
	private HotelsInfoDAO dao=null;
	
	public HotelsInfoServiceImpl(HotelsInfoDAO dao) {
		System.out.println("HotelsInfoServiceImpl.HotelsInfoServiceImpl()");
		this.dao = dao;
	}

	public List<HotelsInfoDTO> findHotelsByCity(String[] city) throws Exception {
		List<HotelsInfoBo> listBO=null;
		List<HotelsInfoDTO> listDTO=new ArrayList();
		
		//convert city[] as required query condition
		StringBuffer sb=new StringBuffer("('");
		for(int i=0;i<city.length;i++) {
			if(i==city.length-1)
				sb.append(city[i]+"')");
			else
				sb.append(city[i]+"','");
			
			//('mumbai','pune','hyderabad')
		}
		//use DAO 
		listBO=dao.searchHotelsByCity(sb.toString());
		
		//convert listBO to ListDTO
		listBO.forEach(bo->{
			HotelsInfoDTO dto=new HotelsInfoDTO();
			BeanUtils.copyProperties(bo, dto);
			dto.setSrNo(listDTO.size()+1);
			listDTO.add(dto);
		});
		return listDTO;
	}	
}