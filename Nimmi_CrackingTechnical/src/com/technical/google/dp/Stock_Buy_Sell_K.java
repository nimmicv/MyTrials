package com.technical.google.dp;

public class Stock_Buy_Sell_K {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {2,5,7,1,4,3,1,3};
		int transaction =3;
		stock_sell_buy(values,3);
	}
	
	public static void stock_sell_buy(int[] values, int transaction)
	{
		int[][] dp_matrix = new int[transaction+1][values.length+1];
		
		for(int i=0;i<transaction+1;i++)
		{
			for(int j=0;j<values.length+1;j++)
			{
				if(i==0||j==0)
				{
					dp_matrix[i][j]=0;
				}
				else
				{			
					dp_matrix[i][j] = dp_matrix[i][j-1];//No transaction on jth day
					for(int k=1;k<j;k++)
					{
						dp_matrix[i][j] =Math.max(dp_matrix[i][j],values[j-1]-values[k-1]+dp_matrix[i-1][k]);						
					}
				}
			}
		}
		
		for(int i=0;i<transaction+1;i++)
		{
			System.out.println("\n");
			for(int j=0;j<values.length+1;j++)
			{
				System.out.print(dp_matrix[i][j]+"\t");
			}
		}
}

}
