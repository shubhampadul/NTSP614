package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.nt.bo.HotelsInfoBo;

public class HotelsInfoDAOImpl implements HotelsInfoDAO {
	private DataSource ds=null;
	
	public HotelsInfoDAOImpl(DataSource ds) {
		System.out.println("HotelsInfoDAOImpl.HotelsInfoDAOImpl()");
		this.ds = ds;
	}
	
	public List<HotelsInfoBo> searchHotelsByCity(String cond) throws Exception {
		 Connection con=null;
		 PreparedStatement ps=null;
		 ResultSet         rs=null;
		 List<HotelsInfoBo> listBO=null;
		 String HOTELS_INFO_QUERY="SELECT REGNO,HNAME,TYPE,ADDRESS,LOCATION,CHECKIN,CHECKOUT FROM HOTELS_INFO WHERE LOCATION IN"+cond;
		//System.out.println(HOTELS_INFO_QUERY);
		 try {
			//get connection pooled
			con=ds.getConnection();
			
			//create PrepareStatement
			if(con!=null)
//				ps=con.prepareStatement("SELECT REGNO,HNAME,TYPE,ADDRESS,LOCATION,CHECKIN,CHECKOUT FROM HOTELS_INFO WHERE LOCATION IN"+cond);
				ps=con.prepareStatement(HOTELS_INFO_QUERY);
			//execute the query
			rs=ps.executeQuery();
			
			listBO =new ArrayList<HotelsInfoBo>();
			
			//copy resultSet into bo obje
			while(rs.next()) {
				HotelsInfoBo bo=new HotelsInfoBo();
				bo.setRegNo(rs.getLong(1));
				bo.setHname(rs.getString(2));
				bo.setType(rs.getString(3));
				bo.setAddrs(rs.getString(4));
				bo.setLoc(rs.getString(5));
				bo.setCheckIn(rs.getString(6));
				bo.setCheckOut(rs.getString(7));
				//set each bo to listBO
				listBO.add(bo);
			}
			
		}
		catch(SQLException se) {
			System.out.println(se);
			throw se;	
		}
		catch(Exception e) {
			System.out.println(e);
			throw e;	
		}
		finally {
			//close connections
			try {
				if(con!=null)
				con.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}
			try {
				if(ps!=null)
				ps.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}
			try {
				if(rs!=null)
				rs.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
		}
		return listBO;
	}

}
