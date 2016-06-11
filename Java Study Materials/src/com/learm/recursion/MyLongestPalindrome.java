package com.learm.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* word = abcdcbc
 * modifiedString = a#b#c#d#c#b#c
 * plaincount     = 1010105010301
 * longest palindrome = bcdcb
 */

public class MyLongestPalindrome {

	static String word;
	static int wordlength;
	static int highestcount = 0;
	static int newlength;
	static char[] modifiedString; // stores modified string
	static int[] palinCount; // stores palindrome length at each position
	static char pound = '#';

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter String : ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		word = bfr.readLine();
		wordlength = word.length();
		newlength = (wordlength * 2) - 1;
		convert();
		findpalindrome();
		display();
	}

	// Inserting # in string
	public static void convert() {

		modifiedString = new char[newlength];
		int j = 0;
		int i;
		for (i = 0; i < wordlength - 1; i++) {
			modifiedString[j++] = word.charAt(i);
			modifiedString[j++] = pound;
		}
		modifiedString[j] = word.charAt(i);
	}

	// display all palindromes of highest length
	public static void display() {
		String palindrome;
		String s = new String(modifiedString);
		System.out.println("Length of longest palindrome = " + highestcount);
		for (int i = 0; i < newlength; i++) {
			if (palinCount[i] == highestcount) {
				palindrome = s.substring(i - (highestcount - 1), i
						+ (highestcount));
				i = i + (highestcount - 1);
				palindrome = palindrome.replace("#", "");
				System.out.println(palindrome);
			}
		}
	}

	// populate palinCount with length of palindrome string at each position
	public static void findpalindrome() {
		int left, right, count;
		palinCount = new int[newlength];
		palinCount[0] = 1;
		palinCount[newlength - 1] = 1;
		for (int i = 1; i < newlength - 1; i++) {
			count = 0;
			left = i - 1;
			right = i + 1;
			if (modifiedString[i] != pound)
				count++;
			while (left >= 0 && right < newlength) {
				if (modifiedString[left] == modifiedString[right]) {
					if (modifiedString[left] != pound)
						count = count + 2;
					left--;
					right++;
				} else
					break;
			}

			palinCount[i] = count;
			highestcount = count > highestcount ? count : highestcount;

		}

	}

}
