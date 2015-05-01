package com.message;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MessageFindWorkshopServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		WorkshopDao dao1 = new WorkshopDao();
		
		ArrayList<Workshop> users1 = dao1.find();
		
		System.out.println(users1);
		
		request.setAttribute("users1", users1);
		
		request.getRequestDispatcher("Message/WorkshopMessage.jsp").forward(request, response);
	}
}
