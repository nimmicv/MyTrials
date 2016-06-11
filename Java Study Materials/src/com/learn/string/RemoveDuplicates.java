package com.learn.string;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aaaaaaaa";
		char ch = 'a';
		RemoveDuplicates rds = new RemoveDuplicates();
		System.out.println(rds.remove(str));
		System.out.println((int)ch);
	}
	
	public String remove(String dupstring)
	{
		int i,j;
		int length = dupstring.length();
		j=1;
	    for(i=0;i<length-1;i++)
	    {
	    	for(j=i+1;j<length;j++)
	    	{
	    		if(dupstring.charAt(i)==dupstring.charAt(j))
	    		{
	    			if(j==length-1)
	    			{
	    				dupstring = dupstring.substring(0, j);
	    			}
	    			else
	    			{
	    				dupstring = dupstring.substring(0, j)+dupstring.substring(j+1,length );
	    			}
	    			j--;
	    			length =dupstring.length();
	    		}	
	    	}
	    }
		return dupstring;
	}
	
	public String remove2(String dupstring)
	{
		return null;
	}

}
