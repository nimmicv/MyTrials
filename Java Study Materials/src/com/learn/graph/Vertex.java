package com.learn.graph;

public class Vertex {
	
	char name;
	boolean visited;
	public char getName() {
		return name;
	}

	public void setName(char name) {
		this.name = name;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public Vertex(char name)
	{
		this.name = name;
		this.visited = false;
	}
	

}
