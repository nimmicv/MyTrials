package com.technical.generic;

import java.util.LinkedList;
import java.util.List;

public class Supersets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums ={2,1};
		
		List<List<Integer>> sets =subsets(nums);
		for(List<Integer> list :sets)
        {
			System.out.println(list);
        }
	}
	 public static List<List<Integer>> subsets(int[] nums) {
	        
	        return(findSubsets(nums,nums.length));
	        
	    }
	    
	 public static List<List<Integer>> findSubsets(int[] nums, int index)
	    {
	    	List<List<Integer>> supersets;
	        if(index==0)
	        {
	           supersets =  new LinkedList<List<Integer>>();
	           List<Integer> list = new LinkedList<Integer>();
	           supersets.add((LinkedList<Integer>) list);
	           return supersets;
	        }
	        
	        supersets = findSubsets(nums,index-1);
	        int item = nums[index-1];
	        List<List<Integer>> superset_new = new LinkedList<List<Integer>>();
	        for(List<Integer> list :supersets)
	        {
	            List<Integer> curlist = new LinkedList<Integer>();
	            curlist.addAll(list);
	            int i=0;
	            while(i<curlist.size() && curlist.get(i)<item)
	            {
	            	i++;
	            }
	            curlist.add(i,item);
	            
	            superset_new.add((LinkedList<Integer>) curlist);
	        }
	        supersets.addAll(superset_new);
	        return supersets;
	    }
}
