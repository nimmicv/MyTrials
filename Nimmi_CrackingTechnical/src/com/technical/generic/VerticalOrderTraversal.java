package com.technical.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.List;
import java.util.TreeMap;

public class VerticalOrderTraversal {

	class NodeWidthHeight{
	       Tree node;
	       int height;
	       public NodeWidthHeight(Tree tnode, int h)
	       {
	           this.node = tnode;
	           this.height = h;
	       }
	    }

	    TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<Integer,ArrayList<Integer>>();
	    public List<List<Integer>> verticalOrder(Tree root) {
	        List<List<Integer>> alist = new ArrayList<List<Integer>>();
	        Queue<NodeWidthHeight> que = new LinkedList<NodeWidthHeight>();
	        NodeWidthHeight nwh = new NodeWidthHeight(root,0);
	        que.add(nwh);
	        
	        while(!que.isEmpty())
	        {
	           NodeWidthHeight w = que.poll();
	           if(map.containsKey(w.height))
	           {
	        	   map.get(w.height).add(w.node.value);
	           }
	           else
	           {
	        	   ArrayList list = new ArrayList<>();
	        	   list.add(w.node.value);
	        	   map.put(w.height,list);
	           }
	           
	           int lheight = w.height-1;
	           int rheight = w.height+1;
	           NodeWidthHeight lnode = new NodeWidthHeight(w.node.left,lheight);
	           que.add(lnode);
	           NodeWidthHeight rnode = new NodeWidthHeight(w.node.right,rheight);
	           que.add(rnode);
	        }
	        for(Integer invalue : map.keySet())
	        {
	           alist.add(map.get(invalue));
	        }
	        return alist;
	       
	    }
}
