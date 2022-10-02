package com.java;
import java.util.Scanner;

	public class Arithematic
	{
	 public static void main(String[] args) 
	 {
		 Scanner sc=new Scanner(System.in);   // Scanner function is used to take input from the user.
		
		 System.out.println("Enter your first number:");
		int num1=sc.nextInt();
		
		System.out.println("Enter your Second  number:");
		int num2=sc.nextInt();
		
		//Perform Arithematic operation.
		
	    int sum=num1+num2;
	    int mul=num1*num2;
	    int div=num1/num2;
	    int sub=num1-num2;
	    int mod=num1%num2;
	    
	    // Print all the output of Arithematic operation.
	    System.out.println("Addition of two number is: "+sum);
	    System.out.println("Multiplication of two number is: "+mul);
	    System.out.println("Division of two number is: "+div);
	    System.out.println("Subtraction of two number is: "+ sub);
	    System.out.println("Modulo of two number is: "+ mod);

	 }
	}


}
