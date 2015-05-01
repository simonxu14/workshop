package com.machine.web;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.machine.dao.Machine;
import com.machine.dao.MachineDao;



public class AddMachineServlet extends HttpServlet{
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
		String mNumber = req.getParameter("mNumber");
		String sNumber = req.getParameter("sNumber");
		String workshop = req.getParameter("workshop");
		String manufacturer = req.getParameter("manufacturer");
		String pDate = req.getParameter("pDate");
		String workerID = req.getParameter("workerID");

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
		boolean flag = dao.insert(u);
		System.out.println(flag);
		
		if(flag){
			req.getRequestDispatcher("Machine/success.html").forward(req, resp);
		}else{
			req.getRequestDispatcher("Machine/error.html").forward(req, resp);
		}
		
	}
}
