 package com.technical.airbnb;

import java.util.HashMap;
import java.util.Map;

public class CoinCombinations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoinCombinations cc = new CoinCombinations();
		int[] coins = {1,2,3,5};
		cc.combo(coins, 7);
		 Map<Integer,Integer> map = new HashMap<Integer,Integer>();

	}
	
	
	public int combo(int[] coins,int sum)
	{

		int[] count = new int[sum+1];
		for(int i=0;i<count.length;i++)
		{
			count[i] = 0;
		}
		for(int i=1;i<=sum;i++)
		{
			for(int j=0;j<coins.length;j++)
			{
				if(coins[j]<=i)
				{
					if(count[i]==0)
					{
						count[i] = count[i-coins[j]]+1;
					}
					else
					{
						count[i] = Math.min(count[i], count[i-coins[j]]+1);
					}
				}
			}
		}
		for(int i=0;i<count.length;i++)
		{
			System.out.print(count[i]+"\t");
		}
		return count[sum];
		
	}

}
