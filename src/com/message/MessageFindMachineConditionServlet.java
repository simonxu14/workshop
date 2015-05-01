package com.message;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.message.MachineCondition;
import com.message.MachineConditionDao;

public class MessageFindMachineConditionServlet extends HttpServlet {
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
		MachineConditionDao dao = new MachineConditionDao();
		ArrayList<MachineCondition> users = dao.find();
		System.out.println(users);
		request.setAttribute("users", users);
		request.getRequestDispatcher("Message/MachineConditionMessage.jsp").forward(request, response);
	}
}
