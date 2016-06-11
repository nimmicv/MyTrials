package com.technical.google.dp;

import java.util.ArrayList;

public class Subset_Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean subset_sum(ArrayList<Integer> list,int n, int sum)
	{
		if(sum==0)
			return true;
		if(n==-1 && sum!=0)

			return false;

				int num = list.get(n);
				if(num<=sum)
				{
					return subset_sum(list,n-1,sum-list.get(n)) || subset_sum(list,n-1,sum);
				}
				else
				{
					return subset_sum(list,n-1,sum);
				}

		//return false;
	}

}
