package com.nt.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {
		
		
		int a=4;
		a=++a + ++a;
		System.out.println(a);
		
		
		/*Connection con = null;

		try {
			// load the jdbc driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// establish the connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			if (con != null)
				System.out.println("connection establish sucessfull");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
	}
}