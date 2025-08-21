package org.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","Database@123");
		Statement st=con.createStatement();
		String sql = "update employee set salary = salary + 5000 where salary<40000";
		st.executeUpdate(sql);
		System.out.println("Update Completed");

	}

}
