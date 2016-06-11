package com.technical.google;

public class MatrixFind {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1}};
		boolean x = searchMatrix(matrix,-1);
		if(x==true)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
	public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length-1;
        int col = matrix[0].length-1;
        int cur_row = 0;
        int cur_col = col;
        
        while(cur_row<=row && cur_col>=0)
        {
            if(matrix[cur_row][cur_col] == target)
            {
                return true;
            }
            if( matrix[cur_row][cur_col] < target)
            {
                cur_row++;
            }
            else
            {
               cur_col--; 
            }
        }
        return false;
        
        
        
    }

}
