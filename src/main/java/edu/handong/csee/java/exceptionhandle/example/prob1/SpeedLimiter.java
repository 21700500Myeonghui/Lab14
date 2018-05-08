package edu.handong.csee.java.exceptionhandle.example.prob1;//Instructs the SpeedLimiter class to be complied and stored in edu.handong.csee.java.exceptionhandle.example.prob1

public class SpeedLimiter//The declaration of class SpeedLimiter
{

	private int speedLimit;//Create integer type Instance variable speedLimit
	private int currentSpeed;//Create integer type Instance variable currentSpeed


	public SpeedLimiter(int speedLimit, int currentSpeed)//Constructor with parameter, parameters are integer type speedLimit and integer type currentSpeed
	{
		this.speedLimit=speedLimit;//put the parameter speedLimit into the member variable speedLimit, 'this' is a reference to the object itself
		this.currentSpeed=currentSpeed;//put the parameter currentSpeed into the member variable currentSpeed, 'this' is a reference to the object itself
	}

	public void warnSpeedLimit()//The declaration of method warnSpeedLimit() without return value
	{
		try//try block contains code where something could possibly go wrong

		{
			if(this.speedLimit<this.currentSpeed)//If member variable speedLimit is less than member variable currentSpeed. 'this' is a reference to the object itself
			{
				throw new Exception("Speed Limit "+this.speedLimit+"km exceeded!");//Create an object of the Exception class, the parameter is "Speed Limit 'value of variable speedLimit'km exceeded!", throw Exception exception
			}
			System.out.println("You are a law abiding citizen!");//Outputs the string literal "You are a law abiding citizen!"
		}
		catch(Exception e)//Exception handling code, Exception information is passed to object e.
		{
			System.out.println(e.getMessage());//calling method getMessage() in e and Output return value of method getMessage() in e
			System.out.println("You are being fined.");//Outputs the string literal "You are fined." 
		}

		System.out.println("Your current speed: "+this.currentSpeed);//Output "Your current speed 'value of variable currentSpeed'", 'this' is a reference to the object itself
	}

}
