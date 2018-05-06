package edu.handong.csee.java.exceptionhandle.example.prob4;//Instructs the Boundary class to be complied and stored in edu.handong.csee.java.exceptionhandle.example.prob4

public class Boundary//The declaration of class Boundary
{

	private int b[]=new int[5];//Create 5 integer space instance arrays, array name is b 
	private static int count=0;//Create integer type static variable count, its modifier is private, put 0 in count
	
	public void receive(int num) throws ArrayIndexOutOfBoundsException//The declaration of method receive(), the parameter is num of integer type, Keyword throws used in method heading to declare an exception, throws indicates that the method may throw exceptions, the exception is ArrayIndexOutOfBoundsException type at this time  
	{
		int i;//Create integer type local variable i
		i=count;//put value of variable count in i
		count++;//Increase value of variable count by 1
		
		b[i]=num;//put num in b[i]
		
		
		System.out.printf("arr[%d] <- %d\n",i,b[i]);//Outputs "arr['value of variable i'] <- 'value of b[i]'"
	}
	
}
