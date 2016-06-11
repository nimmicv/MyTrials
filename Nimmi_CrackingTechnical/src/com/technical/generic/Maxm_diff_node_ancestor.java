package com.technical.generic;

public class Maxm_diff_node_ancestor {
	static int maxdiff = Integer.MIN_VALUE;
	public static int findiff(Tree node)
	{
		max_diff(node);
		return maxdiff;
	}
	public static int max_diff(Tree node)
	{
		if(node==null)
		{
			return Integer.MAX_VALUE;
		}
		if(node.left==null && node.right == null)
		{
			return node.value;
		}
		int left = max_diff(node.left);
		int right = max_diff(node.right);
		int val = Math.min(left, right);
		if(node.value - val > maxdiff)
		{
			maxdiff = node.value-val;
		}
		return val;
	}

}
