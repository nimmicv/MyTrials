package com.learm.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//Rotate and create words beginning with all letter possible and push to stack 1

//Read from stack1 and for each word create words with other letters at the next location and so on 
public class StringPermute {

	static String str;
	static String word;
	static int top1 = -1;
	static int top2 = -1;
	static String[] stringArray1;
	static String[] stringArray2;
	static int strlength = 0;

	public static void main(String[] args) throws IOException {
		System.out.println("Enter String : ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		str = bfr.readLine();
		word = str;
		strlength = str.length();
		int n = 1;
		for (int i = 1; i <= strlength; i++) {
			n = n * i;
		}
		stringArray1 = new String[n];
		stringArray2 = new String[n];
		push(word, 1);
		doPermute();
		display();
	}

	public static void push(String word, int x) {
		if (x == 1)
			stringArray1[++top1] = word;
		else
			stringArray2[++top2] = word;
	}

	public static String pop(int x) {
		if (x == 1)
			return stringArray1[top1--];
		else
			return stringArray2[top2--];
	}

	public static void doPermute() {

		for (int j = strlength; j >= 2; j--)
			popper(j);

	}

	public static void popper(int length) {
		// pop from stack1 , rotate each word n times w.r.t position and push to stack 2
		if (top1 > -1) {
			while (top1 > -1) {
				word = pop(1);
				for (int j = 0; j < length; j++) {
					rotate(length);
					push(word, 2);
				}
			}
		}
		// pop from stack2 , rotate each word n times w.r.t position and push to
		// stack 1
		else {
			while (top2 > -1) {
				word = pop(2);
				for (int j = 0; j < length; j++) {
					rotate(length);
					push(word, 1);
				}
			}
		}

	}

	public static void rotate(int position) {
		char[] charstring = new char[100];
		for (int j = 0; j < word.length(); j++)
			charstring[j] = word.charAt(j);

		int startpos = strlength - position;
		char temp = charstring[startpos];
		for (int i = startpos; i < strlength - 1; i++) {
			charstring[i] = charstring[i + 1];
		}
		charstring[strlength - 1] = temp;
		word = new String(charstring).trim();
	}

	public static void display() {
		int top;
		if (top1 > -1) {
			while (top1 > -1)
				System.out.println(stringArray1[top1--]);
		} else {
			while (top2 > -1)
				System.out.println(stringArray2[top2--]);
		}
	}
}
