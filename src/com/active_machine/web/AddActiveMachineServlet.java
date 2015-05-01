package com.active_machine.web;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.active_machine.dao.ActiveMachine;
import com.active_machine.dao.ActiveMachineDao;



public class AddActiveMachineServlet extends HttpServlet{
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
		String time = req.getParameter("time");
		String moveTime = req.getParameter("moveTime");
		String restTime = req.getParameter("restTime");
		String displacement = req.getParameter("displacement");
		String sTime = req.getParameter("sTime");
		String machineID = req.getParameter("machineID");

		ActiveMachine u = new ActiveMachine();
		u.setID(ID);
		u.setTime(time);
		u.setMoveTime(moveTime);
		u.setRestTime(restTime);
		u.setDisplacement(displacement);
		u.setsTime(sTime);
		u.setMachineID(machineID);
		
		ActiveMachineDao dao = new ActiveMachineDao();
		boolean flag = dao.insert(u);
		System.out.println(flag);
		
		if(flag){
			req.getRequestDispatcher("ActiveMachine/success.html").forward(req, resp);
		}else{
			req.getRequestDispatcher("ActiveMachine/error.html").forward(req, resp);
		}
		
	}
}
