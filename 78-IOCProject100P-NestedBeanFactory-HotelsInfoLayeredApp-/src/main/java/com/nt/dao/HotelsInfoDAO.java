package com.nt.dao;

import java.util.List;

import com.nt.bo.HotelsInfoBo;

public interface HotelsInfoDAO {
	List<HotelsInfoBo> searchHotelsByCity(String cond)throws Exception;
}
