package com.samsung.thread;

public class vol {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		s = s.replace('a', 'b');
		System.out.println(s);

	}
	//This means that threads will automatically see the most up-to-date value for volatile variables.

}
