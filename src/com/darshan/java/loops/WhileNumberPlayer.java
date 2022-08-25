package com.darshan.java.loops;

public class WhileNumberPlayer {
	
	private int number;
	

	public WhileNumberPlayer(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	public void printSquareUptoLimit()
	{
		int i=1;
		while((i*i)<this.number)
		{
			System.out.print(i*i+" ");
			i++;
		}
		System.out.println();
	}
	public void printCubeUptoLimit()
	{
		int i=1;
		while((i*i*i)<this.number)
		{
			System.out.print(i*i*i+" ");
			i++;
		}
		System.out.println();
	}

}
