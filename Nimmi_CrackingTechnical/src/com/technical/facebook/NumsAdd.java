package com.technical.facebook;

import java.util.ArrayList;

public class NumsAdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ArrayList<Integer> list = new ArrayList<Integer>();
		//1098
		list.add(9);
		list.add(9);
		list.add(9);
		int x = 99;
		int rem =0;
		
		for(int i=list.size()-1;i>=0;i--)
		{
			int add = x%10;
			x=x/10;
			int num = rem + list.get(i)+add;
			rem = num/10;
			list.set(i,num%10);
					
		}
		if(rem>0)
		{
			list.add(0,rem);
		}
		for(int i : list)
		{
			System.out.print(i+",");
		}
	}

}
