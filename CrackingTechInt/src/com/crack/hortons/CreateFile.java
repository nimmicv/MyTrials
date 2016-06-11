package com.crack.hortons;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.LinkedList;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("/Users/nimmicv/Documents/Nimmi/file3.txt");
		File f2 = new File("/Users/nimmicv/Documents/Nimmi/file4.txt");
		FileInputStream fir = null;
		FileOutputStream fout = null;
		try {
			fir = new FileInputStream(f1);
			fout = new FileOutputStream(f2);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		CreateFile cf = new CreateFile();
		try {
			cf.readFiles(fir);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readFiles(FileInputStream fin) throws IOException
	{
		int maxkey =0;
		Map<Integer,LinkedList<String>> map = new HashMap<Integer,LinkedList<String>>();
		BufferedReader br = new BufferedReader(new InputStreamReader(fin));
		String str;
		while((str = br.readLine())!=null)
		{
			System.out.println(str);
			String[] values = str.split("=");
			String[] indexValues = values[1].split(",");
			for(String val : indexValues)
			{
				String[] indexes = val.split(":");
				int key = Integer.parseInt(indexes[0].trim());
				int pos = Integer.parseInt(indexes[1].trim());
				if(key>maxkey)
				{
					maxkey = key;
				}
				
				if(map.containsKey(key))
				{
					LinkedList ls = map.get(key);
					if(ls.size()>pos)
					{
						ls.add(pos-1, values[0]);
					}
					else
					{
						ls.addLast(values[0]);
					}
				}
				else
				{
					LinkedList newLs = new LinkedList<String>();
					newLs.add(values[0]);
					map.put(key, newLs);
					
				}
				
			}
		}
		
		for(int i=1;i<=maxkey;i++)
		{
			LinkedList<String> ls = map.get(i);
			Iterator itr = ls.listIterator();
			while(itr.hasNext())
			{
				System.out.print(itr.next()+" ");
			}
			System.out.println();
			
		}
	}

}
