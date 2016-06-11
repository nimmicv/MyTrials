package com.technical.google.dp;

public class EggDropping {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EggDropping.egg_drop(5,2);
	}
	
//	public int eggDrop(int n, int k)
//	{
//	    // If there are no floors, then no trials needed. OR if there is
//	    // one floor, one trial needed.
//	    if (k == 1 || k == 0)
//	        return k;
//	 
//	    // We need k trials for one egg and k floors
//	    if (n == 1)
//	        return k;
//	 
//	    int min = Integer.MAX_VALUE, x, res;
//	 
//	    // Consider all droppings from 1st floor to kth floor and
//	    // return the minimum of these values plus 1.
//	    for (x = 1; x <= k; x++)
//	    {
//	        res = Math.max(eggDrop(n-1, x-1), eggDrop(n, k-x));
//	        if (res < min)
//	            min = res;
//	    }
//	 
//	    return min + 1;
//	}
	
	public static void egg_drop(int floors, int eggs)
	{
		int[][] dp_egg_drop = new int[eggs+1][floors+1];
		for(int i=0;i<=eggs;i++)
		{
			for(int j=0;j<=floors;j++)
			{
				if(i==0||j==0)
				{
					dp_egg_drop[i][j]=0;
				}
				else
				if(i==1)
				{
					dp_egg_drop[i][j]=j;
				}
				else
				{
					dp_egg_drop[i][j] = Integer.MAX_VALUE;
					//if dropped, then [if broken dp_egg_drop[i-1][k-1]] [if not broken dp_egg_drop[i][j-k]]
					for(int k=1;k<=j;k++)
					{
						dp_egg_drop[i][j]=Math.min(dp_egg_drop[i][j],1+Math.max(dp_egg_drop[i-1][k-1], dp_egg_drop[i][j-k]));
					}
				}
			}
		}
		
		for(int i=0;i<=eggs;i++)
		{
			System.out.print("\n");
			for(int j=0;j<=floors;j++)
			{
				System.out.print(dp_egg_drop[i][j]+"\t");
			}
		}
		
	}
		

}
