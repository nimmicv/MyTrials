package com.samsung.binary;

public class BinaryInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 125;
		int y = x & -x;
		System.out.println(Integer.toBinaryString(y));
	}

}
