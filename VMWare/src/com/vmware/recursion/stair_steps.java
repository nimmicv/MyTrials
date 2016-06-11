package com.vmware.recursion;

import java.util.ArrayList;

public class stair_steps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] steps = {1,2};
		int step_length = 2;
		stair_steps ss = new stair_steps();
		ArrayList<String> sList = ss.getSteps(steps,step_length);
		for(String str : sList)
		{
			System.out.println(str);
		}
		
	}
	
	public ArrayList<String> getSteps(int[] steps, int step_length)
	{
		ArrayList<String> list = new ArrayList<String>();
		if(step_length == 0)
		{
			String s = "";
			list.add(s);
			return list;
		}
		for(int i=0;i<steps.length;i++)
		{
			if(steps[i]<=step_length)
			{
				ArrayList<String> list_local = getSteps(steps,step_length-steps[i]);
				for(String s : list_local)
				{
					String str = steps[i]+"-"+s;
					list.add(str);
				}
				
			}
		}
		return list;
	}

}
