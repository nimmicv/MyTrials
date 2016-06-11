package com.technical.twitter;

public class Multiply {
	
	public static void main(String[] args)
	{

		char[] a = {'2','3','4'};
		char[] b = {'1','2'};
		
		char[] result = new char[a.length+b.length];
		for(int i=0;i<result.length;i++)
		{
			result[i] = '0';
		}
		int index = result.length-1;
		for(int i=a.length-1;i>=0;i--)
		{
			
			int carry = 0;
			int s=index;
			for(int j=b.length-1;j>=0;j--)
			{
				int num = (Character.getNumericValue(a[i])*Character.getNumericValue(b[j]))+carry+Character.getNumericValue(result[s]);
				int value = num%10;
				carry = num/10;
				result[s]= Character.forDigit(value, 10);
				s--;
				
			}
			result[s]=Character.forDigit(carry, 10);
			index--;
		}
		
		System.out.println("result =" + new String(result));
		
	}

}
