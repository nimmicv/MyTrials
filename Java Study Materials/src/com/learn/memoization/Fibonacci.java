package com.learn.memoization;

public class Fibonacci {
	static int[] fibmemo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Fibonacci f = new Fibonacci();
		
		fibmemo = new int[10];
		for(int i=0;i<=8;i++)
		{
			fibmemo[i]=-1;
		}
		
		int fib =f.fibonacci(8);
		System.out.println(fib);
	}
	
	public int fibonacci(int n)
	{
		int f;
		if(fibmemo[n]!=-1)
		{
			return fibmemo[n];
		}
		else
		if(n<=1)
		{
			fibmemo[n] = n;
			return n;
		}
		else
		{
			f = fibonacci(n-1)+fibonacci(n-2);
			fibmemo[n] = f;
			return f;
		}
		
		
	}

}
