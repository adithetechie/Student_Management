package com.Student.Manage;

import java.sql.*;

public class ConnectionProvider {
	
	static Connection con;
	public  static Connection createC()
	{
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
		}
		catch(Exception e)
		{
		System.out.println(e);	
		}
		return con ;
	}

}
