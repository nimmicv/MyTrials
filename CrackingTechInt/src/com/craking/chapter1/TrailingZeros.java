package com.craking.chapter1;

public class TrailingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrailingZeros tz = new TrailingZeros();
		System.out.println(tz.findTrailingZeros(125));
	}

	public int findTrailingZeros(int num)
	{
		int i=5;
		int count =0;
		while(num/i>0)
		{
		 count = count + (int)(num/i) ;	
		 i=i*5;
		}
		return count;
	}
}
