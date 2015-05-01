package com.worker.web;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.worker.dao.Worker;
import com.worker.dao.WorkerDao;



public class AddWorkerServlet extends HttpServlet{
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
		String name = req.getParameter("name");
		String Authority = req.getParameter("Authority");
		String IDCard = req.getParameter("IDCard");
		String profession = req.getParameter("profession");
		String pNumber = req.getParameter("pNumber");
		String sex = req.getParameter("sex");
		String age = req.getParameter("age");
		String address = req.getParameter("address");
		String email = req.getParameter("email");

		Worker u = new Worker();
		u.setID(ID);
		u.setName(name);
		u.setAuthority(Authority);
		u.setIDCard(IDCard);
		u.setProfession(profession);
		u.setpNumber(pNumber);
		u.setSex(sex);
		u.setAge(age);
		u.setAddress(address);
		u.setEmail(email);
		
		WorkerDao dao = new WorkerDao();
		boolean flag = dao.insert(u);
		System.out.println(flag);
		
		if(flag){
			req.getRequestDispatcher("Worker/success.html").forward(req, resp);
		}else{
			req.getRequestDispatcher("Worker/error.html").forward(req, resp);
		}
		
	}
}
