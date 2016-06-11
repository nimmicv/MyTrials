package com.learn.bitmanipulation;

public class tweaknum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a= 17;
		int b=6;
		int i=1,j=3;
		
		int x = 0;
		while(j>0)
		{
			
			x=x<<1;
			x=x|1;
			j--;
		}
		System.out.println(x);
		while(i>0)
		{
			x=x<<1;
			b=b<<1;
			i--;
		}
		System.out.println(x);
		x=~x;
		a=a&x;
		System.out.println(a);

		System.out.println(a|b);
		
	}

}
