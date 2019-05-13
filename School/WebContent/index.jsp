<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<h2>Find Student</h2>
	<form action="getStudent">
		<input type="text" name="rollno">
		<input type = "submit">
	</form>
<br><br>
<h2>Add Student</h2>
	<form action="addStudent">
		 Student ID: <input type="text" name="rollno"><br>
		Student Name: <input type="text" name="sname"><br>
		<input type="submit">
	</form>
<br><br>
<h2>Delete Student</h2>
	<form action="deleteStudent">
		<input type="text" name="rollno">
		<input type = "submit">
	</form>	
</body>
</html>
