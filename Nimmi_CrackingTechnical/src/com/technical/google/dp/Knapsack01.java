package com.technical.google.dp;

public class Knapsack01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] weight = {2,3,4,5,9};//8,7,5,1 // 
		int[] values = {3,4,5,8,10};
		int final_weight = 10;
		
		int[][] matrix = new int[weight.length+1][6];
		
		for(int i=0;i<=weight.length;i++)
		{
			for(int j=0;j<=5;j++)
			{
				if(i==0||j==0)
				{
					matrix[i][j]=0;
				}
				else
				{
					if(weight[i-1]>j)
					{
						matrix[i][j] = matrix[i-1][j];
					}
					else
					{
						matrix[i][j] = Math.max(values[i-1]+matrix[i-1][j-weight[i-1]], matrix[i-1][j]);
					}
				}
			}
		}
		for(int i=0;i<=weight.length;i++)
		{
			System.out.print("\n");
			for(int j=0;j<=5;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			
		}
	}

}
