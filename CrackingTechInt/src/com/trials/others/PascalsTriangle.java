package com.trials.others;

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PascalsTriangle pt = new PascalsTriangle();
		pt.createPascalsTriangle(7);
	}
	
	public int[] createPascalsTriangle(int n)
	{
		int[] p =  new int[n];;
		if (n==1)
		{
			p[0]=1;
			System.out.println(p[0]+"\n");
			return p;
		}
		p = createPascalsTriangle(n-1);
		int[] q= new int[n];
		for(int i=0;i<n;i++)
		{
			if(i-1<0)
			{
				q[i] = p[i];
			}
			else
			if(i==n-1)
			{
				q[i] = p[i-1];
			}
			else
			{
				
				q[i]=p[i-1]+p[i];
			}
			System.out.print(q[i]+"\t");
		}
		System.out.println("\n");
		return q;
		
	}

}
