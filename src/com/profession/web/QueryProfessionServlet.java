package com.profession.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.profession.dao.Profession;
import com.profession.dao.ProfessionDao;

public class QueryProfessionServlet extends HttpServlet {

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
		
		Profession u = new Profession();
		
		u.setID(ID);
		u.setName(name);
		
		ProfessionDao dao = new ProfessionDao();
		ArrayList<Profession> users = dao.query(u);

		System.out.println(users);
		request.setAttribute("users", users);
		request.getRequestDispatcher("Profession/showProfession.jsp").forward(request, response);
	}
}
