package com.technical.sort;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class TopologicalSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] edges ={
				{5,0},
				{5,2},
				{2,3},
				{3,1},
				{4,0},
				{4,1}
		};
		Map<Integer,Set<Integer>> adjList = new HashMap<Integer,Set<Integer>>();
		 boolean[] visited = new boolean[6];
		 Stack<Integer> stack = new Stack<Integer>();
		 
		 for(int i=0;i<=5;i++)
		 {
			 visited[i]=false;
			 Set<Integer> list = new HashSet<Integer>();
			 adjList.put(i, list);
		 }
		 for(int i=0;i<edges.length;i++)
		 {
			 int start = edges[i][0];
			 int end = edges[i][1];
			 adjList.get(start).add(end);
		 }
		 TopologicalSort ts = new TopologicalSort();
		 
		 for(int i=0;i<=5;i++)
		 {
			 if(!visited[i])
				 ts.topology_sort(i,adjList, visited, stack);
		 }
		 while(!stack.isEmpty())
		 {
			 System.out.println(stack.pop());
		 }
	}
	

	public void topology_sort(int node,Map<Integer,Set<Integer>> map, boolean[] visited, Stack<Integer> stack)
	{
		Set<Integer> adjset = map.get(node);
		visited[node] = true;
		for(int i:adjset)
		{
			if(!visited[i])
			{
				topology_sort(i,map, visited, stack);
				visited[i] = true;
			}
		}
		stack.add(node);
	}

}
