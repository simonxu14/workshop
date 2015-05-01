package com.dynamic_workshop.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dynamic_workshop.dao.DynamicWorkshop;
import com.dynamic_workshop.dao.DynamicWorkshopDao;

public class QueryDynamicWorkshopByIdServlet extends HttpServlet {

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
		DynamicWorkshopDao dao = new DynamicWorkshopDao();
		DynamicWorkshop u = dao.queryById(ID);
		dao.delete(ID);
		request.setAttribute("user", u);
		request.getRequestDispatcher("DynamicWorkshop/updateDynamicWorkshop.jsp").forward(request, response);
		
	}

}
