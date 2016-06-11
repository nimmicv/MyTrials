package com.samsung.DP;

import java.util.ArrayList;
import java.util.*;

public class Solution {

	/**
	 * @param args
	 */
	 static void customSort(int[] arr) {
		    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		    TreeMap<Integer,ArrayList<Integer>> map_inverted = new TreeMap<Integer,ArrayList<Integer>>();
		    for(int i=0;i<arr.length;i++)
		        {
		        if(map.containsKey(arr[i]))
		            {
		            map.put(arr[i],map.get(arr[i])+1);
		        }
		        else
		            {
		            map.put(arr[i],1);
		        }   
		    }
		    for(int num:map.keySet())
		        {
		        if(map_inverted.containsKey(map.get(num)))
		            {
		            map_inverted.get(map.get(num)).add(num);
		        }
		        else
		            {
		            ArrayList<Integer> list = new ArrayList<Integer>();
		            list.add(num);
		            map_inverted.put(map.get(num),list);
		        }
		    }
		        
		    for(int num:map_inverted.keySet())
		        {
		        Collections.sort(map_inverted.get(num));
		        for(int val : map_inverted.get(num))
		            {
		            for(int k=0;k<num;k++)
		                System.out.println(val);
		        }
		    }

		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        
        int _arr_size = 0;
        _arr_size = Integer.parseInt(in.nextLine().trim());
        int[] _arr = new int[_arr_size];
        int _arr_item;
        for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
            _arr_item = Integer.parseInt(in.nextLine().trim());
            _arr[_arr_i] = _arr_item;
        }
        
        customSort(_arr);
	}

}
