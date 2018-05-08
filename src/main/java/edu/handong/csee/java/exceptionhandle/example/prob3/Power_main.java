package edu.handong.csee.java.exceptionhandle.example.prob3;//Instructs the Power_main class to be complied and stored in edu.handong.csee.java.exceptionhandle.example.prob3

import java.util.Scanner;//importing a package, java.util.Scanner. A package is a kind of external objects created by other developer

public class Power_main//The declaration of class Power_main
{

	public static final Powercalc my_calculator = new Powercalc();//Instantiate of an Powercalc object, the modifier is public static final

	public static final Scanner keyboard = new Scanner(System.in);//Create an object of the Scanner class, the modifier is public static final

	public static void main(String[] args)//The declaration of static main method without return value
	{
		// TODO Auto-generated method stub

		while(keyboard.hasNextInt())//Repeat while the input value is integer
		{
			int n=keyboard.nextInt();//Create integer type local variable n, Take one integer from the keyboard and place it in the n
			int p=keyboard.nextInt();//Create integer type local variable p, Take one integer from the keyboard and place it in the p

			try//try block contains code where something could possibly go wrong
			{
				System.out.println(my_calculator.power(n,p));//calling method power(), the parameters are variable n and variable p, Outputs return value of it
			}

			catch(Exception e)//Exception handling code, Exception information is passed to object e.
			{
				System.out.println(e);//Output 'return value of calling method toString() in e'

			}
		}

	}

}
