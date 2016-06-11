package com.learn.string;

public class DecimalToRoman {
	
	int[] values = {1,4,5,9,10,40,50,90,100,400,500,900,1000};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalToRoman drm = new DecimalToRoman();
		System.out.println(drm.evaluate(1870));
	}
	
	public String evaluate(int num)
	{
		int count;
		String romanNum="";
		while(num>0)
		{
			int i=0;
			while(i<values.length && num>=values[i])
			{
				i++;
			}
			i--;
			count = num/values[i];
			for(int j=0;j<count;j++)
			{
				romanNum = romanNum+getValue(values[i]);
			}
			num=num%values[i];
		}
		return romanNum;
		
	}
	
	public String  getValue(int x)
	{
		switch(x)
		{
		case 1: return "I";
		case 4: return "IV";
		case 5: return "V";
		case 9:	return "IX";
		case 10: return "X";
		case 40: return "XL";
		case 50: return "L";
		case 90: return "XC";
		case 100: return "C";
		case 400: return "CD";
		case 500: return "D";
		case 900: return "CM";
		case 1000: return "M";
		default :  return null;
		
		}
	}

}
