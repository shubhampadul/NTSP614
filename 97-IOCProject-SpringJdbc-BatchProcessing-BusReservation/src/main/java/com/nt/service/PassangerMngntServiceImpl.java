package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.PassangerResBo;
import com.nt.dao.PassangerResDao;
import com.nt.dto.PassangerResDto;

@Service("passService")
public class PassangerMngntServiceImpl implements PassangerMngntService{
	
	@Autowired
	private PassangerResDao dao;

	@Override
	public String passangerReservation(List<PassangerResDto> listDto) {
		int[] result;
		List<PassangerResBo> listBo=new ArrayList();
		//convert listDto to listBo
		listDto.forEach(dto->{
			PassangerResBo bo=new PassangerResBo();
			BeanUtils.copyProperties(dto, bo);
			listBo.add(bo);
		});
		result=dao.insertPassangerData(listBo);
		if(result!=null){
			return "Reservation Succeeded";
		}
		else {
			return "Reservation Failed";
		}
	}

}
