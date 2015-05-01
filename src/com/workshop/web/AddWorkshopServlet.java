package com.workshop.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.workshop.dao.Workshop;
import com.workshop.dao.WorkshopDao;



public class AddWorkshopServlet extends HttpServlet{
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
		String type = req.getParameter("type");
		String bTime = req.getParameter("bTime");
		String manufacturer = req.getParameter("manufacturer");
		String principal = req.getParameter("principal");

		Workshop u = new Workshop();
		u.setID(ID);
		u.setType(type);
		u.setbTime(bTime);
		u.setManufacturer(manufacturer);
		u.setPrincipal(principal);
		
		WorkshopDao dao = new WorkshopDao();
		boolean flag = dao.insert(u);
		System.out.println(flag);
		
		if(flag){
			req.getRequestDispatcher("Workshop/success.html").forward(req, resp);
		}else{
			req.getRequestDispatcher("Workshop/error.html").forward(req, resp);
		}
		
	}
}
