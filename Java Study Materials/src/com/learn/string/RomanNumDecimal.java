package com.learn.string;

public class RomanNumDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RomanNumDecimal nd = new RomanNumDecimal();
		int num = nd.romanToDecimal("MDCCCLXX");
		if(num ==-1)
		{
			System.out.println("Invalid entry");
		}
		else
		{
			System.out.println(num);
		}
	}
	
	public int romanToDecimal(String roman)
	{
		char[] value = roman.toCharArray();
		int x=0;
		int y =0;
		for(int i=0;i<value.length;i++)
		{
			y=getValue(value[i]);
			if(y == 0)
			{
				return -1;
			}
			if(i<(value.length-1))
			{
			  if(y<getValue(value[i+1]))	
			  {
				  y=-y;
			  }
			}
			x=x+y;
		}
		return x;
	}
	
	
	public int getValue(char ch)
	{
		switch(ch)
		{
		case 'I' :
			return 1;
		case 'V' :
           return 5;
		case 'X' :
			return 10;
		case 'L' :
			return 50;
		case 'C' :
			return 100;
		case 'D' :
			return 500;
		case 'M' :
			return 1000;
		default :
			return 0;
		}
		
	}

}
