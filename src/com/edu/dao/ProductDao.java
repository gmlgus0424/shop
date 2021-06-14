package com.edu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductDao {
	private static ProductDao insProdDao= new ProductDao();
	
	private ProductDao() {
		
	}
	public static ProductDao getInstance() {
		return insProdDao;
	}
	
	

public Connection connect() 
{
	Connection conn= null;
	try
	{
Class.forName("com.mysql.jdbc.Driver");
conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","1234");
}catch(Exception e)
	{
	System.out.print("MDAO:connect"+e);
	}
	return conn;
}
public void close(Connection conn, PreparedStatement pstmt )
{
	if(pstmt != null)
	{
		try {
			pstmt.close();
		}catch(Exception e) {
			System.out.print("Pstmt close error"+e);
		}
	if(conn != null)
	{
		try {
			conn.close();
		}catch(Exception e) {
			System.out.print("Conn close error"+e);
		}
	}
}
}
public void close(Connection conn, PreparedStatement pstmt, ResultSet rs)
{ 
	if(rs!=null)
	{
		try
		{
			rs.close();
		}catch(Exception e) {
			System.out.print("rs close error"+e);
}
}
	close(conn,pstmt);	
}

}
}
