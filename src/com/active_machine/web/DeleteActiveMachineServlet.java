package com.active_machine.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.active_machine.dao.ActiveMachineDao;

public class DeleteActiveMachineServlet extends HttpServlet {

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
		ActiveMachineDao dao = new ActiveMachineDao();
		if(dao.delete(ID)){
			request.setAttribute("msg","É¾³ý³É¹¦");
		}else{
			request.setAttribute("msg","É¾³ýÊ§°Ü");
		}
		request.getRequestDispatcher("FindActiveMachineServlet").forward(request, response);
	}

}
