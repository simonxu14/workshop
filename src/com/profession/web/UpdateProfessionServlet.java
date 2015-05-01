package com.profession.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.profession.dao.Profession;
import com.profession.dao.ProfessionDao;

public class UpdateProfessionServlet extends HttpServlet {
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
		if(dao.insert(u)){
			request.setAttribute("msg","修改成功");
		}else{
			request.setAttribute("msg","修改失败");
		}
		request.getRequestDispatcher("FindProfessionServlet").forward(request, response);
	}

}





