package com.google.graph;



	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.HashSet;
	import java.util.LinkedList;
	import java.util.List;
	import java.util.Map;
	import java.util.Set;
	import java.util.Stack;

	public class bipartiteGraph {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int[][] x ={
					{0,1},
					{4,5},
					{5,0},
					{3,5},
					{4,3},
					{5,2},
					{2,4}
			};
			for(int i=0;i<x.length;i++)
			{
				System.out.println();
				for(int j=0;j<x[i].length;j++)
				{
					System.out.print(x[i][j]+ " ");
				}
			}
			if(validTree(6,x))
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}

		}
		 public static boolean validTree(int n, int[][] edges) {
			 int color1=0;
			 int color2=1;
			 Map<Integer,Set<Integer>> adjList = new HashMap<Integer,Set<Integer>>();
			 Map<Integer,Integer> colormap= new HashMap<Integer,Integer>();
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
					 colormap.put(i,color1);
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
							 if(colormap.containsKey(nodes))
							 {
								 if(colormap.get(nodes).intValue()==colormap.get(node).intValue())
								 {
									return false; 
								 }
							 }
							 else
							 {
								 colormap.put(nodes, (colormap.get(node).intValue()+1%2)) ;
							 }
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
			 return true;
		 }

	}

