package com.rmk.school.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.rmk.school.web.model.Student;

public class StudentDao {
	
	public Student getStudent(int rollno) {
		Student s = new Student();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?autoReconnect=true&useSSL=false","root","mysql");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from student where rollno ="+rollno);
			while(rs.next()) {
				s.setRollno(rs.getInt("rollno"));
				s.setSname(rs.getString("sname"));
			}
		
		} catch (Exception e) {
			System.out.println(e);
		}
		return s;
	}
	
	public int addStudent(int rollno, String sname) {
		int count = 0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?autoReconnect=true&useSSL=false","root","mysql");
			PreparedStatement st = con.prepareStatement("insert into student values(?,?)");
			st.setInt(1, rollno);
			st.setString(2, sname);
			count = st.executeUpdate();
		} catch (Exception e) {
	
		}
		
		
		return count;
	}
		public int deleteStudent(int rollno) {
			int count = 0;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?autoReconnect=true&useSSL=false","root","mysql");
				Statement st = con.createStatement();
				count = st.executeUpdate("Delete from student where rollno ="+rollno);
			} catch (Exception e) {
		
			}
			
			
			return count;
	}
		public int editStudent(int rollno, String sname) {
			int count = 0;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?autoReconnect=true&useSSL=false","root","mysql");
				PreparedStatement st = con.prepareStatement("update student set rollno=?, sname=? where rollno="+rollno);
				st.setInt(1, rollno);
				st.setString(2, sname);
				count = st.executeUpdate();
			} catch (Exception e) {
		
			}
			
			
			return count;
		}
}
