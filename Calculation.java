package com.java;

import java.util.Scanner;

/* Program: Write a program of calculation of two number 
 * Addition,Multiplication,Division,Subtraction.
 * 
 * @author:-Neha Rani
 * @date:-01-10-2022
 */

// Here we create our Main class.
class Calculation {
	public static void main(String[] args) 
	{
	  
		// Create a Scanner Object.
		
		Scanner sc=new Scanner(System.in);
		

		 System.out.println("Enter your first number:");
		int num1=sc.nextInt();
		
		System.out.println("Enter your Second  number:");
		int num2=sc.nextInt();
		
		System.out.println("Enter 1 for Addition:");
		System.out.println("Enter 2 for Multiplication:");
		System.out.println("Enter 3 for Division:");
		System.out.println("Enter 4 for Subtraction:");
         
		//Enter the choice to perform operation according to the given instruction.
              
        System.out.println("Enter your choice:");   
        int choice=sc.nextInt();

		
		//Perform Calculation 
        switch(choice)
        {
        case 1:
        	int sum=num1+num2;
        	System.out.println("Addition is: "+ sum);
        	break;
        case 2:
        	int mul=num1*num2;
        	System.out.println("Multiplication is: "+ mul);
        	break;
        case 3:
        	int div=num1/num2;
        	System.out.println("Division is: "+ div);
        	break;
        case 4:
        	int sub=num1-num2;
        	System.out.println("Addition is: "+ sub);
        	break;
        }
       

	}

}
