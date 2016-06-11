package com.creercupYahoo.Matrix;

import java.util.ArrayList;

public class RobotMove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] matrix = {{'a','b','c','d'},{'e','f','g','h'},{'i','j','k','l'},{'m','n','o','p','q'}};
		ArrayList<String> pathList = new ArrayList<String>();
		moveRobot(matrix,"",0,0,matrix.length-1,pathList);
		int i =1 ;
		for(String str : pathList)
		{
			System.out.println(i + " = " + str);
			i++;
		}
		int cn = moveRobotCount(0,0,0,matrix.length-1);
		System.out.println("Count =" + cn);
	}
	
	public static void moveRobot(char[][] matrix , String s, int row, int col, int length, ArrayList<String> pathList)
	{
		if(row == length && col == length)
		{
			System.out.println("S = "+ s);
			pathList.add(s+"->"+matrix[row][col]);
		}
		if(row>length || col>length)
		{
			return;
		}
		else
		{
			moveRobot(matrix,s+"->"+matrix[row][col],row+1,col,length,pathList);
			moveRobot(matrix,s+"->"+matrix[row][col],row,col+1,length,pathList);
		}
		
	}
	public static int count;
	public static int moveRobotCount(int cnt,int row, int col, int length)
	{
		if(row == length && col == length)
		{
			cnt++;
			return cnt;
			
		}
		if(row>length || col>length)
		{
			//return count;
			return cnt;
		}
		else
		{
			int up = moveRobotCount(cnt,row+1,col,length);
			int down = moveRobotCount(up,row,col+1,length);
			return down;
		}
		
	}
}
