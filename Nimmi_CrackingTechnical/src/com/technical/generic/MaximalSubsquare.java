package com.technical.generic;
//Find Largest subsquare with only border 0's
public class MaximalSubsquare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] mat = {{'1','1','0','1'},{'1','1','0','1'},{'1','1','1','1'}};
		//char[][] mat ={{'0','1'}};
		System.out.println(mat.length);
		System.out.println(mat[0].length);
		System.out.println(maximalSquare(mat));
	}

	static int maxcol=0;static int maxrow=0;static int maxlength =0;
    public static int maximalSquare(char[][] matrix) {
    	
        int numrow = matrix.length;
        int numcol = matrix[0].length;
        int length_max = numrow>numcol?numrow:numcol;
        int length_min = numrow<numcol?numrow:numcol;
        char x='1';
        if(x == '1')
        {
        	
        }
        for(int col=0;col<numcol;col++)
        {
        	for(int row=0;row<numrow;row++)
        	{
        		int size = length_max - Math.max(col, row);
        		if((row+size) > numrow)
        		{
        			size = numrow-row;
        		}
        		else
        		if((col+size) > numcol)
        		{
        			size = numcol-col;
        		}
        		while(size>0 && size>maxlength)
        		{
        		   if(checksquare(matrix,col,row,size))
        		   {
        		       maxlength = size;
        		   }
        		   size--;
        		}
        		
        	}
        }
        return (maxlength*maxlength);
        
    }
    
    public static boolean checksquare(char[][] matrix, int col, int row, int size)
    {
        for(int i=0;i<size;i++)
        {
            if(matrix[row][col+i] != '1' || matrix[row+size-1][col+i] != '1')
            {
                return false;
            }
        }
        for(int j=1;j<size-1;j++)
        {
            if(matrix[row+j][col] != '1' || matrix[row+j][col+size-1] != '1')
            {
                return false;
            }
        }
        return true;
    }
}
