package com.careercupYahooGraph;

import java.util.AbstractQueue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GrapgTraversals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleGraph sgp = new SimpleGraph(6);
		sgp.addEdge(0, 1, false);
		sgp.addEdge(0, 2, false);
		sgp.addEdge(1, 3, false);
		sgp.addEdge(1, 4, false);
		sgp.addEdge(2, 4, false);
		sgp.addEdge(2, 5, false);
		sgp.addEdge(5, 1, false);
		System.out.println("DFS = "+DFS(sgp) );
		sgp.resetVisited();
		System.out.println("BFS = "+BFS(sgp) );
		
	}
	
	public static String BFS(SimpleGraph graph)
	{
		String dfs = "";
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(0);
		while(q.size()>0)
		{
			int x = q.poll();
			if(graph.vertices[x] == false)
			{
				dfs = dfs+"=>"+ x;
				graph.vertices[x]=true;
				if(graph.adj[x] !=null)
				{
					for (int i : graph.adj[x])
					{
						q.add(i);
					}
				}
			}
			
		}
		return dfs;
		
	}
	
	public static String DFS(SimpleGraph graph)
	{
		String bfs = "";
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(0);
		while(!stk.empty())
		{
			int x = stk.pop();
			if(graph.vertices[x] == false)
			{
				bfs = bfs+"=>"+ x;
				graph.vertices[x]=true;
				if(graph.adj[x] !=null)
				{
					for (int i : graph.adj[x])
					{
						stk.push(i);
					}
				}
			}
			
		}
		return bfs;
	}

}
