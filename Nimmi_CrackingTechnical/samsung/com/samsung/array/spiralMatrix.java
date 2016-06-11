package com.samsung.array;

import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1},
					//{9,4,5,11,25},
					{9},
					{19}};
		for(int i=0;i<matrix.length;i++)
		{
			System.out.println();
			for(int j=0;j<matrix[0].length;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
		}
		List<Integer> list = new ArrayList<Integer>();
        if(matrix.length==0)
        {
            return;
        }
        System.out.print("\n");
        int layers = (int) Math.ceil((double)matrix.length/2);
		for(int i=0;i<layers;i++)
		{
			System.out.print("\n");
			for(int j=i;j<=matrix[0].length-i-1;j++)
			{
				list.add(matrix[i][j]);
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.print("\n");
			for(int k=i+1;k<=matrix.length-i-1;k++)
			{
				list.add(matrix[k][matrix[0].length-i-1]);
				System.out.print(matrix[k][matrix[0].length-i-1]+"\t");
			}
			System.out.print("\n");
			if(matrix.length-i-1 != i)
			{
				for(int k=matrix[0].length-i-2;k>=i;k--)
				{
					list.add(matrix[matrix.length-i-1][k]);
					System.out.print(matrix[matrix.length-i-1][k]+"\t");
				}
			}
			System.out.print("\n");
			for(int k=matrix.length-i-2;k>i;k--)
			{
				list.add(matrix[k][i]);
				System.out.print(matrix[k][i]+"\t");
			}
		}//return list;
        
	}

}
