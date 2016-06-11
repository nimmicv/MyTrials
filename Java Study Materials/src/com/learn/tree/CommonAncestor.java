package com.learn.tree;

public class CommonAncestor {

	private static Tree root = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BinaryTree bt = new BinaryTree();
      Tree root = bt.createTree();
	}
	
	public Tree findCommonAncestor(Tree root, int x, int y)
	{
		return null;
	}
	
	
	
	
	
	public Tree findCommonAncestor2(Tree root ,int x, int y)
	{
		Tree l,r;
	 if(root.right.value == x || root.right.value ==y ||root.left.value ==y||root.left.value ==y)
		 return root;
	 else
	 {
		l=findCommonAncestor2(root.left,x,y);
		r=findCommonAncestor2(root.right,x,y);
	 }
	 return null;
		
	}

}
