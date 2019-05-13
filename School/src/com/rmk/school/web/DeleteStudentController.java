package com.rmk.school.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rmk.school.web.dao.StudentDao;
import com.rmk.school.web.model.Student;

/**
 * Servlet implementation class DeleteStudentController
 */
@WebServlet("/deleteStudent")
public class DeleteStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
int rollno = Integer.parseInt(request.getParameter("rollno"));
		
		StudentDao dao = new StudentDao();
		int count = dao.deleteStudent(rollno);
		
		response.sendRedirect("index.jsp");
	}



}
