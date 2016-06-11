package com.learn.divideconquer;

public class TowerofHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hanoi(3,'A','C','B');
    
	}
	
	public static void hanoi(int n, char from, char to, char inter)
	{
		if(n==1)
		{
			System.out.println("Move "+ n +" from "+from+ " to " + to);
		}
		else
		{
		   //move n-1 to inter so that nth one can be move to destination
			hanoi(n-1,from,inter,to);
			System.out.println("Move "+ n +" from "+from+ " to " + to);
			//move n-1 from inter to destination
			hanoi(n-1,inter,to,from);
		}
		
	}

}
