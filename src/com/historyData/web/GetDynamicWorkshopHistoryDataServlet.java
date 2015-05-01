package com.historyData.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.DBUtils;
import com.historyData.dao.DynamicWorkshop;
import com.historyData.dao.DynamicWorkshopDataOperator;

@SuppressWarnings("serial")
public class GetDynamicWorkshopHistoryDataServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String workshopID = "";
		if(!(request.getParameter("workshopID").equals(""))){
			workshopID = request.getParameter("workshopID");
		}
		
		DynamicWorkshopDataOperator dw = new DynamicWorkshopDataOperator(workshopID);
		dw.openDB();
		dw.findDynamicWorkshopData();
		dw.closeDB();
		out.println(dw.getSendDynamicWorkshopDataToClient());

	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}
}
