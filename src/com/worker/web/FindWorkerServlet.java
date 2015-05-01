package com.worker.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.worker.dao.Worker;
import com.worker.dao.WorkerDao;

public class FindWorkerServlet extends HttpServlet {
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
		WorkerDao dao = new WorkerDao();
		ArrayList<Worker> users = dao.find();
		System.out.println(users);
		request.setAttribute("users", users);
		request.getRequestDispatcher("worker.jsp").forward(request, response);
	}
}
