package com.careercupYahooGraph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SimpleGraph {
	
	boolean vertices[];
	Set<Integer>[] adj;
	int totVertex=0;

	
	public SimpleGraph(int numVertex)
	{
		totVertex = numVertex; 
		vertices = new boolean[numVertex];
		adj = new Set[numVertex];
		for(int i=0;i<numVertex;i++)
		{
			vertices[i] = false;
			adj[i] = null;
		}
		
	}
	
	public void resetVisited()
	{
		for(int i=0;i<totVertex;i++)
		{
			vertices[i] = false;
		}

	}
	
	public void addEdge(int src, int dest,boolean isDirected)
	{
		if(adj[src] == null)
		{
			adj[src]= new HashSet<Integer>();
		}
		adj[src].add(dest);
		if(isDirected)
		{
			if(adj[dest] == null)
			{
				adj[dest]= new HashSet<Integer>();
			}
			adj[dest].add(src);
		}
	}

}
