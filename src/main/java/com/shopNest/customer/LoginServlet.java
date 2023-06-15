package com.shopNest.customer;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/log")
public class LoginServlet  extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String uname=req.getParameter("uname");
		String pass=req.getParameter("pass");
		boolean val=Validator.isValid(uname,pass);
		if(val==true && uname.equals("admin")) {
			resp.sendRedirect("admin.jsp");
		}
		else if(val==true) {
			resp.sendRedirect("home.jsp");
		}
		else {
			resp.sendRedirect("login.jsp");
		}
	}
}
