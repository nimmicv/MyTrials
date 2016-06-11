package com.learn.graph;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class BST {
	
	Stack st = new Stack();
	static char[] visited ;
	int node=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph grafh = new Graph(5);
		visited = new char[5];
		grafh.addVertex('A');
		grafh.addVertex('S');
		grafh.addVertex('B');
		grafh.addVertex('G');
		grafh.addVertex('C');
		grafh.addEdge(0, 1, false);
		grafh.addEdge(0, 2, false);
		grafh.addEdge(1, 0, false);
		grafh.addEdge(1, 3, false);
		grafh.addEdge(1, 4, false);
		grafh.addEdge(2, 0, false);
		grafh.addEdge(3, 1, false);
		grafh.addEdge(3, 4, false);
		grafh.addEdge(4, 1, false);
		grafh.addEdge(4, 3, false);	
		BST bst = new BST();
		//bst.Traverse(grafh);
		//bst.Traverse2(grafh,0);
		bst.TraverseBFS(grafh);
        //bst.display();
	}
	
	public void Traverse2(Graph grafh,int vertex)
	{
		if(grafh.getVertex(vertex).isVisited())
		{
			return;
		}
		grafh.getVertex(vertex).setVisited(true);
		System.out.println(grafh.getVertex(vertex).name);
		for(int i=0;i<5;i++)
		{
			if(grafh.getEdges()[vertex][i]==1)
			{
			 Traverse2(grafh,i);
			 //System.out.println(grafh.getVertex(vertex).name);
			 
			}
		}
		
				
	}
	
	public void TraverseBFS(Graph grafh)
	{
		Queue qt = new ArrayDeque() ;
		qt.add(0);
		grafh.getVertex(0).setVisited(true);
		System.out.println(grafh.getVertex(0).getName());
		//Vertex v = grafh.getVertex(0);
		while(!qt.isEmpty())
		{
			int i = (int)qt.poll();
			for(int j=0;j<5;j++)
			{
				if(grafh.getEdges()[i][j]==1 && !grafh.getVertex(j).isVisited())
				{
					qt.add(j);
					grafh.getVertex(j).setVisited(true);
					System.out.println(grafh.getVertex(j).getName());
				}
			}
			
			
		}
		
				
	}
	
	
	public void Traverse(Graph grph)
	{
		int i,j;
		int[][] edges = grph.getEdges();
		int size = grph.getSize();
		st.push(0);
		Vertex ver = grph.getVertex(0);
		ver.setVisited(true);
		visited[node++]=ver.getName();
		int flag =1;
		i=0;
		while(!st.isEmpty())
		{
				if(flag == 0)
				{
					i=(int) st.pop();				
				}
				else
				{
					i=(int) st.peek();
					flag=0;
				}

			for(j=0;j<size;j++)
			{
				if(edges[i][j] == 1)
				{
					ver = grph.getVertex(j);
					if(!ver.isVisited())
					{
						flag =1;
						st.push(j);
						ver.setVisited(true);
						visited[node++] = ver.name;
						break;
					}
				}
			}
			
		}
	

	}
	
	public void display()
	{
		for(int i=0;i<node;i++){
			System.out.println(visited[i]);
		}
	}
}
