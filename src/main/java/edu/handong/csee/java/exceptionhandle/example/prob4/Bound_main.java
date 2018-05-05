package edu.handong.csee.java.exceptionhandle.example.prob4;//Instructs the Bound_main class to be complied and stored in edu.handong.csee.java.exceptionhandle.example.prob4

import java.util.Scanner;//importing a package, java.util.Scanner. A package is a kind of external objects created by other developer

public class Bound_main //The declaration of class Bound_main
{

	public static void main(String[] args)//The declaration of static main method without return value
	{
		// TODO Auto-generated method stub

		Boundary object= new Boundary();//Instantiate of an Boundary object
		Scanner keyboard=new Scanner(System.in);//Create an object of the Scanner class
		
		int num=0;//Create integer type local variable num, put 0 in num
		
		while(true)//Repeat the loop
		{
			try//try block contains code where something could possibly go wrong
			{
				System.out.print("Enter an integer: ");//Outputs the string literal "Enter an integer: "
			
			num=keyboard.nextInt();//Take one integer from the keyboard and place it in the num
			object.receive(num);//calling method receive() in object, the parameter is num
			}
		
		catch(ArrayIndexOutOfBoundsException e)//Exception handling code, Exception information is passed to object e.
		{
			System.out.println("Invalid array index access!");//Outputs the string literal "Invalid array index access!"
			break;//Get out of the loop
		}
		}
	}

}
