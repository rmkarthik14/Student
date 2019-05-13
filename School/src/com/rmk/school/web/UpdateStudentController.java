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
 * Servlet implementation class UpdateStudentController
 */
@WebServlet("/updateStudent")
public class UpdateStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
int rollno = Integer.parseInt(request.getParameter("rollno"));
		
		StudentDao dao = new StudentDao();
		Student s1 = dao.getStudent(rollno);
		
		request.setAttribute("Student", s1);
		RequestDispatcher rd = request.getRequestDispatcher("updateshow.jsp");
		rd.forward(request, response);
	}

}
