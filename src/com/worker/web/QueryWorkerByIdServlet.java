package com.worker.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.worker.dao.Worker;
import com.worker.dao.WorkerDao;

public class QueryWorkerByIdServlet extends HttpServlet {

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
		WorkerDao dao = new WorkerDao();
		Worker u = dao.queryById(ID);
		dao.delete(ID);
		request.setAttribute("user", u);
		request.getRequestDispatcher("Worker/updateWorker.jsp").forward(request, response);
		
	}

}
