package com.trials.others;

import java.util.Stack;

import com.trials.others.Tree;

public class CreateBinaryTree {
	Tree root = null;
   
	public Tree getRoot() {
		return root;
	}

	public void setRoot(Tree root) {
		this.root = root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreateBinaryTree cbt = new CreateBinaryTree();
		cbt.createBinaryTree();
		cbt.NonRecTraverseInorder(cbt.getRoot());

	}
	
	public void createBinaryTree()
	{
		for(int i=0;i<25;i++)
		{
			int val = (int) (Math.random() * 100);
			Tree node = new Tree (val,null,null);
			insert(this.root,node);
		}
	}
	
	public void insert(Tree root,Tree node)
	{
		if(root == null)
		{
			this.root = node;
			return;
		}
		if(node.value<root.value)
		{
			if(root.left==null)
			{
				root.left = node;
				return;
			}
			else
			{
				insert(root.left,node);
			}
		}
		else
		if(node.value>root.value)
		{
			if(root.right==null)
			{
				root.right = node;
				return;
			}
			else
			{
				insert(root.right,node);
			}
		}
	}
	
	public void TraversInorder(Tree root)
	{
		if(root == null)
		{
			return;
		}
		TraversInorder(root.left);
		System.out.println(root.value);
		TraversInorder(root.right);
	}

	public void NonRecTraverseInorder(Tree root)
	{
		Stack<Tree> stk = new Stack<Tree>();
		stk.push(root);
		
		while(!stk.isEmpty())
		{
			if(root.left!=null)
			{
				stk.push(root.left);
				root = root.left;
			}
			else
			{
				Tree node = stk.pop();
				System.out.println(node.value);
				if(node.right!=null)
				{
					root = node.right;
					stk.push(root);
				}
				
			}
		}
		
		
	}
}
