package com.architecture.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection connect() throws SQLException {
		return DriverManager.getConnection(
				"jdbc:postgresql://postgresql-class.cks98gmxels6."
						+ "us-west-1.rds.amazonaws.com:5432/jdbc_db"+
						"?currentSchema=architect",
				"jdbc_user","p4ssw0rd");
		
	}
}
