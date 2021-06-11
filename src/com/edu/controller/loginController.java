package com.edu.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.edu.dao.UserDao;

public class loginController extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	RequestDispatcher rd=req.getRequestDispatcher("/WebContent/login.jsp");
	rd.forward(req, resp);
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	req.setCharacterEncoding("UTF-8");
	String id = req.getParameter("id");
	String pwd = req.getParameter("pwd");
	
	UserDao mDao = UserDao.getInstance();
	int loginResult = mDao.login(id, pwd);
	
	if (loginResult == 1) {
		req.setAttribute("loginResult", loginResult);
		HttpSession session = req.getSession();
		session.setAttribute("sessionID", id);
		RequestDispatcher rd = req.getRequestDispatcher("/WebContent/index.jsp");
		rd.forward(req, resp);
	} else {
		req.setAttribute("loginResult", loginResult);
		RequestDispatcher rd = req.getRequestDispatcher("/WebContent/login.jsp");
		rd.forward(req, resp);
	}
	
}

}
	}
}
