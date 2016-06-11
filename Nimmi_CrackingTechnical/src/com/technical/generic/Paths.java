package com.technical.generic;

import java.util.ArrayList;
import java.util.List;

public class Paths {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<String> binaryTreePaths(Tree root) {
        List<String> list = new ArrayList<String>();
        StringBuffer sb = new StringBuffer();
        binaryTreePaths_Util(root,list,sb);
        for(String s: list)
        {
        	System.out.println(s);
        }
        return list;
    }
    
    public void binaryTreePaths_Util(Tree root,List<String> list,StringBuffer str)
    {
        if(root == null)
        {
            return;
        }
        if(root.left==null && root.right == null)
        {
            str.append(root.value);
            list.add(str.toString());
            return;
        }
        else
        {
            binaryTreePaths_Util(root.left,list,new StringBuffer(str).append(root.value+"->"));
            binaryTreePaths_Util(root.right,list,new StringBuffer(str).append(root.value+"->"));
        }
    }

}
