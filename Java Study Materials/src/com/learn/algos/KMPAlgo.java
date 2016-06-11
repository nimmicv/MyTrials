package com.learn.algos;

public class KMPAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KMPAlgo kmp = new KMPAlgo();
		String s = "aba";
		String search = "abacaacaababaaac";
	   int[] x = kmp.preprocess(s.toCharArray());
	   System.out.println(search);
	   System.out.println(s);
	   for(int i: x)
	   {
		   System.out.print(i);
	   }
	   kmp.searchpattern(s.toCharArray(), x, search.toCharArray());
	}
	
	public int[] preprocess(char[] pattern)
	{
		int[] maxlength = new int[pattern.length];
		maxlength[0] = 0;
		int i=1;
		int j=0;
		int length = pattern.length;
		while(i<length)
		{
			if(pattern[i] == pattern[j])
			{
				j++;
				maxlength[i] =j;
				i++;
			
			}
			else
			{
				 if(j!=0)
				 {
					 j=maxlength[j-1];// This is the trickiest
					 
				 }
				 else
				 if(j==0)
				 {
					 maxlength[i]=0;
					 i++;
				 }
			}
		}
		return maxlength;
		
	}
	
	public void searchpattern(char[] pattern,int[] count, char[] searchstring)
	{
		int length = searchstring.length;
		int i=0,j=0;
		while(i<length)
		{
			
			if(searchstring[i]==pattern[j])
			{
				i++;
				j++;
				
				if(j==pattern.length)
				{
					System.out.println("\nFound matching pattern at index" + (i-j));
					j=count[j-1];//first j-1 is anyway matching
				}
			}
			else
			{
				if(j==0)
				{
					i++;
				}
				else
				{
				j=count[j-1];//First j-1 is anyway matching
				}
			}
		}
	}

}
