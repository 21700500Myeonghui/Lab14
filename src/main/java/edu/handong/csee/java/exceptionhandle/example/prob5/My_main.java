package edu.handong.csee.java.exceptionhandle.example.prob5;//Instructs the My_main class to be complied and stored in edu.handong.csee.java.exceptionhandle.example.prob5

import java.util.Scanner;//importing a package, java.util.Scanner. A package is a kind of external objects created by other developer

public class My_main//The declaration of class My_main
{

	public static void main(String[] args)//The declaration of static main method without return value
	{
		// TODO Auto-generated method stub

		try//try block contains code where something could possibly go wrong
		{
			Scanner keyboard =new Scanner(System.in);//Create an object of the Scanner class
			String str = keyboard.nextLine();//Create String type local variable str, Take String(Until enter is entered) from the keyboard and place it in the str
			My_main.myTest(str);//calling method myTest in class My_main, the parameter is variable str at this time
		}
		catch(MyException e)//Exception handling code, Exception information is passed to object e.
		{
			System.out.println("Inside catch block: "+e);//Outputs "Inside catch block 'return value of e.toString'"
			
		}
	}
	
	static void myTest(String str)throws MyException//The declaration of method myTest(), the parameter is str of String type, Keyword throws used in method heading to declare an exception, throws indicates that the method may throw exceptions, the exception is MyException type at this time  
	{
		if(str.equals("null"))//If value of variable str is null
			throw new MyException("String val is null");//Create an object of the MyException class, calling constructor, the parameter is "String val is null", throw MyException exception
		else//If value of variable str is not null
			System.out.println("String val is "+str);//Outputs "String val is: 'value of variable str'"
	}

}
