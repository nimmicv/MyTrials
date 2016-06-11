package com.cracking.chapter2;

public class RemoveDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aabbccdd";
		char[] str = s.toCharArray();
		int end=1,current=1;
		while(current<str.length)
		{
			int i=0;
			for(i=0;i<end;i++)
			{
				if(str[i]==str[current])
					break;
			}
			if(i==end)
			{
				str[end]=str[current];
				end++;
			}
			current++;
		}
		
		for(int i=end;i<str.length;i++)
		{
			str[i]='\0';
		}
		String news = new String(str);
		System.out.println(news);
		
	}

}
