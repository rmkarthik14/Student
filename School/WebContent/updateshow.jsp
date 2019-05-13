<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.rmk.school.web.model.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Student s1 = (Student)request.getAttribute("Student");
	%>
	<form action="editStudent">
		 Student ID: <input type="text" name="rollno" value="<%s1.getRollno();%>"><br>
		Student Name: <input type="text" name="sname" value="<%s1.getSname();%>"><br>
		<input type="submit">
	</form>
</body>
</html>