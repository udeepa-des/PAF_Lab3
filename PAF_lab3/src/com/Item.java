package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class Item {
	
	public Connection connect() {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root", "");
			
			System.out.println("Connected Successfully");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
				
	}

}
