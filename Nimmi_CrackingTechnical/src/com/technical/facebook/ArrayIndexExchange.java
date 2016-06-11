package com.technical.facebook;

public class ArrayIndexExchange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a = {'c','d','e','f','g'};
		int[] b = {3,0,4,1,2};
		int i=0,j=0;
		while(i<a.length)
		{
			if(b[j]==i)
			{
				i++;
				j++;
			}
			else
			{
				while(b[j]!=i)
				{
					int x = b[b[j]];
					char temp = a[b[j]];
					a[b[j]] = a[i];
					b[b[j]] = b[j];
					a[i]=temp;
					b[j]=x;
					
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
	}

}
