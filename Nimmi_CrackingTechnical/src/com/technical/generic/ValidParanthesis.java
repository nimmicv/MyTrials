package com.technical.generic;

public class ValidParanthesis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doParanthesis("",3,3);
	}
	
	public static void doParanthesis(String str, int left,int right)
	{
		if(left>right)
		{
			return;
		}
		if(left ==0 && right ==0)
		{
			System.out.println("Valid String = "+str);
			return;
		}
		if(left>0)
			doParanthesis(str+"(",left-1,right);
		if(right>0)
			doParanthesis(str+")",left,right-1);
	}
	

}
