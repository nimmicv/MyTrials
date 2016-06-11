package com.samsung.numbers;

public class Square_Root {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 50;
		if(Math.round(Math.sqrt(number))==Math.sqrt(number)){
			  //it is a perfect square
			System.out.println("Perfect Square");
			}
		else
		{
			System.out.println("Not perfect square");
		}
	}
//	Let's say you want the square root of 62.104. You pick a value halfway between 0 and that, 
//	and square it. If the square is higher than your number, you need to concentrate on numbers 
//	less than the midpoint. If it's too low, concentrate on those higher.

}
