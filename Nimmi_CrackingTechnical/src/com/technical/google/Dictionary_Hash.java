package com.technical.google;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Dictionary_Hash {

	/**
	 * @param args
	 */
     Set<String> st = new HashSet<String>(Arrays.asList("bat", "nerd","term","meant","one","dear")); 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Dictionary_Hash().findDeletions("mbatnerd",0));
	}
   class StringNode
	{
		String string;
		int distance;
		public StringNode(int dist,String str)
		{
			this.distance = dist;
			this.string = str;
		}
	}
	
	public int findDeletions(String word,int dist)
	{
		Set<String> hashset = new HashSet<String>();
		Queue<StringNode> que = new LinkedList<StringNode>();
		StringNode node = new StringNode(0,word);
		que.add(node);
		while(!que.isEmpty())
		{
			StringNode curnode = que.poll();
			for(int i=0;i<curnode.string.length();i++)
			{
				String str = curnode.string.substring(0, i) +  curnode.string.substring(i+1, curnode.string.length());
				if(st.contains(str))
				{
					return curnode.distance+1;
				}
				else
				{
					if(!hashset.contains(str))
					{
						hashset.add(str);
						node = new StringNode(curnode.distance+1,str);
						que.add(node);
					}
				}
			}
			
		}
		return -1;
	}

}
