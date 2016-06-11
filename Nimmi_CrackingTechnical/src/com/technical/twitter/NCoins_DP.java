package com.technical.twitter;

public class NCoins_DP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] coins = {1,5,10};
		int[] min={0,0,0,0,0,0};
		min[0]=0;
		for(int i=1;i<5;i++)
		{
			int s = i;
			for(int j=0;j<coins.length;j++)
			{
				if(coins[j]<=s)
				{
					if(min[s]==0)
						min[s]=min[s-coins[j]]+1;//s=s-coins[j]+coins[j] count = count[s-coins[j]]+1
					else
						min[s]=Math.min(min[s], min[s-coins[j]]+1);
				}
			}
		}
		for(int i=0;i<min.length;i++)
		{
			System.out.println("Sum = "+i+" Count = "+min[i]);
		}
		// TODO Auto-generated method stub

	}
	
	public int DP_minCoins(int[] coins, int[] values, int i)
	{
		if(i==0)
		{
			return 0;
		}
		return -1;
	}

}
