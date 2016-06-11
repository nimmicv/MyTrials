package com.careercupYahooGraph;

public class Vertex {
	int name;
	boolean visited;
	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public Vertex(int name)
	{
		this.name = name;
		this.visited = false;
	}
	


}
