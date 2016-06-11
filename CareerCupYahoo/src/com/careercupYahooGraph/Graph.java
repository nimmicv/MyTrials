package com.careercupYahooGraph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Graph {
	
	private Vertex[] vertices;
	private List<Edge> edges;
	Set<Edge>[] adjList;
	int numVertices=0;
	boolean directed;
	boolean weighted;
	
	public Graph(boolean directed,boolean weighted, int numVertices)
	{
		
		this.directed = directed;
		this.weighted = weighted;
		this.numVertices = numVertices;
		adjList = new HashSet[numVertices];
		for(int i=0;i<numVertices;i++)
		{
			addVertex(i);
			adjList[i] = null;
		}
		
		edges= new ArrayList<Edge>();
	}
	
	public int graphSize()
	{
		return numVertices;
	}
	
	public void addVertex(int x)
	{
		vertices[numVertices++]= new Vertex(x);
	}
	public void addEdge(int src, int dest)
	{
		Edge edge = new Edge(src,dest,0);
		
	}
	
	public void addEdge(int src, int dest, int weight)
	{
		Edge edge = new Edge(src,dest,weight);
		
	}
	
	public void addAdjList(Edge edge)
	{
		
		
	}

	


}
