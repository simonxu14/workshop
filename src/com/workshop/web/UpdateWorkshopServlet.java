package com.workshop.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.workshop.dao.Workshop;
import com.workshop.dao.WorkshopDao;

public class UpdateWorkshopServlet extends HttpServlet {
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
		String type = request.getParameter("type");
		String bTime = request.getParameter("bTime");
		String manufacturer = request.getParameter("manufacturer");	
		String principal = request.getParameter("principal");

		Workshop u = new Workshop();
		u.setID(ID);
		u.setType(type);
		u.setbTime(bTime);
		u.setManufacturer(manufacturer);
		u.setPrincipal(principal);
		
		WorkshopDao dao = new WorkshopDao();
		if(dao.insert(u)){
			request.setAttribute("msg","修改成功");
		}else{
			request.setAttribute("msg","修改失败");
		}
		request.getRequestDispatcher("FindWorkshopServlet").forward(request, response);
	}

}





