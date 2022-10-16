/*
Program: To Check The year is leap year or not.
@ Author : Neha Rani
Date: 16-10-2022
*/


import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

         // Creating Scanner object
		Scanner sc= new Scanner(System.in);
		
		//taking  Year as a input.
		System.out.println("Enter the Year");
		int year= sc.nextInt();
		
		// Here we use if else condition to check weather the year is leap year or not.

		if((year % 4==0)&&(year % 400==0)|| (year % 100 !=0)) 
		{
			System.out.println( year+" is a leap year.");
		}
		else {
			System.out.println( year +" is not leap year");
		}
			
	
	
		
	}

}
