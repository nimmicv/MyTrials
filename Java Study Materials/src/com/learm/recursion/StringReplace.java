package com.learm.recursion;

import java.util.Scanner;

public class StringReplace {

	private static Scanner input;

	public static void main(String[] args) {

		String line;
		input = new Scanner(System.in);
		System.out.print("Please Enter a String: ");
		line = input.nextLine();
		System.out.println(line);

		line = line.replace("Wake", "Wake Business");
		System.out.println(line);
	}
}
