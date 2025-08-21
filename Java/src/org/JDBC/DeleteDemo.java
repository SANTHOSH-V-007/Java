package org.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","Database@123");
		Statement st = con.createStatement();
		int a = st.executeUpdate("delete from employee where EmpID=4743");
		if(a>0) {
			System.out.println(a+" Record Deleted Successfully");
		}
		
	}

}
