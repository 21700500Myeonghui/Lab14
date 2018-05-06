package edu.handong.csee.java.exceptionhandle.example.prob6;//Instructs the CustomID class to be complied and stored in edu.handong.csee.java.exceptionhandle.example.prob6

public class CustomID extends Exception//The declaration of class CustomID to Be inherited of Exception
{
	private String name;//Create String type instance variable name
	private int age;//Create integer type instance variable age
	private String race;//Create String type instance variable race
	private int state=0;//Create integer type instance variable state, put 0 in state
	private String[] raceArray={"Vulcans","Romulan","Klingons"};//Create String type instance arrays, array name is raceArray, Initialize array "Vulcans","Romulan","Klingons"
	
	
	public void setName(String name) throws Exception//The declaration of method setName(), the parameter is name of String type, Keyword throws used in method heading to declare an exception, throws indicates that the method may throw exceptions, the exception is Exception type at this time  
	{
		
		if(name.length()<5)//If the length of the name is less than 5
		{
			state=0;//put 0 in state
			throw new Exception("Your name is short! Try again!");//Create an object of the Exception class, the parameter is "Your name is short! Try again!", throw Exception exception
		}
		else//If the length of the name is  not less than 5
		{
			this.name=name;//put the parameter name into the member variable name, 'this' is a reference to the object itself
			System.out.println("Name is valid");//Outputs the string literal "Name is valid"
			System.out.println("Name: "+name);//Outputs "Name: 'value of variable name'"
			state++;//Increase the state by one.
			
		}
		
	}
	
	public void setAge(int age) throws Exception//The declaration of method setAge(), the parameter is age of integer type, Keyword throws used in method heading to declare an exception, throws indicates that the method may throw exceptions, the exception is Exception type at this time  
	{
		if(age<18)//if value of variable age is less than 18
		{
			state=1;//put 1 in state
			throw new Exception("You are too young! Try again!");//Create an object of the Exception class, the parameter is "You are too young! Try again!", throw Exception exception
		}
		else//if value of variable age is not less than 18
		{
			this.age=age;//put the parameter age into the member variable age, 'this' is a reference to the object itself
			System.out.println("Age is valid");//Outputs the string literal "Age is valid"
			System.out.println("Age: "+age);//Outputs "Age: 'value of variable age'"
			state++;//Increase the state by one.
		}
	}
	
	public void setRace(String race) throws Exception//The declaration of method setRace(), the parameter is race of String type, Keyword throws used in method heading to declare an exception, throws indicates that the method may throw exceptions, the exception is Exception type at this time  
	{
		for(int i=0; i<raceArray.length; i++)//Create local variable i, Put the 0 in i, increase i by 1, Repeat until i is less than length of array raceArray
		{
			if(raceArray[i].equals(race))//if array raceArray's i-th value and value of parameter race are the same
			{
				this.race=race;//put the parameter race into the member variable race, 'this' is a reference to the object itself
				System.out.println("Race is valid");//Outputs the string literal "Race is valid"
				System.out.println("Race: "+race);//Outputs "Race: 'value of variable race'"
				state=0;//put 0 in state
				return;//Return to where you called the method.
			}
		}
		state=2;//put 2 in state
		throw new Exception("Human! Try again");//Create an object of the Exception class, the parameter is "Human! Try again", throw Exception exception
		
	}
	
	public int getState()//The declaration of method getState() with integer type return value
	{
		return state;//Return value of variable state
	}

}
