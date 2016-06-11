package com.technical.facebook;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class IntervalDequeue {

	/**
	 * @param args
	 */
	static class list{
		public int start;
		public int end;
		public list(int st, int ed)
		{
			this.start = st;
			this.end = ed;
		}
	}
	class queclass{
		int val;
		String pos;
		public queclass(int st, String pos)
		{
			this.val = st;
			this.pos = pos;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<list> list1 = new ArrayList<list>();
		ArrayList<list> list2 = new ArrayList<list>();
		list1.add(new list(3,18));
		list1.add(new list(17,25));
		list1.add(new list(58,73));
		list2.add(new list(3,11));
		list2.add(new list(20,24));
		list2.add(new list(40,47));
		ArrayList<list> mergelist = new IntervalDequeue().merge(list1, list2);
		
		for(list ls : mergelist)
		{
			System.out.println(ls.start + "-" + ls.end);
		}
	}
	
	public ArrayList<list> merge(ArrayList<list> list1, ArrayList<list> list2)
	{
		ArrayList<list> mergeList = new ArrayList<list>();
		Stack<list> stck = new Stack();
		int i=0;
		int j=0;
		while(i<list1.size() && j<list2.size())
		{
			int curk = -1;
			list ls = null;
			int curlow,curhigh;
			if(list1.get(i).start<list2.get(j).start)
			{
				curlow = list1.get(i).start;
				curhigh = list1.get(i).end;
				curk=i;
				i++;
			}
			else
			{
				curlow = list2.get(j).start;
				curhigh = list2.get(j).end;
				curk=j;
				j++;
			}
			if(mergeList.isEmpty())
			{
				mergeList.add(new list(curlow,curhigh));
			}
			else
			{
				list lis = mergeList.get(mergeList.size()-1);
				if(curhigh>lis.end)
				{
					//curlow will not be less than lis.low
					if(curlow<=lis.end)
					{
						lis.end = curhigh;
					}
					else
					{
						mergeList.add(new list(curlow,curhigh));
					}
				}
			}
			
			
		}
		int curindex=-1;
		ArrayList<list> curlist = null;
		if(i<list1.size() || j<list2.size())
		{
			if(i<list1.size())
			{
				curindex = i;
				curlist = list1;
			}
			if(j<list2.size())
			{
				curindex = j;
				curlist = list2;
			}
			while(curindex<curlist.size())
			{
				int curlow,curhigh;
				curlow = list1.get(i).start;
				curhigh = list1.get(i).end;
				curindex++;
				
				if(mergeList.isEmpty())
				{
					mergeList.add(new list(curlow,curhigh));
				}
				else
				{
					list lis = mergeList.get(mergeList.size()-1);
					if(curhigh>lis.end)
					{
						
						if(curlow<=lis.end)
						{
							lis.end = curhigh;
						}
						else
						{
							mergeList.add(new list(curlow,curhigh));
						}
					}
				}
			
			}
		}
		return mergeList;
	}
	
}
