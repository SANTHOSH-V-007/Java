package org.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Details\nEmpId:");
		int  EmpID =  sc.nextInt();//4743 
		
		System.out.println("First Name:");
		String Fname = sc.next();//prasath
		
		System.out.println("Last Name:");
		String Lname = sc.next();//priya
		
		System.out.println("Role :");
		String Role = sc.next();//Marine
		
		System.out.println("Salary :");
		int salary = sc.nextInt();//65000
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","Database@123");
		//Statement st = con.createStatement();
		//String sql = "insert into employee values(4743,'prasath','priya','Marine',65000";
		PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?,?)");
		ps.setInt(1, EmpID);
		ps.setString(2,Fname);
		ps.setString(3,Lname);
		ps.setString(4,Role);
		ps.setInt(5, salary);
		int a=ps.executeUpdate();
		if(a>0) {
			System.out.println(a+" Record inserted successfully...");
		}
		
	}

}
