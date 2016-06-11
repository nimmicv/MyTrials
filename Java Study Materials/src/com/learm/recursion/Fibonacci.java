package com.learm.recursion;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(2));
		System.out.println(nonrecfibonacci(2));
		System.out.println(fibonacci(4,4));
	}

	private static int fibonacci(int n) {
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
			return(fibonacci(n-1)+fibonacci(n-2));
		}
	}
	
	private static int fibonacci(int n, int k) {
		int fib=0;
		if(n<k)
		{
			return n;
		}
		else
		{
			
			for(int i=1;i<=k;i++)
			 fib = fib + fibonacci(n-i,k);			
		}
		return fib;
	}
	
	public static int nonrecfibonacci(int n)
	{
		int a=0,b=1;
		if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}
		int temp;
		for(int i=2;i<=n;i++)
		{
			temp = a;
			a=b;
			b= temp+b;
		}
		return b;
	}

}
