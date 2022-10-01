package com.java;
import java.util.Scanner;

class LargestNumber {
	public static void main(String[] args) {
		
		//Here we create scanner object.
		
		Scanner sc=new Scanner(System.in);
		
		// Take input from the user.
		
		System.out.println("Enter  first number.");
		int num1=sc.nextInt();
		
		System.out.println("Enter second number.");
		int num2=sc.nextInt();
		
		// Here is the condition for Largest number.
		
		if(num1>num2)
		{
		  System.out.println("Largest number  "+ num1);
		}
		else
		{
		  System.out.println("Largest number  "+ num2);	
		}
	}
	

}

