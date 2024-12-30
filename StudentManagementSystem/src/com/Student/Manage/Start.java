package com.Student.Manage;

import java.io.*;

public class Start {

	public static void main(String[] args)throws IOException{
		System.out.println("Welcome to Student Management System");
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
	 {
		System.out.println("press 1 to add Students");
		System.out.println("Press 2 to delete Students");
		System.out.println("press 3 to display the Student Data");
		System.out.println("press 4 to update the Student Data");
		System.out.println("press 5 to exit app");
		 
		 int c=Integer.parseInt(br.readLine());
		 if(c==1)
		 {    System.out.println("enter the Student id");
		 
		    int id=Integer.parseInt(br.readLine());
			 System.out.println("enter the Student name");
			 String name=br.readLine();
			 
			 System.out.println("enter the Student phone");
			 String phone=br.readLine();
			 
			 System.out.println("enter the Student city ");
			 String city=br.readLine();
			 
			 // create the Student object
			 
			 Student st= new Student(id,name,phone,city);
			 boolean ans= StudentDao.insertStudentToDb(st);
			 if(ans)
			 {
				 System.out.println("Data is succesfully added");
			 }
			 else
			 {
				 System.out.println("something went wrong");
			 }
				 
		 }
		 else if(c==2)
		 {
			 System.out.println("enter the student id");
			 int id=Integer.parseInt(br.readLine());
			 
			 boolean f= StudentDao.deleteStudentToDb(id);
			 if(f)
			 {
				 System.out.println("data deleted");
			 }
			 else {
				 System.out.println("something went wrong");
			 }
			 
		 }
		 else if(c==3)
		 {
			StudentDao.showStudentData();
			 
		 }
		 else if(c==4)
		 {
			 System.out.println("enter the ID of student");
			int id=Integer.parseInt(br.readLine());
			
			System.out.println("enter new name of Student");
			String name=br.readLine();
			
			System.out.println("enter new number of Student");
			String phone=br.readLine();
			
			System.out.println("enter new address");
			String add=br.readLine();
			
			
			boolean b=StudentDao.updateStudentAddress(id,name,phone,add);
			if(b)
			{
				
				System.out.println("data updated successfully");
			}
			 else {
				 System.out.println("something went wrong");
			 }
			 
			 
		 }
		 else if(c==5)
		 {
			System.out.println("thank you using this aap") ;
		 }
		 else
		 {
			 
		 }
	 }
	
		
	}
  
}

