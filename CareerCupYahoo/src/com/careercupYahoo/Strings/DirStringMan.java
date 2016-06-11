package com.careercupYahoo.Strings;

public class DirStringMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "./dir0/dir1/./dir2/../dir3/../../..";
		char[] str = s.toCharArray();
		
		int i=0;
		int last = s.indexOf('/')+1;
		int start = s.indexOf('/')+1;
		int length = s.length();
		
		for(int j=start;j<length;j++)
		{
			if(str[j] != '.')
			{
				str[last] = str[j];
				last++;
			}
			else
			if(j+1<length && str[j+1] == '.')
			{
				last = last -2;
				while(str[last] !='/')
				{
					last--;
				}
				
				last++;
				j=j+2;
			}
			else
			{
				j++;
			}
		}
		
		for(int k=0;k<last;k++)
		{
			System.out.print(str[k]);
		}
		
		
	}

}
