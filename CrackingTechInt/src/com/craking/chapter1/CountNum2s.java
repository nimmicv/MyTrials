package com.craking.chapter1;

public class CountNum2s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CountNum2s cm = new CountNum2s();
		System.out.println(cm.count2s(21));
	}
	
	public int count2s(int num)
	{
		//Count numbers sees so that is can be added if the original number starts with a two
		int numberseen = 0 ;
		int count =0;
		//1 is last position of digit
		int position = 1;
		while(num>0)
		{
			int digit = num%10;
			//
			if(digit < 2) 
			{
				count = count + digit*calculatePower(position-1);
				
			}
			else
			if(digit == 2) // 27 = count + 2*1 + 7 +  1
			{
				count = count + digit*calculatePower(position-1)+numberseen+1;
				
			}
			else
			// 7 => 1	
			if(digit>2)
			{
				count = (int) (count + digit*calculatePower(position-1) + Math.pow(10, position-1));// 600 = count +6 *100 + 200 - 299((10^2))
			}
			num=num/10;
			numberseen = numberseen + (int) ( digit * Math.pow(10, position-1));
			position = position +1;

		}
		return count;
	}
	
	public int calculatePower(int n)
	{
		if(n<=0)
		{
			return 0;
		}
		int power = (int) Math.pow(10, n-1);
		int value = n * power;
		return value;
		
	}

}
