package com.careercupYahoo.com;


public class SumValuesLeftSide {
   
	public static Tree root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 int[] arr = {40, 25, 44, 2, 3, 90,80,100};
	 SumValuesLeftSide sls = new SumValuesLeftSide();
	 for( int i=0; i< arr.length; i++)
	 {
		 sls.insertRec(root, arr[i]);
	 }
	 sls.inorderTraverse(root);
	 System.out.println("Tree Height = " +sls.treeHeight(root));
	 sls.findSum(root);
	 sls.inorderTraverse(root);
	}
	
	 public void insertRec(Tree node, int value) {
		 
		    if(root == null){
		    	root = new Tree(value);
		    	return;
		    }
		    if (value < node.value)
		    {
		        if (node.left != null)
		        {
		        	insertRec(node.left, value);
		        } 
		        else
		        {     
		            node.left = new Tree(value);
		        }
		    } 
		    else if (value > node.value)
		    {
		        if (node.right != null)
		        {
		        	insertRec(node.right, value);
		        }
		        else
		        {
		            node.right = new Tree(value);
		        }
		    }
		}
	 
	 
	 public void inorderTraverse(Tree node)
	 {
		 if(node == null)
		 {
			 return;
		 }
		 inorderTraverse(node.left);
		 System.out.println(node.value);
		 inorderTraverse(node.right);
	 }
	 
	 public int treeHeight(Tree node)
	 {
		 if(node == null)
		 {
			 return 0;
		 }
		 int leftheight = treeHeight(node.left);
		 int rightheight = treeHeight(node.right);
		 return 1+ Math.max(leftheight, rightheight);

	 }
	 
	 public void traverse(Tree node)
	 {
		 if(node == null)
		 {
			 return;
		 }
		 traverse(node.left);
		 if(node.left != null)
		 {
			 node.value = node.value + findSum(node.left); 
		 } 
		 traverse(node.right);
	 }
	 
	 public int findSum(Tree node)
	 {
		 
		 if(node == null)
		 {
			 return 0;
		 }
		 int lsum = findSum(node.left);
		 int rsum = findSum(node.right);
		 int curval = node.value;
		 int totval = curval + lsum+rsum;
		 node.value = totval;
		 return totval;
	 }
	 
	 public int updateSum(Tree node)
	 {
		 if(node == null)
		 {
			 return 0;
		 }
		 int rval =updateSum(node.right);
		 int lval = updateSum(node.left);
		 int curval = node.value;
		 if(node.left != null)
		 {
			 node.value = node.value +lval;
		 }
		 return curval+rval+lval;
		
	 }
}
