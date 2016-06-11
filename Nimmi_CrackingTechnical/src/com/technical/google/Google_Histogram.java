package com.technical.google;

public class Google_Histogram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {5,4,2,7,8,6,1};
		//int[] values = {5,4,3,6,0,1};
		
		int[] tmpvalues= new int[values.length];
		int count =0;
		tmpvalues[0]=0;
		tmpvalues[values.length-1]=0;
		int flag =1;
		while(flag==1)
		{
			for(int i=1;i<values.length-1;i++)
			{
				if(values[i]>values[i-1] || values[i]>values[i+1])
				{
					tmpvalues[i]=Math.min(values[i-1], values[i+1]);
				}
				else
				{
					if(values[i]>0)
					{
						tmpvalues[i] = values[i] -1;
					}
				}
					
			}
			System.out.println("\n");
			for(int i=0;i<values.length;i++)
			{

				System.out.print(tmpvalues[i]+"-");
				values[i] = tmpvalues[i];
			}
			count++;
			for(int i=0;i<values.length;i++)
			{
				if(values[i]!=0)
				{
					flag=1;
					break;
				}
				else
				{
					flag=0;
				}
			}
		}
		
		System.out.println("Count = "+count);
	}
	
	public void histogram(int[] values)
	{		
		int[] tmpvalues= new int[values.length];
		int count =0;
		tmpvalues[0]=0;
		tmpvalues[values.length-1]=0;
		int flag =1;
		while(flag==1)
		{
			for(int i=1;i<values.length-1;i++)
			{
				if(values[i]>values[i-1] || values[i]>values[i+1])
				{
					tmpvalues[i]=Math.min(values[i-1], values[i+1]);
				}
				else
				{
					if(values[i]>0)
					{
						tmpvalues[i] = values[i] -1;
					}
				}
					
			}
			System.out.println("\n");
			for(int i=0;i<values.length;i++)
			{

				System.out.print(tmpvalues[i]+"-");
				values[i] = tmpvalues[i];
			}
			count++;
			for(int i=0;i<values.length;i++)
			{
				if(values[i]!=0)
				{
					flag=1;
					break;
				}
				else
				{
					flag=0;
				}
			}
		}
		
		System.out.println("Count = "+count);
	}

}
