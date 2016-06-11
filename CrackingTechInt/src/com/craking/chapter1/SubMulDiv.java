package com.craking.chapter1;

public class SubMulDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubMulDiv smd = new SubMulDiv();
		System.out.println(smd.divideMe(25, 5));
		System.out.println(smd.negateMe(25));
		System.out.println(smd.subtractMe(25, 24));
	}
	
	public int negateMe(int num)
	{
		int negval =0;
		if(num !=0)
		{
			while(num !=0)
			{
			int val = (num>0)?-1:1;
			negval = negval + val;
			num = val + num;
			}
		}
		return negval;
	}
	
	public int subtractMe(int num1,int num2)
	{
		
		int val = num1 + negateMe(num2);
		return val;
	}
	
	public int divideMe(int num1, int num2)
	{
	  int x = num1>num2?num1:num2;
	  int y = num1<num2?num1:num2;
	  int count =0;
	   while(x >0 && x>=y)
	   {
		   count ++;
		   x = x + negateMe(y);
	   }
		return count;
	}

}
