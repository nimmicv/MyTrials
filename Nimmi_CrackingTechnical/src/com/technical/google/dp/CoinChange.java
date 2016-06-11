package com.technical.google.dp;

public class CoinChange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {1,2,3};
		int sum = 5;
		getNumWays(coins,sum);
	}
	
	public static void getNumWays(int[] coins,int sum)
	{
		int[][] dp_array = new int[coins.length][sum+1];
		for(int i=0;i<coins.length;i++)
		{
			for(int j=0;j<=sum;j++)
			{
				if(j==0)
				{
					dp_array[i][j]=1;
				}
				else
				if(i==0)
				{
				   if(j%coins[i]==0)
				   {
					   dp_array[i][j]=1;
				   }
				   else
				   {
					   dp_array[i][j]=0;  
				   }
				}
				else
				{
					if(coins[i]>j)
						dp_array[i][j]=dp_array[i-1][j];
					else
						dp_array[i][j]=dp_array[i-1][j]+dp_array[i][j-coins[i]];
				}
			}
		}
		for(int i=0;i<coins.length;i++)
		{
			System.out.print("\n");
			for(int j=0;j<=sum;j++)
			{
				System.out.print(dp_array[i][j]+"\t");
			}
		}

		System.out.println(dp_array[coins.length-1][sum]);
	}

}
