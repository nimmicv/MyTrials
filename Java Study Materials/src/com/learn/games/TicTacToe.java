package com.learn.games;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.Scanner;

public class TicTacToe {
	static int n=3;
	static int[][] x ;
	static int red = 0;
	static int blue =1;
    static int count;
    static int currentrow =-1;
    static int currentcol =-1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x = new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
			{
				x[i][j] = -1;
			}
		int player =0;
		int flag=-1;
		while(!checkifFull())
		{
			player = (player+1)%2;
			display();
			play(player);
			x[currentrow][currentcol] = player;
			count++;
			if(checkifWon(currentrow,currentcol,player))
			{
				if(player ==0)
					System.out.println("Congrats !! Red Won");
				else
					System.out.println("Congrats !! Blue Won");
				flag=0;
				break;
			}
		}
		if(flag==-1)
		{
			display();
			System.out.println("It is a Tie!!");
		}
		

	}
	
	public static void play(int color)
	{
		if(color == 0)
			System.out.println("Red playing");
		else
			System.out.println("Blue Playing");	
		System.out.println("Enter the row : ");
		String row = new Scanner(System.in).next();
		System.out.println("Enter the column : ");
		String column = new Scanner(System.in).next();
		currentrow = Integer.parseInt(row);
		currentcol = Integer.parseInt(column);
		
	}
	public static void display()
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(" ");
			for(int j=0;j<n;j++)
				System.out.print(x[i][j] + " ");
		}
		
	}
	
	public static boolean checkifWon(int row, int column, int color)
	{
		int temprow = 0;
		int tempcol = 0;
		int countnew=0;
		//Check for row
		while(tempcol<n)
		{
			if (x[row][tempcol]==color)
				tempcol++;
			else
				break;	
		}
		if(tempcol == n)
			return true;
		//Check for column
		while(temprow<n)
		{
			if (x[temprow][column]==color)
				temprow++;
			else
				break;
		}
		if(temprow== n)
			return true;
		//diagonal
		if(row==column)
		{
			temprow=0;
			tempcol=0;
			while(temprow>n && tempcol>n)
			{
				if (x[temprow][column]==color)
				{
					temprow++;
					tempcol++;
				}
				else
					break;
			}
			if(temprow==n && tempcol==n)
				return true;
			//anti- diagonal
			if(row == n/2 && column==n/2)
			{
				temprow=0;
				tempcol=n-1;
				while(temprow<n && tempcol>=0)
				{
					if (x[temprow][column]==color)
					{
						temprow++;
						tempcol--;
					}
					else
						break;
				}
				if(temprow==n && tempcol ==-1)
				{
					return true;
				}
			}
			
		}
			
		return false;
	}
	
	public static boolean checkifFull()
	{
		if(count==(n*n))
			return true;
		else
			return false;
	}

}
