package com.learn.backtracking;

public class NQueens {
	static int[] queen;
	static int flag=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     queen = new int[4];
     NQueens nq = new NQueens();
     for(int i=0;i<4;i++)
     {
    	 queen[i]=-1;
     }
     nq.queens(0, 4);
     
     for(int i=0;i<4;i++)
     {
    	 System.out.println(" ");
    	 for(int j=0;j<4;j++)
    	 {
    		 if(queen[i]==j)
    			 System.out.print("q"+"|");
    		 else	 
    		     System.out.print(" "+"|");
    	 }
     }
     
	}
	
	public void queens(int row, int maxcol)
	{
		if(flag==1)
			return;
		int i;
		for(i=0;i<maxcol;i++)
		{
			if(flag==1)
				return;
			if(place(row,i))
			{
				//if(queen[row]==i && queen[row+1]==-1 && row!=0)
					//return;
				
				queen[row]=i;
//				for(int k=0;k<4;k++)
//			     {
//			    	 System.out.println(" ");
//			    	 for(int j=0;j<4;j++)
//			    	 {
//			    		 if(queen[k]==j)
//			    			 System.out.print("q"+"|");
//			    		 else	 
//			    		     System.out.print(" "+"|");
//			    	 }
//			     }
//				System.out.println(" End/n");
				if(row == (maxcol-1))
				{
					flag=1;
					
				}
				else
				{
				 queens(row+1,maxcol);
				}
								
			}
			
		}
		
	}
    public boolean place(int row , int col)
    {
    	for(int j=0;j<row;j++)
    	{
    		int numrows = row-j;
    		//if any queen in same column or in same diagonal or anti-diagonal
    		if(queen[j]==col || ( Math.abs(queen[j]-col)== Math.abs(j-row)))
    		{
    			return false;
    		}
    		
    	}
    	return true;
    }
}
