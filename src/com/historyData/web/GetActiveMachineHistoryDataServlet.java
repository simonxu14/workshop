package com.historyData.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.historyData.dao.ActiveMachineDataOperator;

@SuppressWarnings("serial")
public class GetActiveMachineHistoryDataServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String machineID = "";
		String timeRequest = "";
		String time_space = "";
		
		machineID = request.getParameter("machineID");
		timeRequest = request.getParameter("timeRequest");
		time_space = request.getParameter("time_space");
		
		System.out.println(machineID);
		System.out.println(timeRequest);
		System.out.println(time_space);
		
		ActiveMachineDataOperator am = new ActiveMachineDataOperator(machineID,timeRequest);
		am.openDB();
		if(time_space == null){	
			am.findActiveMachineData();
		}else{
			int timeSpace = Integer.parseInt(time_space);
			am.findActiveMachineDataByTimeSpace(timeSpace);
		}
		am.closeDB();
		out.println(am.getSendActiveMachineDataToClient());
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}
}
