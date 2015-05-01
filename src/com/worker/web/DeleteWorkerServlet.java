package com.worker.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.worker.dao.WorkerDao;

public class DeleteWorkerServlet extends HttpServlet {

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
		if(dao.delete(ID)){
			request.setAttribute("msg","É¾³ý³É¹¦");
		}else{
			request.setAttribute("msg","É¾³ýÊ§°Ü");
		}
		request.getRequestDispatcher("FindWorkerServlet").forward(request, response);
	}

}
