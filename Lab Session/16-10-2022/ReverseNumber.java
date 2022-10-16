/*
Program :  reverse a number which is given by   the  user.
  @Author : Neha Rani
  @ Date : 16/10/2022
  */
 import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args)
    {
       // creat scanner object to take input.
       
       Scanner sc=new Scanner(System.in);
      
       System.out.println(" Enter the number");
       int num=sc.nextInt();
        int rev=0;

     if(num>0)  
      {

         while(num>0)
         {
             int rem=num%10;
             rev=rev*10+rem;
             num=num/10;
            }
        }
        else
        {
          System.out.println("The number is less than zero");
        }

        System.out.println("The reverse number of a given number is  "+ rev);
     }
    
}
