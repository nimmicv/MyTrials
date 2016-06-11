package com.samsung.url;

public class ShortenURL {

	/**
	 * @param args
	 */
	final static String map = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShortenURL url = new ShortenURL();
		System.out.println(url.generateNumber("aaa"));
		System.out.println(url.generateURL(3907));
	}
	
	public String generateURL(long number)
	{
		StringBuffer sb = new StringBuffer();
		while(number>0)
		{
			number--;
			int x = (int)number%62;
			sb.append(map.charAt(x));
			number=number/62;		
		}
		sb = sb.reverse();
		return sb.toString();
	}
	
	public long generateNumber(String str)
	{
		long id = 0;
		for(int i=0;i<str.length();i++)
		{
			char x = (char) (str.charAt(i));
			if(x>='a' && x<='z')
			{
				id = id*62 + (x - 'a') +1;
			}
			else
			if(x>='A' && x<='Z')
			{
				id = id*62 + (x - 'A') + 26 +1;
			}
			else
			if(x>='0' && x<='9')
			{
				id = id*62 + (x - '0') + 52 +1;
			}
		}
		return id;
	}

}
