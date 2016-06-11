package com.learn.extra;

import java.util.Arrays;
import java.util.Comparator;

public class Puzzle{
	 
public Puzzle(){
//TODO
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
String[] list ={"abc", "nimmi","manu", "namu","cba","mimni"};
String[] str = sortStrings(list);
for(String s : str)
{
System.out.println(s);	
}
}
 
public static String[] sortStrings(String[] arr){
 
		if(arr == null || arr.length == 0 || arr.length == 1)
			return arr;
 
		class StringComparator implements Comparator<String>{
 
			private String sort(String s){
				char[] letters = s.toCharArray();
				Arrays.sort(letters);
				return new String(letters);
			}
 
			public int compare(String s1, String s2){
				return sort(s1).compareTo(sort(s2));
			}
		}
		
		Arrays.sort(arr,new StringComparator());
		return arr;
 
	}
 
}
 
class PuzzleException extends RuntimeException{
public PuzzleException(String message){
super(message);
}
}