package com.machine.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.machine.dao.Machine;
import com.machine.dao.MachineDao;

public class QueryMachineByIdServlet extends HttpServlet {

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
		MachineDao dao = new MachineDao();
		Machine u = dao.queryById(ID);
		dao.delete(ID);
		request.setAttribute("user", u);
		request.getRequestDispatcher("Machine/updateMachine.jsp").forward(request, response);
		
	}

}
