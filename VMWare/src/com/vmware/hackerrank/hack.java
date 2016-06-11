package com.vmware.hackerrank;

import java.util.HashSet;
import java.util.Scanner;

class Position
{
	int x;
	int y;
	public Position(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public String toString()
	{
		return x+"-"+y;
	}
}

public class hack {
	
	public enum Direction{
		EAST,SOUTH,NORTH,WEST;
	}
	public enum Moves{
		RIGHT,LEFT,GO;
	}
	
	public Position getNextMove(Position P, Direction current_dir)
	{
		if(current_dir == Direction.WEST)
		{
			P.x = P.x-1;
		}
		else
		if(current_dir == Direction.EAST)
		{
			P.x = P.x+1;
		}
		else
		if(current_dir == Direction.NORTH)
		{
			P.y = P.y+1;
		}
		else
		if(current_dir == Direction.SOUTH)
		{
			P.y = P.y-1;
		}
		return P;
	}
	
	public Direction getCurrentDir(Direction dir, Moves move)
	{
		Direction current_dir = dir;
		if(move == move.LEFT)
		{
			if(dir == Direction.EAST)
			{
				current_dir = Direction.NORTH;
			}
			if(dir == Direction.WEST)
			{
				current_dir = Direction.SOUTH;
			}
			if(dir == Direction.NORTH)
			{
				current_dir = Direction.WEST;
			}
			if(dir == Direction.SOUTH)
			{
				current_dir = Direction.EAST;
			}
		}
		else
		if(move == move.RIGHT)
		{
			if(dir == Direction.EAST)
			{
				current_dir = Direction.SOUTH;
			}
			if(dir == Direction.WEST)
			{
				current_dir = Direction.NORTH;
			}
			if(dir == Direction.NORTH)
			{
				current_dir = Direction.EAST;
			}
			if(dir == Direction.SOUTH)
			{
				current_dir = Direction.WEST;
			}
		}
		return current_dir;
			
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	HashSet<String> set = new HashSet<String>();
	String s = sc.nextLine();
	System.out.println(s);
	char[] x = s.toCharArray();
	
	}

}
