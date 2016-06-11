package com.trials.others;

import java.util.ArrayList;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aba";
		String search = "abacaacaababaaac";
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		char[] searchArray = search.toCharArray();
		char[] substr = s.toCharArray();
		//int i=0;
		int j=0;
		for(int i=0;i<searchArray.length;i++)
		{
			int k=i;
			while(j<substr.length && searchArray[k]==substr[j])
			{
				k++;
				j++;
			}
			if(j==substr.length)
			{
				list.add(i);
			}
			j=0;
		}
		
		for(int num: list)
		{
			System.out.println(num);
		}
		
	}

}
