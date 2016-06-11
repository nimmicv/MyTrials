package com.creercupYahoo.Matrix;

public class Paranthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paranthesis("",3,3);
	}
	
	public static void paranthesis(String s,int left,int right)
	{
		if(left>right)
		{
			return;
		}
		if(left ==0 && right ==0)
		{
			System.out.println(s);
		}
		if(left>0)
			paranthesis(s+"(",left-1,right);
		if(right>0)
			paranthesis(s+")",left,right-1);
	}

}
