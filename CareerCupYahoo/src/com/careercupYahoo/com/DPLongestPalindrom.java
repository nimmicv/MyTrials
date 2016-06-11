package com.careercupYahoo.com;

public class DPLongestPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "bmam";
		char[] values= s.toCharArray();
		int length = values.length;
		int[][] pls = new int[length][length];
		int start =-1;
		int end = -1;
		int longCount =0;
		
		
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				if(i==j)
				{
					pls[i][j] = 1;
				}
				else
				{
					pls[i][j] =0;
				}
			}
		}
		// Compare 2,3..n sequence from beginning and generate 2d array , memoization with DP
		for(int ln=2;ln<length;ln++)
		{
			for(int i=0;i<(length-ln+1);i++)
			{
				int j = i+(ln-1);
				
				if(values[i]==values[j])
				{
					if(ln==2)
					{
						pls[i][j]=2;
					}
					else
					{
						pls[i][j] = pls[i+1][j-1]+2;
					}
					if(pls[i][j]>longCount)
					{
						longCount = pls[i][j];
						start =i;
						end = j;
					}
				}
				
				
			}
		}
		for(int i=start;i<=end;i++)
		{
			System.out.print(values[i]);
		}
		System.out.println();
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				System.out.print(pls[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
	}

}
