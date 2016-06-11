package com.technical.generic;

public class Kandane_SubmatrixSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		20	30	40	60
//		-10	10	32	61
//		25	55	60	75
//		70	80	85	90
		
		int m[][] = {
				{-20,-30,-40,60},
				{-10,10,32,-61},
				{-25,55,60,75},
				{-70,80,85,90}
		};
		int maxsum=0;
		int startrow=0;
		int startcol=0;
		int endrow=0;
		int endcol=0;
		//O(n^6)
		for(int row1=0;row1<4;row1++)
		{
			for(int col1=0;col1<4;col1++)
			{
				for(int row2=row1;row2<4;row2++)
				{
					for(int col2=col1;col2<4;col2++)
					{
						int sum=0;
						for(int i=row1;i<=row2;i++) 
						{
							for(int j=col1;j<=col2;j++)
							{
								sum = sum+m[i][j];
							}
						}
						if(sum>maxsum)
						{
							maxsum=sum;
							startrow=row1;
							startcol=col1;
							endrow=row2;
							endcol=col2;
							
						}
						
					}
				}
			}
		}
		
		for(int i=startrow;i<=endrow;i++)
		{
			System.out.print("\n");
			for(int j=startcol;j<=endcol;j++)
			{
				System.out.print(m[i][j]+" ");
			}
		}
		
		int kmaxsum=0;
		int kstartrow=0;
		int kstartcol=0;
		int kendrow=0;
		int kendcol=0;
		//Kandane
		//http://prismoskills.appspot.com/lessons/Dynamic_Programming/Chapter_07_-_Submatrix_with_largest_sum.jsp
		
		//Iterate each colum
		for(int col=0;col<4;col++)
		{
			int[] temp = {0,0,0,0};
			//Foreach curcol through last column[1,12,123,1234 | 2,23,234 | 3,34]
			for(int curcol=col;curcol<4;curcol++)
			{
				for(int row=0;row<4;row++)
				{
					temp[row] = temp[row]+ m[row][curcol];
				}
				int sum =0;
				//Kandane Sum
				for(int x=0;x<4;x++)
					{
						sum = sum + temp[x];
						if(sum<0)
						{
							sum=0;
							kstartrow=x+1;
						}
						if(sum>kmaxsum)
						{
							kmaxsum=sum;
							kendrow =x;
							kstartcol = col;
							kendcol= curcol;
							
						}
					}
			}
				
		}
		System.out.println("MaxSum = "+ kmaxsum);
		for(int i=kstartrow;i<=kendrow;i++)
		{
			System.out.print("\n");
			for(int j=kstartcol;j<=kendcol;j++)
			{
				System.out.print(m[i][j]+" ");
			}
		}

	}

}
