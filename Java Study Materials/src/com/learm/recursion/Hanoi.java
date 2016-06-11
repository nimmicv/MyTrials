package com.learm.recursion;

public class Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hanoi hn = new Hanoi();
		hn.TowerOfHanoi(3, 'a', 'c', 'b');
	}
	
	public void TowerOfHanoi(int rod, char src, char dest, char inter)
	{
		
		if(rod == 1)
		{
			System.out.println("Move " + rod +" from "+ src +" to " + dest );
			return;
		}
		
		TowerOfHanoi(rod-1,src,inter,dest);
		System.out.println("Move " + rod +" from "+ src +" to " + dest );
		TowerOfHanoi(rod-1,inter,dest,src);
		
	}

}
