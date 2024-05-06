package com.tssm.prac;
import java.sql.*;

import org.omg.IOP.Codec;
public class jdbcexample {
	static final String DB_URL = "jdbc:mysql://localhost/demo";
	static final String USER = "root";
	static final String PASS = "student";
	static final String QUERY = "SELECT id, first, last, age FROM demo3";
	public static void main(String[] args) {
		// Open a connection
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();

				ResultSet rs = stmt.executeQuery(QUERY);
				) {
			
			//code for insertion 
			String sql = "INSERT INTO demo3 VALUES (106, ' Sachinn ', 'Tendulkarr', 18)";
			stmt.executeUpdate(sql);
			System.out.println("Inserted records into the table...");
			
			//code for retriving
			while(rs.next()){
				//Display values
				System.out.print("ID: " + rs.getInt("id"));
				System.out.print(", Age: " + rs.getInt("age"));
				System.out.print(", First: " + rs.getString("first"));
				System.out.println(", Last: " + rs.getString("last"));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
