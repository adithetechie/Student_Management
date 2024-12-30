package com.Student.Manage;

import java.sql.*;

public class StudentDao {
	
	
	public static boolean insertStudentToDb(Student st)
	{
		boolean f=false;
		try {
			// sablish the connection
			Connection con= ConnectionProvider.createC();
			//Query of database
			String q="insert into Students(s_id,s_name,s_phone,s_city) values(?,?,?,?)";
			//Prepared Statement
			PreparedStatement pst= con.prepareStatement(q);
			
			// setting the values into database
			pst.setInt(1,st.getStud_id());
			pst.setString(2,st.getStud_name());
			pst.setString(3,st.getStud_phone());
			pst.setString(4, st.getStud_city());
			
			// Execute
			
			pst.executeUpdate();
			f=true;
			
		}
		catch(Exception e )
		{
			System.out.println(e);
		}
		return f;
	}

	public static boolean deleteStudentToDb(int id) {
		boolean f=false;
		 try {
			 Connection con=ConnectionProvider.createC();
			  
			 String q="delete from Students where s_id=?";
			 PreparedStatement pst=con.prepareStatement(q);
			 
			 pst.setInt(1,id);
			 
			 pst.executeUpdate();
			 f=true;
			 
			 
		 }
		catch(Exception e)
		 {
			e.printStackTrace();
		 }
		
		return f;
		
	}

	public static void showStudentData() {
		try {
		Connection con=ConnectionProvider.createC();
		
		String q="select * from Students";
		
		
	 Statement s=con.createStatement();
	 ResultSet rs=s.executeQuery(q);
	 while(rs.next()) {
		 int id=rs.getInt(1);
		 String name=rs.getString(2);
		 String phone=rs.getString(3);
	     String city=rs.getString(4);
	     
	     System.out.println("ID : "+" "+id);
	     System.out.println("NAME : "+" "+name);
	     System.out.println("PHONE : "+" "+phone);
	     System.out.println("CITY : "+" "+city);
	     System.out.println("....................................");
	 }
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}

	public static boolean updateStudentAddress(int id, String name,String phone,String add) {
		boolean f=false;
		try {
			Connection con=ConnectionProvider.createC();
			String q="update Students set s_name=?,s_phone=?,s_city=? where s_id=?";
			
			PreparedStatement pst= con.prepareStatement(q);
			
			
			pst.setString(1, name);
			pst.setString(2,phone);
			pst.setString(3,add);
			pst.setInt(4, id);
			
			pst.executeUpdate();
			f=true;
	
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return f;
	}



}
