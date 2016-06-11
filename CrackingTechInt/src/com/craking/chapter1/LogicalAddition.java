package com.craking.chapter1;

public class LogicalAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogicalAddition ls = new LogicalAddition();
		System.out.println(ls.addMeRecurse(25, 60));
	}
	
	public int addMe(int num1, int num2)
	{
		int sum = num1;
		int result = num1;
		int carry = num2;
		while(carry >0)
		{
			result = sum^carry;
			carry = (sum&carry) <<1;
			sum = result;
		}
		return result;
	}
	
	public int addMeRecurse(int num1, int num2)
	{
		if(num2 ==0)
		{
			return num1;
		}
		
		int sum = num1 ^ num2;
		int carry = (num1 & num2)<<1;
		return addMeRecurse(sum,carry);
	}

}
