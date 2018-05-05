package edu.handong.csee.java.exceptionhandle.example.prob3;//Instructs the Powercalc class to be complied and stored in edu.handong.csee.java.exceptionhandle.example.prob3

public class Powercalc//The declaration of class Powercalc
{
	
	public long power(int n, int p) throws Exception//The declaration of method power(), the parameters n and p of integer type, Keyword throws used in method heading to declare an exception, throws indicates that the method may throw exceptions
	{
		long result=0;//Create long type local variable result, put 0 in result
		
		result=(long)Math.pow(n, p);//calling method pow in class Math, the parameter n and p of integer type, Convert its return value to long type, put it in result 
		
		if(n<0 || p<0)//If either n or p is negative
		{
			throw new Exception("n of p should not be negative");//Create an object of the Exception class, the parameter is "n of p should not be negative", throw Exception exception
		}
		if(n==0 && p==0)//If both n and p are zero
		{
			throw new Exception("n and p should not be zero");//Create an object of the Exception class, the parameter is "n and p should not be zero", throw Exception exception
		}
		return result;//Return value of variable result
	}

}
