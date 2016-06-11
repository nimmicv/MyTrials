package com.technical.google.dp;

public class Paranthesis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generate(3,3,"");
	}
	
	public static  void generate(int left,int right,String s)
	{
		if(right<0 || left <0)
		{
			return;
		}
		if(right<left)
		{
			return;
		}
		if(left==0 && right==0)
		{
			System.out.println(s);
		}
		
		generate(left-1,right,s+'(');
		generate(left,right-1,s+')');
	}

}
