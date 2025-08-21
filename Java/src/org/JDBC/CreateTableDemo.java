package org.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CreateTableDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","Database@123");
		
	   Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product Details\nP_Id:");
		int  P_Id =  sc.nextInt();//001 
		
		System.out.println("Product Name:");
		String P_Name = sc.next();//Biscuit
		
		System.out.println("Product price:");
		int P_Price = sc.nextInt();//
		
		
		Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","Database@123");
		//Statement st = con.createStatement();
		// String sql = "create table products(P_Id int,P_Name varchar(30),P_Price int)";
		//String sql = ("insert into products values(001,biscuit,30)");
		PreparedStatement ps = con1.prepareStatement("insert into products values(?,?,?)");
		ps.setInt(1, P_Id);
		ps.setString(2,P_Name);
		ps.setInt(3,P_Price);

		int a=ps.executeUpdate();
		if(a>0) {
			System.out.println(a+" Record inserted successfully...");
		}
	}

}
