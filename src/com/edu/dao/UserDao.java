package com.edu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.edu.dao.UserDao;
import com.edu.dto.UserDto;



import com.edu.dao.UserDao;

public class UserDao {
	private static UserDao dao=new UserDao();
	private UserDao() {}
	public static UserDao getInstance() {
		return dao;
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

		public int join(UserDto uDto) {
			Connection conn= null;
			PreparedStatement pstmt=null;
			try
			{
				conn=connect();
				pstmt= conn.prepareStatement("insert into user values (?,?,?,?,?);");
				pstmt.setString(1, uDto.getId());
				pstmt.setString(2, uDto.getPwd());
				pstmt.setString(3, uDto.getName());
				pstmt.setString(4, uDto.getEmail());
				pstmt.setString(5, uDto.getPhone());
			    pstmt.executeUpdate();
				
		}catch(Exception e)
			{
			System.out.print("join error" + e);
			}
			finally
			{
				close(conn,pstmt);
		
			}
			return 0;
	}
		public int login(String id, String pwd) {
			// TODO Auto-generated method stub
		
			Connection conn= null;
			PreparedStatement pstmt=null;
			ResultSet rs= null;
			try
			{
				conn=connect();
				pstmt= conn.prepareStatement("select * from user where id =? and pwd =?;");
				pstmt.setString(1, id);
				pstmt.setString(2, pwd);
				rs=pstmt.executeQuery(); //고정값
				if(rs.next())
				{
					if(rs.getString("pwd").equals(pwd)){
						return 1;
					}else
						return 0;
				}
				
					
		}catch(Exception e)
			{
			System.out.print("login error" + e);
			}
			finally
			{
				close(conn,pstmt,rs);
		
			}

			return -1;
		}
}