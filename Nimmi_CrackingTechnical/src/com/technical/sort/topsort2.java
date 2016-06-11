package com.technical.sort;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class topsort2 {

		public static void main(String[] args)
		{
			String[] words = {"a","b","a"};
			topsort2 tp2 = new topsort2();
			System.out.println(tp2.alienOrder(words));
		}
		public String alienOrder(String[] words) {
	        // Step 1: build the graph
	        Map<Character, Set<Character>> graph = new HashMap<>();
	        StringBuffer sb = new StringBuffer();
	        
	        for (int i = 0; i < words.length; i++) {
	            String curr = words[i];
	            for (int j = 0; j < curr.length(); j++) {
	                if (!graph.containsKey(curr.charAt(j))) {
	                    graph.put(curr.charAt(j), new HashSet<Character>());
	                }
	            }
	             
	            if (i > 0) {
	                connectGraph(graph, words[i - 1], curr);
	            }
	        }
	         
	        // Step 2: toplogical sorting
	        
	        boolean[] visited = new boolean[26];
	        
	        for(char x : graph.keySet())
	        {
	        	int val = x-'a';
	        	int[] rank = new int[26];
	        	int currank =1;
	        	if(!visited[val])
	        	{
	        		if(!topologicalsort(x,graph,sb,visited,rank,currank))
	        		{
	        			return "";
	        		}
	        	}
	        }
	        return sb.toString();
	    }
	     
	    private void connectGraph(Map<Character, Set<Character>> graph, String prev, String curr) {
	        if (prev == null || curr == null) {
	            return;
	        }
	         
	        int len = Math.min(prev.length(), curr.length());
	         
	        for (int i = 0; i < len; i++) {
	            char p = prev.charAt(i);
	            char q = curr.charAt(i);
	            if (p != q) {
	                if (!graph.get(p).contains(q)) {
	                    graph.get(p).add(q);
	                }
	                break;
	            }
	        }
	    }
	    
	    public boolean topologicalsort(char vertex,Map<Character, Set<Character>> graph,StringBuffer sb,boolean[] visited,
	    int[]rankarr, int rank)
	    {
	    		Set<Character> set = graph.get(vertex);	    	
	    		int index = vertex-'a';
	    		rankarr[index] = rank;
    	    	visited[index]=true;
    	    	for(char s : set){
    	    		int val = s-'a';
    	    		if(!visited[val])
    	    		{
    	    			
    	    			if(!topologicalsort(s,graph,sb,visited,rankarr,rank+1))
    	    				return false;
    	    		}
    	    		else
    	    		{
    	    			if(rankarr[val]>0 && rankarr[val]<rank)
    	    	    	{
    	    	    	    return false;
    	    	    	}
    	    		}
    	    	}
    	    	sb.insert(0, vertex);
    	    	return true;
	    }
}
