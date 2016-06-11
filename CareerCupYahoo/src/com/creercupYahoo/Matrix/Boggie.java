package com.creercupYahoo.Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Boggie {
	
	static Set<String> st = new HashSet<String>(Arrays.asList("bat", "nerd","term","meant","one","dear")); 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] matrix = {{'b','a','t'},{'o','n','e'},{'d','r','m'}};
		int length = matrix.length;
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0; i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				String s = "" + matrix[i][j];
				BoggieFind(matrix,s, i, j, length, list);
				System.out.println(" size of list with i "+i+" j "+ j+" = "+list.size());
			}
			for(String s: list)
			{
				System.out.println(s);
			}
		}
		

	}
	
	public static void BoggieFind(char[][] matrix, String s , int row , int col, int length, ArrayList<String> list)
	{
		
		if(st.contains(s)){
			list.add(s);
		}
		if(row+1 < length && s.indexOf(matrix[row+1][col]) == -1)
			BoggieFind(matrix,s+matrix[row+1][col],row+1,col,length, list);
		if(col+1<length && s.indexOf(matrix[row][col+1]) == -1)
			BoggieFind(matrix,s+matrix[row][col+1],row,col+1,length, list);
		if(col+1<length && row+1<length && s.indexOf(matrix[row+1][col+1]) == -1)
			BoggieFind(matrix,s+matrix[row+1][col+1],row+1,col+1,length, list);
		if(row-1>=0 && s.indexOf(matrix[row-1][col]) == -1)
			BoggieFind(matrix,s+matrix[row-1][col],row-1,col,length, list);
		if(col-1>=0 && s.indexOf(matrix[row][col-1]) == -1)
			BoggieFind(matrix,s+matrix[row][col-1],row,col-1,length, list);
		if(row-1>=0 && col-1>=0 && s.indexOf(matrix[row-1][col-1]) == -1)
			BoggieFind(matrix,s+matrix[row-1][col-1],row-1,col-1,length, list);
		if(row-1>=0 && col+1 <length && s.indexOf(matrix[row-1][col+1]) == -1)
			BoggieFind(matrix,s+matrix[row-1][col+1],row-1,col+1,length, list);
		if(row+1<length && col-1 >=0 && s.indexOf(matrix[row+1][col-1]) == -1)
			BoggieFind(matrix,s+matrix[row+1][col-1],row+1,col-1,length, list);
			
		
		
	}

}
