package com.java;
import java.util.Scanner;
public class LogicalOperation
{
	public static void main(String[] args) 
	{
	 // Creating Scanner Object
	Scanner sc=new Scanner(System.in);
    
	System.out.println("Enter first number :");
	int num1=sc.nextInt();                      //Take input from the user.

    System.out.println("Enter second number:");
    int num2=sc.nextInt();                        //Take input from the user.
    
    System.out.println("Enter third number:");
    int num3=sc.nextInt();                         //Take input from the user.
     
    //Using logical operator  AND to verify two constrain.
    
    if((num1<num2)&&(num2==num3))
    {
    	System.out.println(num1+num2+num3);
    }
    else
    {
    	System.out.println("Condition is not true.");
    }
    
    //using logical operator  OR to verify two constrain.
    
    if((num1<num2)||(num2==num3))
    {
    	System.out.println(num1+num2+num3);
    }
    else
    {
    	System.out.println("Condition is not true.");
    }
	
	
	// Performing NOT operation.
	
	

	  	System.out.println(num1!=6);
	}
    
}
