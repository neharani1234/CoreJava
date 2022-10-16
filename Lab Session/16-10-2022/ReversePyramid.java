/* WAP to create ReversePyramid
@ Author: Neha Rani
Date 16-10-22
*/

import java.util.Scanner;


class ReversePyramid{
	
public static void main (String[] args)
{
	//Enter the size of pyramid
	
	int number = 10;
	int i, j;
	
	
	for(i = number; i >= 1; i--)    //Here is our outer loop
	{
		
		// Here is our inner loop
		for(j = i; j < number; j++)
		{
			System.out.print(" ");
		}
		
	
		for(j = 1; j <= (2 * i - 1); j++)
		{
			System.out.print("*");  //Print the Star.
		}
		
	
		System.out.println("");
	}
}
}
