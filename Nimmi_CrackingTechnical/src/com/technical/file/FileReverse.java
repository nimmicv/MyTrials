package com.technical.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args)  throws FileNotFoundException{
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(new FileReader("/Users/loaner/Downloads/reverseFile.txt"));
		//while(f.)
		Scanner in = new Scanner(new FileReader("/Users/loaner/Downloads/reverseFile.txt"));
//		while(in.hasNext())
//		{
//			String a = in.nextLine();
//			System.out.println(a);
//		}
		readFile(in,"");
	}
	
	public static void readFile(Scanner in,String s) throws FileNotFoundException
	{
		if(!in.hasNextLine())
		{
			System.out.println(s);
			return ;
		}
		
			readFile(in,in.nextLine());
			System.out.println(s);
		
	}
}
