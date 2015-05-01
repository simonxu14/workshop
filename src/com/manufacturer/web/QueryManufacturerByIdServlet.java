package com.manufacturer.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manufacturer.dao.Manufacturer;
import com.manufacturer.dao.ManufacturerDao;

public class QueryManufacturerByIdServlet extends HttpServlet {

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
		ManufacturerDao dao = new ManufacturerDao();
		Manufacturer u = dao.queryById(ID);
		dao.delete(ID);
		request.setAttribute("user", u);
		request.getRequestDispatcher("Manufacturer/updateManufacturer.jsp").forward(request, response);
		
	}

}
