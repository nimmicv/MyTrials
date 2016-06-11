package com.learm.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnagramApp {
	static int size;
	static int count;
	static char[] arrChar = new char[100];
	static String input = null;
	static int newsize;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a word: ");
		StringBuffer bf = new StringBuffer("abc");
	
		try {
			input = getString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		size = input.length();
		count = 0;
		for (int j = 0; j < size; j++)
			arrChar[j] = input.charAt(j);
		//doAnagram(size);
		newsize = size;
		permute(newsize);
		// get word
		// find its size // put it in array // anagram it
	}
	
	public static void permute(int recsize)
	{
		if(recsize ==1)
			return;
		for(int j=0; j< recsize;j++)
		{
			permute(recsize-1);
			rotate(recsize);
			if(recsize==2)
			displayWord();
		}
			
	}

	public static void doAnagram(int newSize) {
		if (newSize == 1)
			return;

		//for (int j = 0; j < newSize; j++) {
			//System.out.println("j = "+ j +" , "+"newSize =" + newSize);
			doAnagram(newSize - 1);
			if (newSize == 2)
				displayWord();
			rotate(newSize);
		//}
	}

	public static void rotate(int newSize) {
		int j;
		int position = size - newSize;
		char temp = arrChar[position];
		for (j = position + 1; j < size; j++)
			arrChar[j - 1] = arrChar[j];
		arrChar[j - 1] = temp;
		String s = new String(arrChar).trim();
		//displayWord();
	}

	public static void displayWord() {
		if (count < 99)
			System.out.print(" ");
		if (count < 9)
			System.out.print(" ");
		System.out.print(++count + " ");
		
		for (int j = 0; j < size; j++)
			System.out.print(arrChar[j]);
		System.out.print(" ");
		System.out.flush();
		if (count % 6 == 0)
			System.out.println("");
	}

	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	// -------------------------------------------------------------

}
