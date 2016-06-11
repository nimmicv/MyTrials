package com.cracking.chapter1;

public class DupString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s = "abbaccdef";
			char[] cs = s.toCharArray();
			StringBuffer sb = new StringBuffer(s);
			int j=1;
			int i=0;
			int pos = 1;
			while(pos<cs.length)
			{
				while(i<j && cs[i]!=cs[pos])
				{
					i++;
				}
				if(i==j)
				{
					cs[j]=cs[pos];
					j++;
				}
				i=0;
				pos++;
			}
			cs[j]='\0';
			String news = new String(cs,0,j);
			System.out.println(news);
	}
	

}
