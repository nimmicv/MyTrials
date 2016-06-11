package com.creercupYahoo.Matrix;

public class MatrixSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] matrix = new char[4][4];
		char letter = 'W';
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				matrix[i][j] = letter;
			}
			
		}
		int len = 3;
		for(int i=0;i<4;i++)
		{
			for(int j=1;j<4;j++)
			{
				matrix[i][j] = 'B';
			}
		}
		
		for(int i=0;i<4;i++)
		{
			System.out.println("\n");
			for(int j=0;j<4;j++)
			{
				System.out.print(matrix[i][j] + "\t");
			}
		}
		
		MatrixSquare sqr = new MatrixSquare();
		sqr.findMatrix(matrix, matrix.length);
	}
	
	public boolean checkSquare(char[][] matrix,int row, int col, int length)
	{
		int j = col;
		int flag = 0;
		for(int i= row;i<length;i++)
		{
			if(matrix[i][j] == 'W' || matrix[i][j+length-1] =='W')
			{
				return false;	
			}
		}
		int i = row;
		for(j= col;j<length;j++)
		{
			if(matrix[i][j] == 'W' || matrix[i+length-1][j] =='W' )
			{
				return false;	
			}
		}
		
		return true;
	}
	
	public void findMatrix(char[][] mat, int length)
	{
		int maxi=-1;
		int maxj =-1;
		int maxLen = -1;
		int Length = mat.length;
		for(int col =0 ;col<length;col++)
		{
			for(int row=0;row<length;row++)
			{
				int size =length - Math.max(col, row);
				while(size>0 && maxLen<size)
				{
					if(checkSquare(mat,row,col,size))
					{
						maxi = row;
						maxj = col;
						maxLen = size;
					}
					size--;
				}
				
			}
		}
		System.out.println(" Row = " +maxi +" Col = "+maxj + " Length = "+ maxLen);
	}

}
