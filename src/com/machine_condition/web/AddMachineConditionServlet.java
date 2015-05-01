package com.machine_condition.web;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.machine_condition.dao.MachineCondition;
import com.machine_condition.dao.MachineConditionDao;



public class AddMachineConditionServlet extends HttpServlet{
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
		
		String machineID = req.getParameter("machineID");
		String time = req.getParameter("time");
		String moveTime = req.getParameter("moveTime");
		String restTime = req.getParameter("restTime");
		String displacement = req.getParameter("displacement");
		String sTime = req.getParameter("sTime");
		String condition = req.getParameter("condition");

		MachineCondition u = new MachineCondition();
		u.setMachineID(machineID);
		u.setTime(time);
		u.setMoveTime(moveTime);
		u.setRestTime(restTime);
		u.setDisplacement(displacement);
		u.setsTime(sTime);
		u.setCondition(condition);
		
		MachineConditionDao dao = new MachineConditionDao();
		boolean flag = dao.insert(u);
		System.out.println(flag);
		
		if(flag){
			req.getRequestDispatcher("MachineCondition/success.html").forward(req, resp);
		}else{
			req.getRequestDispatcher("MachineCondition/error.html").forward(req, resp);
		}
		
	}
}
