package com.machine.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.machine.dao.Machine;
import com.machine.dao.MachineDao;

public class UpdateMachineServlet extends HttpServlet {
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
		String mNumber = request.getParameter("mNumber");
		String sNumber = request.getParameter("sNumber");
		String workshop = request.getParameter("workshop");
		String manufacturer = request.getParameter("manufacturer");
		String pDate = request.getParameter("pDate");
		String workerID = request.getParameter("workerID");		

		Machine u = new Machine();
		u.setID(ID);
		u.setType(type);
		u.setmNumber(mNumber);
		u.setsNumber(sNumber);
		u.setWorkshop(workshop);
		u.setManufacturer(manufacturer);
		u.setpDate(pDate);
		u.setWorkerID(workerID);
		
		MachineDao dao = new MachineDao();
		if(dao.insert(u)){
			request.setAttribute("msg","修改成功");
		}else{
			request.setAttribute("msg","修改失败");
		}
		request.getRequestDispatcher("FindMachineServlet").forward(request, response);
	}

}





