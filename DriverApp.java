package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.EmpCredentialsImpl;

public class DriverApp {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the fname" );
	String f=sc.next();
	System.out.println("Please enter the lname");
	String l=sc.next();
	Employee empl=new Employee(f,l);
	EmpCredentialsImpl cred=new EmpCredentialsImpl();
	System.out.println("1. Technical");
	System.out.println("2. Admin");
	System.out.println("3. HR");
	System.out.println("4. Legal");
	
	System.out.println("Please choose your department");
	int choice=sc.nextInt();
	String genEmail="";
	String genPassword="";
	
	switch(choice) 
	{
	case 1:genEmail=cred.generateEmailId(empl.getFname().toLowerCase(), empl.getLname().toLowerCase(), "tech");
    break;	
	case 2:genEmail=cred.generateEmailId(empl.getFname().toLowerCase(), empl.getLname().toLowerCase(), "admin");
	break;
	case 3:genEmail=cred.generateEmailId(empl.getFname().toLowerCase(), empl.getLname().toLowerCase(), "hr");
	break;
	case 4:genEmail=cred.generateEmailId(empl.getFname().toLowerCase(), empl.getLname().toLowerCase(), "legal");
	break;
	
	default:System.out.println("Please Enter the valid input:");
		
	
	
	
	}
	
	genPassword=cred.generatePassword();
	empl.setEmailid(genEmail);
	empl.setPassword(genPassword);
	cred.showDetails(empl);
	
	}

}
