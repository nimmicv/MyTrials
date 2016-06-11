package com.technical.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class BFS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] x ={
				{0,1},
				{2,4},
				{1,3},
				{1,4}
		};
		for(int i=0;i<x.length;i++)
		{
			System.out.println();
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j]+ " ");
			}
		}
		validTree(5,x);

	}
	 public static void validTree(int n, int[][] edges) {
		 Map<Integer,Set<Integer>> adjList = new HashMap<Integer,Set<Integer>>();
		 boolean[] visited = new boolean[n];
		 Stack<Integer> stack = new Stack<Integer>();
		 
		 for(int i=0;i<n;i++)
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
		 for(int i=0;i<n;i++)
		 {
			 if(!visited[i])
			 {
				 stack.push(i);
			 }
			 while(!stack.isEmpty())
			 {
				 int node = stack.pop();
				 if(!visited[node])
				 {
					 System.out.print(node+ " ");
					 visited[node] = true;
					 for(int nodes : adjList.get(node))
					 {
						 stack.push(nodes); 
					 }
				 }
			 }
		 }
		 while(!stack.isEmpty())
		 {
			 int node =stack.pop();
			 if(!visited[node])
			 {
				 System.out.print(node+ " ");
			 }
		 }   
	 }

}
