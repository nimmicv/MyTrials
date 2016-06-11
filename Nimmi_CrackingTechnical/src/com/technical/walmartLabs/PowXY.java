package com.technical.walmartLabs;

public class PowXY {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2,4));
	}
	
	public static int power(int x,int y)
	{
		if(y==1)
		{
			return x;
		}
		return (x * power(x,y-1));
	}

}
