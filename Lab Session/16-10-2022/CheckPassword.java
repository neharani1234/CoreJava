/*
 Program :  Check weather the  password is correct or not.
 @Author : Neha Rani
 Date : 16-10-22
 */

import java.util.Scanner;


public class CheckPassword
 {

	public static void main(String[] args) {

		//creating object of scanner class
		Scanner sc = new Scanner(System.in); 
		
		//printing statement
		System.out.println("Enter UserId :"); 
		//taking input from the user
		String UserId = sc.nextLine();  
	 
		
		//printing statement
	 System.out.println("Enter password :");  
	 
     	//taking input from the user
		int password = sc.nextInt();

	   int psword=2345;
		//using if-else statement
		if (password ==psword)  
	 {
			//printing statement
		 System.out.println("  Password is correct"); 
         System.out.println(UserId +"="+psword);
	 }
	 else
	 {
		//printing statement
		 System.out.println(" Try again ! Password is incorrect "); 
	 }

	}

}
