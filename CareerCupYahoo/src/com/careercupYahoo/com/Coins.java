package com.careercupYahoo.com;

import java.util.ArrayList;

public class Coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {1,2,5,10};
		ArrayList<Integer> list = new ArrayList<Integer>();
		Coins cs = new Coins();
		int sum = 22;
		//ArrayList<Integer> answer = cs.sumCoins(coins, 23, list);
		int n= coins.length-1;
		while(sum >0)
		{
			while(n>0 && coins[n]>sum)
			{
				n--;
			}
			sum = sum - coins[n];
			list.add(coins[n]);
		}
		for(Integer i : list)
		{
			System.out.print(i+"\n");
		}
	}
	
	public ArrayList<Integer> sumCoins(int[] coins, int sum, ArrayList list)
	{
		if(sum == 0)
		{
			return list;
		}
		int n = coins.length-1;
		
		while(n>0 && coins[n]>sum)
		{
			n--;
		}
		list.add(coins[n]);
		sum = sum - coins[n];
		return sumCoins(coins,sum,list);
	}
 
}
