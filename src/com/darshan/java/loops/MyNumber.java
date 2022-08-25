package com.darshan.java.loops;

public class MyNumber {
	
	private int number;

	public MyNumber() {
		
	}
	public MyNumber(int number)
	{
		this.setNumber(number);
		
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public boolean isPrime()
	{
		boolean result = true;
		if(this.number<=2) return false;
		for(int i=2;i<=this.number/2;i++)
		{
			if(this.number%i==0)
			{
				result = false;
				break;
			}
			
		}
		if(result)
		{
			return result;
		}
		else 
		{
			return false;
		}
	}
	public int sumUpToN()
	{
		int sum=0;
		for(int i=1;i<=this.number;i++)
		{
			sum +=i;
		}
		return sum;
	}
	public int sumOfDivisors()
	{
		int sum = 0;
		for(int i=2;i<this.number;i++)
		{
			if(this.number%i==0)
			{
				sum+=i;
			}
		}
		return sum;
	}
	
	public void printANumberTriangle()
	{
		for(int i=1;i<=this.number;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
