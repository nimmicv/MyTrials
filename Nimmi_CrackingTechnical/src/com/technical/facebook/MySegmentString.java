package com.technical.facebook;

import java.util.HashSet;

public class MySegmentString {

	/**
	 * @param args
	 */
	static HashSet<String> hset = new HashSet<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hset.add("i");
		hset.add("am");
		hset.add("kid");
		hset.add("kidding");
		hset.add("s");
		if(segmenter("iiiiiiii"))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
	// if string upto i is true, check for all combinations from i+1
	public static boolean segmenter(String s)
	{
		boolean[] val = new boolean[s.length()+1];

		for(int i=1;i<s.length();i++)
		{
			String str = s.substring(0, i);
			if(!val[i] && hset.contains(str))
			{
				val[i]=true;
			}
			if(val[i])
			{
				for(int j=i+1;j<s.length()+1;j++)
				{
					String substr = s.substring(i, j);
					if(!val[j] && hset.contains(substr))
					{
						val[j]=true;
						if(j==(s.length()))
						{
							return true;
						}
					}
				}
			}
		}
		return false;
	}

}
