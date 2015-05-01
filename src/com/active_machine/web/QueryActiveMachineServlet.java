package com.active_machine.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.active_machine.dao.ActiveMachine;
import com.active_machine.dao.ActiveMachineDao;

public class QueryActiveMachineServlet extends HttpServlet {

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
		
		String ID = request.getParameter("ID");
		String time = request.getParameter("time");
		String moveTime = request.getParameter("moveTime");
		String restTime = request.getParameter("restTime");
		String displacement = request.getParameter("displacement");
		String sTime = request.getParameter("sTime");
		String machineID = request.getParameter("machineID");

		ActiveMachine u = new ActiveMachine();
		
		u.setID(ID);
		u.setTime(time);
		u.setMoveTime(moveTime);
		u.setRestTime(restTime);
		u.setDisplacement(displacement);
		u.setsTime(sTime);
		u.setMachineID(machineID);
		
		ActiveMachineDao dao = new ActiveMachineDao();
		ArrayList<ActiveMachine> users = dao.query(u);

		System.out.println(users);
		request.setAttribute("users", users);
		request.getRequestDispatcher("ActiveMachine/showActiveMachine.jsp").forward(request, response);
	}
}
