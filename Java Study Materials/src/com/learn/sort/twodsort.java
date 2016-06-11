package com.learn.sort;

public class twodsort {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array ={{1,2},{2,3},{50,43},{42,50},{48,36},{70,99},{70,89},{18,20}};
		System.out.println(array.length);
		int length = array.length;
		for(int i=length-1;i>0;i--)
			for(int j=0;j<i;j++)
			{
				if(array[j][0]>array[j+1][0] ) //&&array[j][1]>array[j+1][1])
				{
					array = swap(array , j, j+1);
				}
				else
				if(array[j][0]==array[j+1][0] && array[j][1]>array[j+1][1])
				{
					array = swap(array , j, j+1);
				}
			
			}
		
		for(int i=0;i<length;i++)
		{
			System.out.println(array[i][0]+","+array[i][1]);
		}
			

	}
	public static int[][] swap(int[][] array1, int x, int y)
	{
		int[] temp;
		temp = array1[x];
		array1[x]=array1[y];
		array1[y]=temp;
		return array1;
		
	}

}
