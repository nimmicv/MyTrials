package com.learn.graph;

public class Graph {
	private Vertex[] vertices;
	private int[][] edges;
	int numvert =0;
	int size;
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Graph(int size)
	{
		setSize(size);
		int i,j;
		vertices = new Vertex[size];
		edges = new int[size][size];
		for(i=0;i<size;i++)
			for(j=0;j<size;j++)
			{
				edges[i][j]=0;
			}
	}
	
	public Vertex getVertex(int position) {
		return vertices[position];
	}

	public void setVertexVisited(int position) {
		vertices[position].setVisited(true);
	}

	public int[][] getEdges() {
		return edges;
	}

	public void addEdge(int x,int y,boolean directed)
	{
		if(directed)
			edges[x][y]=1;
		else
		{
			edges[x][y]=1;
			edges[y][x]=1;
		}
	}
	
	public void addVertex(char x)
	{
		vertices[numvert++]= new Vertex(x);
	}

}
