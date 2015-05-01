package com.dynamic_workshop.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dynamic_workshop.dao.DynamicWorkshop;
import com.dynamic_workshop.dao.DynamicWorkshopDao;

public class UpdateDynamicWorkshopServlet extends HttpServlet {
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
		String workshopID = request.getParameter("workshopID");
		String temperature = request.getParameter("temperature");
		String humidity = request.getParameter("humidity");
		String noise = request.getParameter("noise");	

		DynamicWorkshop u = new DynamicWorkshop();
		
		u.setID(ID);
		u.setWorkshopID(workshopID);
		u.setTemperature(temperature);
		u.setHumidity(humidity);
		u.setNoise(noise);
		
		DynamicWorkshopDao dao = new DynamicWorkshopDao();
		if(dao.insert(u)){
			request.setAttribute("msg","修改成功");
		}else{
			request.setAttribute("msg","修改失败");
		}
		request.getRequestDispatcher("FindDynamicWorkshopServlet").forward(request, response);
	}

}





