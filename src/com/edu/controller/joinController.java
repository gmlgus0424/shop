package com.edu.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.edu.dao.UserDao;
import com.edu.dto.UserDto;

public class joinController extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	RequestDispatcher rd = req.getRequestDispatcher("/signUp.jsp");
	rd.forward(req, resp);
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	req.setCharacterEncoding("UTF-8");
	String id = req.getParameter("id");
	String pwd = req.getParameter("pwd");
	String name = req.getParameter("name");
	String email = req.getParameter("email");
	System.out.println("join1");
	UserDao mDao = UserDao.getInstance();
	UserDto mDto = new UserDto();
	mDto.setId(id);
	mDto.setPwd(pwd);
	mDto.setName(name);
	mDto.setEmail(email);
	int joinResult = mDao.join(mDto);
	System.out.println("join2");
	
	if (joinResult == 1) {
		req.setAttribute("joinResult", joinResult);
		HttpSession session = req.getSession();
		session.setAttribute("sessionID", id);
		RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
		rd.forward(req, resp);
	} else {
		req.setAttribute("joinResult", 0);
		RequestDispatcher rd = req.getRequestDispatcher("/signUp.jsp");
		rd.forward(req, resp);
	}
}

}