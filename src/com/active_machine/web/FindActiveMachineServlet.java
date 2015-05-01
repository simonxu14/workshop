package com.active_machine.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.active_machine.dao.ActiveMachine;
import com.active_machine.dao.ActiveMachineDao;

public class FindActiveMachineServlet extends HttpServlet {
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
		ActiveMachineDao dao = new ActiveMachineDao();
		ArrayList<ActiveMachine> users = dao.find();
		System.out.println(users);
		request.setAttribute("users", users);
		request.getRequestDispatcher("ActiveMachine/showActiveMachine.jsp").forward(request, response);
	}
}
