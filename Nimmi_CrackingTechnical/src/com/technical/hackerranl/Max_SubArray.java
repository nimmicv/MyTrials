package com.technical.hackerranl;

import java.util.Scanner;

public class Max_SubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num_cases = in.nextInt();
		for(int i=0;i<num_cases;i++)
		{
			int number = in.nextInt();
			int[] array = new int[number];
			for(int j=0;j<number;j++)
			{
				array[j] = in.nextInt();
			}
			long sum1 = 0;
			long maxsum1 = 0;
			long maxsum2 = 0;
			for(int k=0;k<array.length;k++)
			{
				sum1 = sum1+array[k];
				if(sum1<0)
				{
					sum1=0;
				}
				else
				if(sum1>maxsum1)
				{
					maxsum1 = sum1;
				}
				if(array[k]>0)
				{
					maxsum2 +=array[k];
				}
			}
			System.out.println(maxsum1+"\t"+maxsum2);
		}
		
		
		
	}

}
