package com.uber.strings;

import java.util.HashMap;

public class CountWays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {25,10,5,1};
		int count = count_possibilities(10,values);
		System.out.println(count);
	}
	static HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    
    public static int count_possibilities(int final_value, int[] values)
    {
        int count =0;
        if(final_value==0)
        {
            return 1;
        }
        if(map.containsKey(final_value))
        {
            return map.get(final_value);
        }
        for(int i=0;i<values.length;i++)
        {
            if(values[i]<=final_value)
            {
              count +=count_possibilities(final_value-values[i],values) ;
            }
        }
        map.put(final_value,count);
       return count;
        
        
    }

}
