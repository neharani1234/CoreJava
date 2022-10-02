package com.java;
import java.util.Scanner;
public class RelationalOperator {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
  System.out.println("Enter Your first number:");
   int num1=sc.nextInt();
   System.out.println("Enter the Second number:");
   int num2=sc.nextInt();
   System.out.println("num1 is less than num2 : " + (num1<num2));
   System.out.println("num1 is greater than num2 : " + (num1>num2));
   System.out.println("num1 is not equalto num2 : " + (num1!=num2));
   System.out.println("num1 is equal to num2  : " + (num1==num2));
	}
}
