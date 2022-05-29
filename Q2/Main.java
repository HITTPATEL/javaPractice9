package day9.Q2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	  Scanner inputScanner=new Scanner(System.in);
	  System.out.println("Enter Number :");
	  int number=inputScanner.nextInt();
	  Parent parent=new Child(number);
	  
//	  parent.method1();
	  
		
	  Child child=(Child) parent;
	  child.method1();
	  child.method2();
	  child.method3();
	  child.method4();
		
		
     
}

}	