package com.careercupYahoo.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

public class GraphTraversals {
	//1->2,4  | 2->3 | 4->3

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set<Integer>[] adj;
		 adj = new HashSet[5];
//		 HashMap<Character, Set<Character>> map = new HashMap();
//		char x = map.keySet().iterator().next();
		 for(int i=0;i<=4;i++)
		 {
			 adj[i] =  new HashSet<Integer>();
		 }
		 adj[1].add(2);
		 adj[1].add(3);
		 adj[1].add(4);
		 adj[2].add(3);
		 adj[4].add(3);
		
//		 adj[0].add(3);
//		 adj[0].add(3);
//		 for(int i=0;i>adj[0].size();i++)
//		 {
//			 System.out.println(adj[0].get(i));
//		 }
	}
	
	public void createGraph()
	{
		
	}

}
