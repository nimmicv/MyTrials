package com.technical.google.dp;

import java.util.ArrayList;

public class NumberOfLength {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<=9;i++)
		{
			getNumbers(4,list,1,i);
		}
		for(int x: list)
		{
			System.out.println(x);
		}
	}
	
	public static void getNumbers(int n,ArrayList<Integer> list, int size,int number)
	{
		if(size == n)
		{
			list.add(number);
			return;
		}
		int num = number%10;
		if(num-4 >0)
		{
			getNumbers(n,list,size+1,((number*10)+(num-4)));	
		}
		if(num+4 <10)
		{
			getNumbers(n,list,size+1,((number*10)+(num+4)));	
		}

		
	}

}
