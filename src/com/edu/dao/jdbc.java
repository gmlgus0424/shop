package com.edu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc {
	public static Connection getConnetion() throws SQLException{
		Connection conn= null;
		
		try {Class.forName("com.mysql.jdbc.Driver");
		conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","1234");
			System.out.println("DB성공");
		}catch(Exception e)
		{
		System.out.println("DB실패");
		e.printStackTrace();
		}finally {
			
		}
		return conn;
	}
}

