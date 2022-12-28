package com.sunil.jdbc;

//Step 1: Import classes from SQL package
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectionExample {

	public static void main(String[] args) {

		String databaseUrl = "jdbc:mysql://localhost:3306/college";
		String userName = "root";
		String password = "root";
		String query = "Select * from students where id = 1";
		String query2 = "Select * from students where id = ?";
		
		// Step 2: Load and Register driver 
		try {
			Class.forName("com.sql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver class not found");
			e.printStackTrace();
		}
		
		
		// Step 3: Create Connection
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(databaseUrl, userName, password);
		} catch (SQLException e) {
			System.out.println("SQL exception occured while creating connection");
			System.out.println("SQL Exceptoin State: " + e.getSQLState());
			System.out.println("SQL Exceptoin Message: " + e.getMessage());
			e.printStackTrace();
		}
		
		// Step 4: Create Statement
		Statement statement = null;
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			System.out.println("SQL exception occured while creating statement");
			System.out.println("SQL Exceptoin State: " + e.getSQLState());
			System.out.println("SQL Exceptoin Message: " + e.getMessage());
			e.printStackTrace();
		}
		
		// Step 4: Create Prepared Statement
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(query2);
			preparedStatement.setInt(1,2);
		} catch (SQLException e) {
			System.out.println("SQL exception occured while creating statement");
			System.out.println("SQL Exceptoin State: " + e.getSQLState());
			System.out.println("SQL Exceptoin Message: " + e.getMessage());
			e.printStackTrace();
		}
		
		// Step 5: Execute Query
		ResultSet resultSet = null;
		try {
			 resultSet = statement.executeQuery(query);
		} catch (SQLException e) {
			System.out.println("SQL exception occured while executing query");
			System.out.println("SQL Exceptoin State: " + e.getSQLState());
			System.out.println("SQL Exceptoin Message: " + e.getMessage());
			e.printStackTrace();
		}
		
		// Step 5: Execute PreparedStatement Query
		ResultSet resultSet2 = null;
		try {
			 resultSet2 = preparedStatement.executeQuery();
		} catch (SQLException e) {
			System.out.println("SQL exception occured while executing query");
			System.out.println("SQL Exceptoin State: " + e.getSQLState());
			System.out.println("SQL Exceptoin Message: " + e.getMessage());
			e.printStackTrace();
		}
	
		// Step 6: Process Results
		try {
			if(resultSet.first()) {
				String name = resultSet.getString("student_name");
				System.out.println("Student Name: " + name);
			}
			
		} catch (SQLException e) {
			System.out.println("No rows found");
			System.out.println("SQL Exceptoin State: " + e.getSQLState());
			System.out.println("SQL Exceptoin Message: " + e.getMessage());
			e.printStackTrace();
		}
		
		// Step 6: Process Results
		try {
			while(resultSet2.next()) {
				String name = resultSet2.getString("student_name");
				System.out.println("Student Name: " + name);
			}
			
		} catch (SQLException e) {
			System.out.println("No rows found");
			System.out.println("SQL Exceptoin State: " + e.getSQLState());
			System.out.println("SQL Exceptoin Message: " + e.getMessage());
			e.printStackTrace();
		}
		
		// Step 7: Close Connection
		try {
			statement.close();
			connection.close();			
		} catch(SQLException e) {
			System.out.println("Error closing connection");
			System.out.println("SQL Exceptoin State: " + e.getSQLState());
			System.out.println("SQL Exceptoin Message: " + e.getMessage());
			e.printStackTrace();
		}
		
		// Step 7: Close Connection
		try {
			preparedStatement.close();
			connection.close();			
		} catch(SQLException e) {
			System.out.println("Error closing connection");
			System.out.println("SQL Exceptoin State: " + e.getSQLState());
			System.out.println("SQL Exceptoin Message: " + e.getMessage());
			e.printStackTrace();
		}

	}
}
