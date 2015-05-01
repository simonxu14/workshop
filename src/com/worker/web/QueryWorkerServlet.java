package com.worker.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.worker.dao.Worker;
import com.worker.dao.WorkerDao;

public class QueryWorkerServlet extends HttpServlet {

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
		String name = request.getParameter("name");
		String Authority = request.getParameter("Authority");
		String IDCard = request.getParameter("IDCard");
		String profession = request.getParameter("profession");
		String pNumber = request.getParameter("pNumber");
		String sex = request.getParameter("sex");
		String age = request.getParameter("age");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		
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
		ArrayList<Worker> users = dao.query(u);

		System.out.println(users);
		request.setAttribute("users", users);
		request.getRequestDispatcher("Worker/showWorker.jsp").forward(request, response);
	}
}
