package com.learm.recursion;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Set<Integer> set = new HashSet<>();
      int n =0;
      for(int i=0;i<=0;i++)
    	  set.add(i);
      Sets s = new Sets();
      Set<Set<Integer>> newset = s.superset(set, n);
      Iterator<Set<Integer>> iter = newset.iterator();
      while(iter.hasNext())
      {
    	  Set<Integer> subset = iter.next();
    	  System.out.println(subset.toString());
    	  
      }
      //Set[] st = (Set[]) newset.toArray();
	}
	
	

	public Set<Set<Integer>> superset(Set<Integer> set, int index)
	{
		Set<Set<Integer>> supersets;
		if(index == 0)
		{
			supersets = new HashSet<Set<Integer>>();
			Set<Integer> st = new HashSet<Integer>();
			supersets.add(st);	
			return supersets;
		}
		else
		{
			supersets = superset(set,index-1);
			Set<Set<Integer>> supersets2 = new HashSet<>();
		    for(Set s :supersets)
		    {
		    	Set<Integer> st = new HashSet<Integer>();
		    	Object[] x=  set.toArray();
		    	st.addAll(s);
		    	st.add((Integer) x[index-1]);
		    	supersets2.add(st);
		    }
		    supersets.addAll(supersets2);
		    return supersets;
		}
		
	}

}
