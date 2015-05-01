package com.machine_condition.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.machine_condition.dao.MachineCondition;
import com.machine_condition.dao.MachineConditionDao;

public class UpdateMachineConditionServlet extends HttpServlet {
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

		String machineID = request.getParameter("machineID");
		String time = request.getParameter("time");
		String moveTime = request.getParameter("moveTime");
		String restTime = request.getParameter("restTime");
		String displacement = request.getParameter("displacement");
		String sTime = request.getParameter("sTime");
		String condition = request.getParameter("condition");

		MachineCondition u = new MachineCondition();
		
		u.setMachineID(machineID);
		u.setTime(time);
		u.setMoveTime(moveTime);
		u.setRestTime(restTime);
		u.setDisplacement(displacement);
		u.setsTime(sTime);
		u.setCondition(condition);
		
		MachineConditionDao dao = new MachineConditionDao();
		if(dao.insert(u)){
			request.setAttribute("msg","修改成功");
		}else{
			request.setAttribute("msg","修改失败");
		}
		request.getRequestDispatcher("FindMachineConditionServlet").forward(request, response);
	}

}





