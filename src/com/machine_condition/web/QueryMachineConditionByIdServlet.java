package com.machine_condition.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.machine_condition.dao.MachineCondition;
import com.machine_condition.dao.MachineConditionDao;

public class QueryMachineConditionByIdServlet extends HttpServlet {

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
		String machineID = request.getParameter("machineID");
		MachineConditionDao dao = new MachineConditionDao();
		MachineCondition u = dao.queryById(machineID);
		dao.delete(machineID);
		request.setAttribute("user", u);
		request.getRequestDispatcher("MachineCondition/updateMachineCondition.jsp").forward(request, response);
		
	}

}
