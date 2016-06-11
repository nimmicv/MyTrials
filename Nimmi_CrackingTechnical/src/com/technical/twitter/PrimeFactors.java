package com.technical.twitter;

public class PrimeFactors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 29;
		while(x%2==0)
		{
			System.out.println("prime factor = "+ 2);
			x=x/2;
		}
		for(int i=3;i<=Math.sqrt(x);i=i+2)
		{
			while(x%i==0)
			{
				System.out.println("prime factor = "+ i);
				x=x/i;
			}
		}
		if(x>2)
		{
			System.out.println("prime factor = "+ x);
		}

	}

}
