package com.nt.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.PassangerResBo;


@Repository("passDao")
public class PassangerResDaoImpl implements PassangerResDao {
	private static final String INSERT_PSNGR_DETAILS="INSERT INTO TICKETRESDETAILS VALUES(pas_seq.NEXTVAL,?,?,?,?)";
	
	@Autowired
	JdbcTemplate jt;
	
	
	@Override
	public int[] insertPassangerData(List<PassangerResBo> listBo) {
		int[] result;
		   result= jt.batchUpdate(INSERT_PSNGR_DETAILS, new BatchPreparedStatementSetter() {
			
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				ps.setString(1, listBo.get(i).getPname());
				ps.setString(2, listBo.get(i).getSource());
				ps.setString(3,listBo.get(i).getDest());
				ps.setInt(4, listBo.get(i).getFare());
			}
			public int getBatchSize() {
				return listBo.size();
			}
		});
		return result;
	}
}