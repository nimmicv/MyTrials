package com.technical.twitter;
import java.util.*;

public class LaddetSteps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] steps = {1,2};
		HashSet<ArrayList<Integer>> hsteps = findSteps(steps,4);
		for(ArrayList<Integer> r : hsteps)
		{
			System.out.println(r.toString());
		}
	}
	
	public static HashSet<ArrayList<Integer>> findSteps(int[] steps, int stairsize)
	{
		HashSet<ArrayList<Integer>> hsteps = new HashSet<ArrayList<Integer>>();
		if(stairsize==0)
		{
			return hsteps;
		}
		HashSet<ArrayList<Integer>> h_steps = null;
		for(int i=0;i<steps.length;i++)
		{
				int step = steps[i];
				if(stairsize>=step)
				{
					h_steps = findSteps(steps,stairsize-steps[i]);
					if(h_steps.isEmpty())
					{
						ArrayList<Integer> list = new ArrayList<Integer>();
						list.add(step);
						h_steps.add(list);
					}
					else
					{
						for(ArrayList<Integer> list: h_steps)
						{
							list.add(step);
						}
					}
				}
				
			}
		
		return h_steps;
		
	}

}
