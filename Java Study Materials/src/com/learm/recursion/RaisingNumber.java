package com.learm.recursion;

public class RaisingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RaisingNumber rn = new RaisingNumber();
      System.out.println(rn.raise(2,4));
	}
	
	public int raise(int x,int y)
	{
		if(y==1)
		{
			return x;
		}
		else
		{
			return x*raise(x,(y-1));
		}
	}

}
