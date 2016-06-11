package com.technical.walmartLabs;

public class CutLogs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {4,5,2,7,1};
		int[] logs = {1,2,3,5,6};
		int[] cuts = new int[11];
		cuts[0] = 0;
		for(int i=1;i<=10;i++)
		{
			if(i<=logs.length)
				cuts[i] = values[i-1];
			else
				cuts[i] = 0;
			for(int j=0;j<logs.length;j++)
			{
				if(logs[j]<=i)
				{
					if(logs[j] == i)
					{
						cuts[i] = Math.max(values[j], cuts[i]);
					}
					else
					{
						cuts[i] = Math.max(cuts[i], cuts[j+1]+cuts[i-(j+1)]);
					}
				}
			}
		}
		for(int i=0;i<=10;i++)
		{
			System.out.println(cuts[i]);
		}
	}

}
