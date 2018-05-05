package edu.handong.csee.java.exceptionhandle.example.prob2;//Instructs the In_exception class to be complied and stored in edu.handong.csee.java.exceptionhandle.example.prob2

import java.util.Scanner;//importing a package, java.util.Scanner. A package is a kind of external objects created by other developer

import java.util.*;//importing a package, java.util.*. A package is a kind of external objects created by other developer

public class In_exception//The declaration of class In_exception
{

	private int x;//Create integer type Instance variable x
	private int y;//Create integer type Instance variable y
	
	public In_exception()//Constructor without parameter
	{
		
	}
	
	public void divide()//The declaration of method divide() without return value
	{
		try//try block contains code where something could possibly go wrong
		{
			Scanner keyboard = new Scanner(System.in);//Create an object of the Scanner class
			System.out.print("x: ");//Outputs the string literal "x: "
			x=keyboard.nextInt();// Take one integer from the keyboard and place it in variable x

			System.out.print("y: ");//Outputs the string literal "y: "
			y=keyboard.nextInt();// Take one integer from the keyboard and place it in variable y
			
			System.out.println(x/y);//Outputs 'x division y'
		}
		catch(ArithmeticException e)//Exception handling code, Exception information is passed to object e.
		{
			System.out.println("java.lang.ArithmeticException: "+e.getMessage());//calling method getMessage() in e and Output "java.lang.ArithmeticException: 'return value of method getMessage() in e'"
		}
		catch(InputMismatchException e)//Exception handling code, Exception information is passed to object e.
		{
			System.out.println("java.util.InputMismatchException");//Output "java.util.InputMismatchException"
		}
		catch(Exception e)//Exception handling code, Exception information is passed to object e.
		{
			System.out.println("Some other exception has occured: "+e.getMessage());//calling method getMessage() in e and Output "Some other exception has occured: 'return value of method getMessage() in e'"
		}
		
	}
}
