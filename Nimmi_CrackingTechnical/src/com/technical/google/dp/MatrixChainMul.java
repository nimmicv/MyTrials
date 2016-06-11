package com.technical.google.dp;

public class MatrixChainMul {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix ={{2,3},{3,6}};//{6,4},{4,5},{5,10}};
		int[] array = {2,3,4,6};//,4,5,10};//{2,3}
		System.out.println(matrixChainMul_top_down(array,1,3));
		matrixChainMul_bottom_up(array,array.length);
	}
	
	//Top-Down
	public static int matrixChainMul_top_down(int[] array,int start,int end)
	{
		if(start==end)
		{
			return 0;
		}
		int min = Integer.MAX_VALUE;
		for(int k=start;k<end;k++)
		{
			min = Math.min(min,(matrixChainMul_top_down(array,start,k)+
					matrixChainMul_top_down(array,k+1,end)+
					array[start-1]*array[k]*array[end]));					
		}
		return min;
	}
	//Bottom-up
	public static int matrixChainMul_bottom_up(int[] array,int n)
	{
		int[][] dp_matrix = new int[array.length][array.length];
		
		for(int i=0;i<array.length;i++)
		{
			dp_matrix[i][i]=0;
		}
		int ln=2;
		while(ln<array.length)
		{
			for(int i=0;i<array.length;i++)
			{
				int k=ln+i;
				if(k<array.length)
				{
					//{2,3,4,6}=>{2,3},{3,4},{4,6}
					dp_matrix[i][k] = Integer.MAX_VALUE;
					for(int j=i+1;j<k;j++)
					{
						int val = dp_matrix[i+1][j]+dp_matrix[j+1][k]+array[i]*array[j]*array[k];
						dp_matrix[i+1][k]=Math.min(dp_matrix[i][k],val);
					}
				}
				
			}
			ln = ln+1;
		}
		return 0;
	}

}
