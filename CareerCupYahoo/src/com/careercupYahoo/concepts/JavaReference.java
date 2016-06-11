package com.careercupYahoo.concepts;

import com.careercupYahoo.com.Tree;

public class JavaReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree = new Tree(4);
		JavaReference jr = new JavaReference();
		System.out.println(tree.value);
		jr.printme(tree);
		System.out.println(tree.value);
	}
	
	public void printme(Tree tree)
	{
		tree.value = 5;
		
	}

}
