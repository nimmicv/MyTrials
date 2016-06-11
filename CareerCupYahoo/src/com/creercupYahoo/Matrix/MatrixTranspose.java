package com.creercupYahoo.Matrix;

public class MatrixTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[5][5];
		int[][] array2 = array.clone();
		int k = 1;
		for(int i=0;i<5;i++)
		{
			System.out.println("\n");
			for(int j=0;j<5;j++)
			{
				array[i][j] = k++;
				System.out.print(array[i][j] + "\t");
			}
		}
		
//		for(int i=0;i<4;i++)
//		{
//			for(int j=0;j<i;j++)
//			{
//				int temp = array[i][j];
//				array[i][j] = array[j][i];
//				array[j][i] = temp;
//			}
//		}
//		System.out.println("\n \nTranspose Matrix :: ");
//		for(int i=0;i<4;i++)
//		{
//			System.out.println("\n");
//			for(int j=0;j<4;j++)
//			{
//				System.out.print(array[i][j] + "\t");
//			}
//		}
		int x = array.length/2;
		int len = array.length -1;
		for(int i=0;i<x;i++)
		{
			int start = i;
			int end =  len -i;
			for(k=start;k<end;k++)
			{
				int temp = array[k][end];
				array[k][end] = array[start][k];
				array[start][k] = array[end+start-k][start];
				array[end+start-k][start] = array[end][end+start-k];
				array[end][end+start-k] = temp;
			}
		}
		System.out.println("\n\n Output Matrix :: \n");
		for(int i=0;i<5;i++)
			{
				System.out.println("\n");
				for(int j=0;j<5;j++)
				{
					System.out.print(array[i][j] + "\t");
				}
			}
		
	}
	
	

}
