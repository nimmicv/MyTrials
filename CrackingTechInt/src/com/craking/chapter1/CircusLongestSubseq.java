package com.craking.chapter1;

public class CircusLongestSubseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,4,8,1,40,30,60,66,35,70,36,39,45,55,90,100};
		int[] l = new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			l[i]=0;
		}
		CircusLongestSubseq cls = new CircusLongestSubseq();
		cls.longestSequence(a, l);
	}
	
	public int longestRecSequence(int[] a,int[] l,int n,int max)
	{
		if(n==0)
		{
			return 0;
		}
		
		for(int i=0;i<n;i++)
		{
			if(a[i]<a[n-1])
			{
				if(l[n-1]<l[i])
				{
					l[n-1]=l[i]+1;
					if(max<l[n-1])
					{
						max=l[n-1];
					}
				}
			}
			else
			{
				l[i]=0;
			}
			int count = longestRecSequence(a,l,i,max);
		}

		return 0;
	}
	
	public void longestSequence(int[] a,int[] l)
	{
		int maxindex =0;
		int prev[] = new int[a.length];
		//Store previous element
		for(int i=0;i<a.length;i++)
		{
			prev[i]=0;
		}
		for(int i=0;i<a.length;i++)
		{
			for(int k=0;k<i;k++)
			{
				if(a[k]<a[i])
				{
					if(l[i]<=l[k])
					{
						l[i]=l[k]+1;
						if(l[i]>l[maxindex])
						{
							maxindex = i;
						}
						prev[i]=k;
					}
				}
			}
			if(l[i]==0)
			{
				l[i]=1;
				if(l[i]>l[maxindex])
				{
					maxindex = i;
				}
				prev[i]=-1;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
		System.out.print(l[i]+"\t");
		}
		System.out.println("\n");
		for(int i=0;i<a.length;i++)
		{
		
		System.out.print(prev[i]+"\t");
		}
		while(maxindex>=0)
		{
			System.out.println(a[maxindex]);
			maxindex = prev[maxindex];
		}
	}

}
