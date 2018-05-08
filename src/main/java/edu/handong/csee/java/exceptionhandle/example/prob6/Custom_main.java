package edu.handong.csee.java.exceptionhandle.example.prob6;//Instructs the Custom_main class to be complied and stored in edu.handong.csee.java.exceptionhandle.example.prob6

import java.util.Scanner;//importing a package, java.util.Scanner. A package is a kind of external objects created by other developer

public class Custom_main//The declaration of class Custom_main
{

	public static void main(String[] args)//The declaration of static main method without return value
	{
		// TODO Auto-generated method stub

		String name,race;//Create String type local variable name and race
		int age=0;//Create integer type local variable age, put 0 in age

		Scanner keyboard=new Scanner(System.in);//Create an object of the Scanner class
		CustomID object= new CustomID();//Instantiate of an CustomID object

		while(true)//Repeat the loop
		{
			try//try block contains code where something could possibly go wrong
			{
				if(object.getState()==0)//calling method getState() in object, if its return value is 0
				{
					System.out.print("Enter your name: ");//Outputs the string literal "Enter your name: "
					name=keyboard.nextLine();//Take String(Until enter is entered) from the keyboard and place it in the name
					object.setName(name);//calling method setName() in object, the parameter is name
				}
				else if(object.getState()==1)//calling method getState() in object, if its return value is 1
				{
					System.out.print("Enter your age: ");//Outputs the string literal "Enter your age: "
					age=keyboard.nextInt();//Take one integer from the keyboard and place it in the age
					keyboard.nextLine();//Take String(Until enter is entered) from the keyboard
					object.setAge(age);//calling method setAge() in object, the parameter is age
				}
				else if(object.getState()==2)//calling method getState() in object, if its return value is 2
				{
					System.out.print("Enter your race: ");//Outputs the string literal "Enter your race: "
					race=keyboard.nextLine();//Take String(Until enter is entered) from the keyboard and place it in the race
					object.setRace(race);//calling method setRace() in object, the parameter is race
				}
			}
			catch(Exception e)//Exception handling code, Exception information is passed to object e.
			{
				System.out.println(e.getMessage());//Outputs 'return value of calling method getMessage() in e'
				continue;//Immediately move on to the next repetition
			}
		}


	}

}
