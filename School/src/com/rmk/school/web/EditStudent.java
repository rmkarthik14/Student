package com.rmk.school.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rmk.school.web.dao.StudentDao;

/**
 * Servlet implementation class EditStudent
 */
@WebServlet(name = "EditStudentController", urlPatterns = { "/editStudent" })
public class EditStudent extends HttpServlet {
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int rollno = Integer.parseInt(request.getParameter("rollno"));
		String sname = request.getParameter("sname");
		
		StudentDao dao = new StudentDao();
		 int count = dao.addStudent(rollno,sname);
		 
			response.sendRedirect("index.jsp");
	}

	

}
