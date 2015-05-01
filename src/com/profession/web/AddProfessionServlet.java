package com.profession.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.profession.dao.Profession;
import com.profession.dao.ProfessionDao;

public class AddProfessionServlet extends HttpServlet{
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

		Profession u = new Profession();
		u.setID(ID);
		u.setName(name);
		
		ProfessionDao dao = new ProfessionDao();
		boolean flag = dao.insert(u);
		System.out.println(flag);
		
		if(flag){
			req.getRequestDispatcher("Profession/success.html").forward(req, resp);
		}else{
			req.getRequestDispatcher("Profession/error.html").forward(req, resp);
		}
		
	}
}
