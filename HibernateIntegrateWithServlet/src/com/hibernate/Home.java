package com.hibernate;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class Home extends HttpServlet {
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String marks = request.getParameter("marks");

		HttpSession session = request.getSession(true);
		try {
			SaveStudentControl ctrl = new SaveStudentControl();
			ctrl.addNewStudent(name, email, marks);
			response.sendRedirect("Success");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}