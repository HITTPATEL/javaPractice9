package day9.Q1;

import java.security.PKCS12Attribute;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.lang.model.element.Element;

public class Student {
	private int roll; 
	private String name;
	private int marks;
	private char grade;
	
	public void Student() {
		
	}
	
	@Override
	public String toString() {
		   displayDetails();
		   return "";
	}
	
	public Student(int roll, String name, int marks) {

		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.grade = grade;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public void displayDetails() {
		Scanner inputScanner=new Scanner(System.in);
		
		System.out.println("Enter Student Name :");
		String nameString=inputScanner.next();
		
		System.out.println("Enter Roll Number :");
		int roll=inputScanner.nextInt();
		
		System.out.println("Enter Marks :");
		int marks=inputScanner.nextInt();
		
		  Student s1=new Student(roll, nameString, marks);
		  
		 this.grade=calculateGrade(marks);
				 
		 System.out.println("=======================");		 
		 System.out.println("Student Name is "+s1.getName());	
		 System.out.println("Roll Number is :"+s1.getRoll());
		 System.out.println("Marks is "+s1.getMarks());
		 System.out.println("Grade is "+this.grade);
		 System.out.println("=======================");	
	}
	
	private char calculateGrade(int marks) {
		if (marks >= 500) { 
			return 'A';
		}
		else if (marks < 500  && marks >= 400 ) {
			return 'B';
		}
		else {
			return 'C';
		}
		
	}
	
}
