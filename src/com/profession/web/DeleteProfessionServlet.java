package com.profession.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.profession.dao.ProfessionDao;

public class DeleteProfessionServlet extends HttpServlet {

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
		ProfessionDao dao = new ProfessionDao();
		if(dao.delete(ID)){
			request.setAttribute("msg","ɾ���ɹ�");
		}else{
			request.setAttribute("msg","ɾ��ʧ��");
		}
		request.getRequestDispatcher("FindProfessionServlet").forward(request, response);
	}

}
