package com.technical.generic;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class LevelOrderTraverse {
int maxlevel = 0;
public List<List<Integer>> levelOrder(Tree root) {
	List<List<Integer>> list = new ArrayList<List<Integer>>();
	HashMap<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
	levelorder_Traverse(root,0,map);
	for(int i=0;i<maxlevel;i++)
	{
		list.add(map.get(i));
	}
	return list;
    }
    
    public void levelorder_Traverse(Tree node,int level,HashMap<Integer,List<Integer>> map)
    {
        if(node==null)
        {
            return;
        }
        else
        {
            if(!map.containsKey(level))
            {
            	ArrayList<Integer> list = new ArrayList<Integer>();
            	map.put(level, list);
            }
          map.get(level).add(node.value);
          if(maxlevel>level)
          {
        	  maxlevel=level;
          }
        }
        level=level+1;
        levelorder_Traverse(node.left,level,map);
        levelorder_Traverse(node.right,level,map);
    }
}
