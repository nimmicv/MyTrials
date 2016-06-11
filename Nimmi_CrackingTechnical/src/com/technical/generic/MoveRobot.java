package com.technical.generic;

import java.util.ArrayList;

public class MoveRobot {

	/**
	 * @param args
	 */
	char[][] matrix = {{'a','b','x','d'},{'e','f','g','x'},{'i','j','k','l'},{'m','n','o','p'}};
	static ArrayList<String> paths = new ArrayList<String>();
	static int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char[][] matrix = {{'a','b','c','d'},{'e','f','g','h'},{'i','j','k','l'},{'m','n','o','p'}};
		
		MoveRobot mr = new MoveRobot();
		mr.move_robot(0, 0, "");
		for(String Str : paths)
		{
			System.out.println(Str);
		}
		System.out.println("Path count = "+count);
	}
	
	public void move_robot(int i,int j,String path)
	{
		if(i>matrix.length-1 || j>matrix.length-1)
		{
			return;
		}
		path = path+"->"+matrix[i][j];
		if( i== matrix.length-1 && j == matrix.length-1)
		{
			count++;
			paths.add(path);
		}
		if((i+1<matrix.length) && matrix[i+1][j]!='x')
		{
			move_robot(i+1,j,path);
		}
		if((j+1<matrix.length) && matrix[i][j+1]!='x')
		{
			move_robot(i,j+1,path);
		}
	}

}
