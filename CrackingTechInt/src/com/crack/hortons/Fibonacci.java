package com.crack.hortons;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkFibNR(5));
	}
	
	public static int checkFib(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}
		else
		{
			return (checkFib(n-1)+checkFib(n-2));
		}
	}
	
	public static int checkFibNR(int n)
	{
		int a=0,b=1;
		if(n<=1)
		{
			return n;
		}
		else
		{
			for(int i=2;i<=n;i++)
			{
				int temp = a;
				a= b;
				b=temp+a;
			}
		}
		return b;
	}


}
