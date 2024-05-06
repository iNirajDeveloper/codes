package com.tssm.bscoer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class demo1 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int hours=0;
		response.setContentType("text/html");

		PrintWriter pw=response.getWriter();

		String userName=request.getParameter("userName");
		String password=request.getParameter("password");


		pw.println( "<h4>User Name: "+userName+"</center></h4><br>");
		pw.println( "<h4> Password: "+password+"</center></h4>");

		pw.close();

	}

}

