package com.java;

/*Ques1:Create a class parent with default constructor and void sing method.print something inside the constructor
         and method
            Create child class which will inherit the property of parent and has
          methods void speak and void dance.print something inside the two methods.
         Create another class inheritance and object of class and call all the 
       methods.also mention the type of inheritance on the top of the program.
       
       @author:-Neha Rani
       @date: 01-10-22
       */


 class Inheritence {
	public static void main(String[] args)
	{
	
	//Here we Create object of child.
	
	Child c = new Child();
	
	//Here we call the method.
	
	c.Speak();
	c.Dance();
	c.Sing();
	
	}

}
