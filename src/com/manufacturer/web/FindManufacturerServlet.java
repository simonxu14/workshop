package com.manufacturer.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manufacturer.dao.Manufacturer;
import com.manufacturer.dao.ManufacturerDao;

public class FindManufacturerServlet extends HttpServlet {
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
		ManufacturerDao dao = new ManufacturerDao();
		ArrayList<Manufacturer> users = dao.find();
		System.out.println(users);
		request.setAttribute("users", users);
		request.getRequestDispatcher("Manufacturer/showManufacturer.jsp").forward(request, response);
	}
}
