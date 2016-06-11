package com.technical.google;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class DFS_Recursive {
	
	static Map<Integer,Set<Integer>> adjList = new HashMap<Integer,Set<Integer>>();
	static Set<Integer> visited_set = new HashSet<Integer>();
	static ArrayList<Integer> maxList;
	static int maxsum=0;
	
	class DAGNode{
		int value;
		DAGNode left=null;
		DAGNode right=null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] x ={
				{3,9},
				{3,4},
				{9,1},
				{9,8},
				{4,8},
				{4,2},
				{1,6},
				{1,5},
				{8,5},
				{8,11},
				{2,11},
				{2,10}
		};
		for(int i=0;i<x.length;i++)
		{
			System.out.println();
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j]+ " ");
			}
		}
		int[] nodes = {3,4,9,8,1,5,2,10,11,6};
		CreateGraph(nodes,x);
		//DFS_Recursive(0,adjList);
		DAG_Recursive(3,adjList,new ArrayList(),0);
		for(int i: maxList)
		{
			System.out.print(i+"-");
		}

	}
	
	 public static void CreateGraph(int[] n, int[][] edges) {
		 //Map<Integer,Set<Integer>> adjList = new HashMap<Integer,Set<Integer>>();
		 
		 Stack<Integer> stack = new Stack<Integer>();
		 
		 for(int i=0;i<n.length;i++)
		 {
			 Set<Integer> list = new HashSet<Integer>();
			 adjList.put(n[i], list);
		 }
		 for(int i=0;i<edges.length;i++)
		 {
			 int start = edges[i][0];
			 int end = edges[i][1];
			 adjList.get(start).add(end);
		 }
	 }
	 
	 public static void DFS_Recursive(int node, Map<Integer,Set<Integer>> adjList)
	 {
		 if(!visited_set.contains(node))
		 {
			System.out.println("Value = "+node);
			visited_set.add(node);
			for(int child:adjList.get(node))
			{
				DFS_Recursive(child,adjList);
			}
		 }
		 
	 }
	 
	 public static void DAG_Recursive(int node, Map<Integer,Set<Integer>> adjList,ArrayList<Integer> list,int cursum)
	 {
			System.out.println("Value = "+node);
			list.add(node);
			int sum = 0;
			cursum=cursum+node;
			if(cursum>maxsum)
			{
				maxsum=sum;
				maxList = list;
			}
			for(int child:adjList.get(node))
			{
				DAG_Recursive(child,adjList,new ArrayList(list),cursum);
			}
		 
	 }

}
