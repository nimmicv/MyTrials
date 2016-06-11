package com.careercupYahoo.com;

public class DPLongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] s1 = "ABHFBH".toCharArray();
		char[] s2 = "ABFBH".toCharArray();
		int sum = findMaxSequence(s1,s2,0,0);
		System.out.println(sum);
		//findMaxSubSeq(s1,s2,s1.length,s2.length);
	}
	public static int findMaxSequence(char[] s1, char[] s2,int l1, int l2)
	{
		//Recursion
		if(l1>s1.length-1 || l2 >s2.length-1)
		{
			return 0;
		}
		if(s1[l1] == s2[l2])
		{
			int x = 1 +findMaxSequence(s1,s2,l1+1,l2+1);
			return x;
		}
		else
		{
			int le1 = findMaxSequence(s1,s2,l1+1,l2);
			int le2 = findMaxSequence(s1,s2,l1,l2+1);
			int y =Math.max(le1,le2);
			return y;
		}
		
	}
	
	
//	public static int findMaxSequence(char[] s1, char[] s2,int l1, int l2)
//	{
//		//Recursion
//		if(l1<0 || l2 <0)
//		{
//			return 0;
//		}
//		if(s1[l1] == s2[l2])
//		{
//			int x = 1 +findMaxSequence(s1,s2,l1-1,l2-1);
//			return x;
//		}
//		else
//		{
//			int le1 = findMaxSequence(s1,s2,l1-1,l2);
//			int le2 = findMaxSequence(s1,s2,l1,l2-1);
//			int y =Math.max(le1,le2);
//			return y;
//		}
//		
//	}
//	
	public static void findMaxSubSeq(char[] s1,char[] s2,int l1,int l2)
	{
		int[][] arr = new int[l1+1][l2+1];
		String[][] values = new String[l1+1][l2+1];
		
	
		
		for(int i=0;i<=l1;i++)
		{
			for(int j=0;j<=l2;j++)
			{
				if(i==0 || j==0)
				{
					arr[i][j] =0;
					values[i][j] = "";
				}
				else
				if(s1[i-1]==s2[j-1])
				{
				
						arr[i][j]=1+arr[i-1][j-1];
						values[i][j] = values[i-1][j-1] + s1[i-1];
					
				}
				else
				{
						if(arr[i][j-1] > arr[i-1][j])
						{
							arr[i][j] = arr[i][j-1];
							values[i][j] = values[i][j-1];
							
						}
						else
						{
							arr[i][j] = arr[i-1][j];
							values[i][j] = values[i-1][j];
						}		
				}
			}
		}
		
		for(int i=0;i<=l1;i++)
		{
			System.out.println();
			for(int j=0;j<=l2;j++)
			{
			   System.out.print(arr[i][j] + "\t");
			}
		}
		
		for(int i=0;i<=l1;i++)
		{
			System.out.println();
			for(int j=0;j<=l2;j++)
			{
			   System.out.print(values[i][j] + "\t");
			}
		}
		
		
	}

}
