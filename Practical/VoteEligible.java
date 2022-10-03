package com.java;
 import java.util.Scanner;
 
 class VoteEligible 
{
 public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 
	 System.out.println("Enter the age:");
	 int age=sc.nextInt();
	 System.out.println("Your age is: "+age);
	 
	 if(age>=18)
	 {
		System.out.println(" You are eligible for the vote "); 
	 }
	 else
	 {
		 System.out.println("You are not eligible for the vote.");
	 }
	 
 }
}
