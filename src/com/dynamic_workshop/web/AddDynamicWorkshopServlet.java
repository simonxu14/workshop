package com.dynamic_workshop.web;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dynamic_workshop.dao.DynamicWorkshop;
import com.dynamic_workshop.dao.DynamicWorkshopDao;



public class AddDynamicWorkshopServlet extends HttpServlet{
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
		String workshopID = req.getParameter("workshopID");
		String temperature = req.getParameter("temperature");
		String humidity = req.getParameter("humidity");
		String noise = req.getParameter("noise");

		DynamicWorkshop u = new DynamicWorkshop();
		u.setID(ID);
		u.setWorkshopID(workshopID);
		u.setTemperature(temperature);
		u.setHumidity(humidity);
		u.setNoise(noise);
		
		DynamicWorkshopDao dao = new DynamicWorkshopDao();
		boolean flag = dao.insert(u);
		System.out.println(flag);
		
		if(flag){
			req.getRequestDispatcher("DynamicWorkshop/success.html").forward(req, resp);
		}else{
			req.getRequestDispatcher("DynamicWorkshop/error.html").forward(req, resp);
		}
		
	}
}
