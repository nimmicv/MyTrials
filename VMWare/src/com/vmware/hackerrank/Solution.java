package com.vmware.hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;


	public class Solution {
	    class Trie {
		   public static final int ALPHABET_SIZE = 26;
		   Trie[] trie;
		   boolean word;
		   int count;
		
		   public Trie()
		   {
			  this.trie = new Trie[ALPHABET_SIZE];
			  this.count =0;
		   }
	    }
	    int current_maxm=1;
		Trie head = null;
		public Solution(){
			head = new Trie();
		}
		public static void main(String[] args) throws Exception {
			 /* Enter your code here. Read input from STDIN. Print output to STDOUT */
	        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		    int N = Integer.parseInt(buf.readLine());
		    String[] numbers = buf.readLine().split(" ");
		    int K = Integer.parseInt(numbers[0]);
		    int L = Integer.parseInt(numbers[1]);
		    int M = Integer.parseInt(numbers[2]);
		    String s = buf.readLine();
	   
			Solution sf = new Solution();
			for(int i=0;i<N;i++)
			{
				for(int j=K;j<=L && i+j<=N;j++)
				{
					
					String sub = s.substring(i, i+j);
					System.out.println(sub);
					if(!sf.checkDistinct(sub,M))
							break;
					sf.add(sub);
				}
			}
			System.out.println(sf.current_maxm);
		}
		
		public boolean checkDistinct(String s, int distinct)
		{
			if(s.length()<=distinct)
			{
				return true;
			}
			HashSet<Character> set = new HashSet<Character>();
			int count =0;
			for(int i=0;i<s.length();i++)
			{
				if(!set.contains(s.charAt(i)))
				{
					count++;
					if(count > distinct )
						return false;
					set.add(s.charAt(i));
				}
			}
			return true;
		}
		public void add(String s)
		{
			char[] str = s.toCharArray();
			Trie currentnode = head;
			for(int i=0;i<str.length;i++)
			{
			  int index = str[i] - 'a';
			  
			  if(currentnode.trie[index]==null)
			  {
				  Trie new_trie= new Trie();
				  currentnode.trie[index] = new_trie; 
				  currentnode = new_trie;
			  }
			  else
			  {
				  currentnode = currentnode.trie[index]; 			  
			  }
			}
			currentnode.word = true;	
			currentnode.count =  currentnode.count+1;
			if(currentnode.count >current_maxm)
			{
				System.out.println("Current_max = "+ s + " - " + current_maxm);
				current_maxm  = currentnode.count;
			}
		}
	}

