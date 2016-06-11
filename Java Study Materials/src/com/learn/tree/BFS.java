package com.learn.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class BFS {
	private static Tree root;
	int front=0;
	int rear=-1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree Bt = new BinaryTree();
		Tree root = Bt.createTree();
	}
	
	public ArrayList BFS(Tree node)
	{
		
		ArrayList<Tree> visited = new ArrayList();
		Queue<Tree> q = new ArrayDeque<Tree>();
		Tree temp = root;
		if(temp == null)
			return null;
		else
		{
			visited.add(temp);
			q.add(temp);
			
		}
		return null;
	}

}
