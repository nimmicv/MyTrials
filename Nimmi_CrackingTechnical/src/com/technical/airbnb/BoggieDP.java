package com.technical.airbnb;

public class BoggieDP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void boggies(int[][] matrix,int i,int j)
	{
		
		boggies(matrix,i-1,j);
		boggies(matrix,i-1,j+1);
		boggies(matrix,i-1,j-1);
		boggies(matrix,i+1,j);
		boggies(matrix,i+1,j+1);
		boggies(matrix,i+1,j-1);
		boggies(matrix,i,j+1);
		boggies(matrix,i,j-1);
		
	}

}
