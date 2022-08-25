package com.darshan.java.loops;

public class MyNumberRunner {

	public static void main(String[] args) {
		
		MyNumber number = new MyNumber(5);
		System.out.println("The given number is prime ?:"+number.isPrime());
		System.out.println("The sum from 1 to N is : "+number.sumUpToN());
		System.out.println("The sum of divisor from 2 to N-1 is : "+number.sumOfDivisors());
		number.printANumberTriangle();
		
		
		
  
	}

}
