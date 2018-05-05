package edu.handong.csee.java.exceptionhandle.example.prob1;//Instructs the SpeedLimiter_main class to be complied and stored in edu.handong.csee.java.exceptionhandle.example.prob1

import java.util.Scanner;//importing a package, java.util.Scanner. A package is a kind of external objects created by other developer

import java.util.Random;//importing a package, java.util.Random. A package is a kind of external objects created by other developer

public class SpeedLimiter_Main//The declaration of class SpeedLimiter_Main
{

	public static void main(String[] args)//The declaration of static main method without return value
	{
		// TODO Auto-generated method stub

		Scanner keyboard= new Scanner(System.in);//Create an object of the Scanner class
		System.out.print("Set the speed limit, officer: ");//Outputs the string literal "Set the speed limit, officer: "

		int speedLimit=keyboard.nextInt();//Create integer type local variable speedLimit, Take one integer from the keyboard and place it in the speedLimit

		Random randomGen = new Random();//Create an object of the Random class

		int currentSpeed = randomGen.nextInt(100);//Create integer type local variable currentSpeed, Create random number from 0 to 10, put it in the currentSpeed

		SpeedLimiter spl = new SpeedLimiter(speedLimit, currentSpeed);//Instantiate of an SpeedLimiter object, calling constructor, value of parameters are value of variable speedLimit and value of variable currentSpeed at this time
		spl.warnSpeedLimit();//calling method warnSpeedLimit() in spl

		keyboard.close();//close object Scanner


	}

}
