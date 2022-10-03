package com.java;
import java.util.Scanner;

public class CheckPerccentage {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first subject marks:");
		float M1=sc.nextFloat();
		
		System.out.println("Enter the Second subject marks:");
		float M2=sc.nextFloat();
		
		System.out.println("Enter the Third subject marks:");
		float M3=sc.nextFloat();
		
		System.out.println("Enter the Fourth subject marks:");
		float M4=sc.nextFloat();
		
		System.out.println("Enter the Fifth subject marks:");
		float M5=sc.nextFloat();
		
		float sum=M1+M2+M3+M4+M5;
		
		float per=(sum/500)*100;
		System.out.println("Your percentage is: "+ per);
		
		if(per>= 60)
		{
			System.out.println("Your are eligible because your  percentage is greater than 60% .");
		}
		else
		{
			System.out.println("Your are  not eligible because your  percentage is  not greater than 60% .");	
		}
	}

}
