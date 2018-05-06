package edu.handong.csee.java.exceptionhandle.example.prob5;//Instructs the MyException class to be complied and stored in edu.handong.csee.java.exceptionhandle.example.prob5

public class MyException extends Exception//The declaration of class MyException to Be inherited of Exception
{
	
	private String message=null;//Create String type instance variable message, put null in message
	
	public MyException()//Constructor without parameter
	{
		super();//Code calling the constructor without parameter of a superclass
	}
	
	public MyException(String message)//Constructor with parameter, parameter is String type message
	{
		super(message);//Code calling the constructor with a String type parameter of a superclass
		this.message=message;//put the parameter message into the member variable message, 'this' is a reference to the object itself
	}
	
	public MyException(Throwable cause)//Constructor with parameter, parameter is Throwable class type cause, Throwable is a top class related to Exception
	{
		super(cause);//Code calling the constructor with a Throwable class type parameter of a superclass
	}
	
	public String toString()//The declaration of method toString() with String type return value
	{
		return message;//Return value of variable message
	}

}
