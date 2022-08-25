package com.darshan.java.loops;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		do {
			System.out.print("Enter a number: ");
			number = sc.nextInt();
			if (number < 0) {
				System.out.println("Thank you! Have Fun!");
			}
			else {
				System.out.println("Cube is " + number * number * number);
			}
		} 
		while (number >= 0);
		sc.close();

	}

}
