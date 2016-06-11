package com.vmware.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Euclid {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		String line;
		HashSet<String> set_str = new HashSet<String>();
		
		int infocount = 0;
		int warncount = 0;
		while ((line = buf.readLine()) != null && line.length()!= 0) {
			if(line.contains("INFO"))
			{
				infocount++;
			}
			else
			if(line.contains("INFO"))
			{
				warncount++;
			}
			Matcher matcher = Pattern.compile("\"sn\": \"[a-zA-Z0-9]+\"").matcher(line);
			while (matcher.find())
				System.out.println(matcher.group(1));
			matcher = Pattern.compile("\"ss\":\"[a-zA-Z0-9]+\"").matcher(line);
			while (matcher.find())
				System.out.println(matcher.group(1));
			matcher = Pattern.compile("\"ss\":\"((-)[0-9])+\"").matcher(line);
			while (matcher.find())
				System.out.println(matcher.group(1));
		}
		

	}

}
