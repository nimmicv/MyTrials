package com.google.rec;

public class Hanoi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TOH(3,"src","temp","dest");
	}
	
	public static void TOH(int disks,String src,String temp, String dest)
	{
		if(disks == 0)
		{
			return;
		}
		TOH(disks-1,src,dest,temp);
		System.out.println("Move disk "+disks+" from "+src+" to "+dest+" using "+temp );
		TOH(disks-1,temp,src,dest);
	}

}
