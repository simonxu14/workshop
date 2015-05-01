package com.manufacturer.web;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manufacturer.dao.Manufacturer;
import com.manufacturer.dao.ManufacturerDao;


public class AddManufacturerServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String ID = req.getParameter("ID");
		String name = req.getParameter("name");
		String principal = req.getParameter("principal");
		String phone = req.getParameter("phone");
		String address = req.getParameter("address");

		Manufacturer u = new Manufacturer();
		u.setID(ID);
		u.setName(name);
		u.setPrincipal(principal);
		u.setPhone(phone);
		u.setAddress(address);
		
		ManufacturerDao dao = new ManufacturerDao();
		boolean flag = dao.insert(u);
		System.out.println(flag);
		
		if(flag){
			req.getRequestDispatcher("Manufacturer/success.html").forward(req, resp);
		}else{
			req.getRequestDispatcher("Manufacturer/error.html").forward(req, resp);
		}
		
	}
}
