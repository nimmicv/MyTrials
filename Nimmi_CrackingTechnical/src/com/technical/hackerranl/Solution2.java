package com.technical.hackerranl;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        String firstWord = in.nextLine();
        String secondWord = in.nextLine();
        int count =0;
        
        int[] letters = new int[26];
        
        for(int i=0;i<firstWord.length();i++)
        {
        	int position = firstWord.charAt(i)-'a';
        	letters[position]++;
        }
        
        for(int i=0;i<secondWord.length();i++)
        {
        	int position = secondWord.charAt(i)-'a';
        	if(letters[position] > 0)
        		letters[position]--;
        	else
        		count++;
        }
        
        for(int i=0;i<letters.length;i++)
        {
        	count = count + letters[i];
        }
        System.out.println(count);
        
    }
}
