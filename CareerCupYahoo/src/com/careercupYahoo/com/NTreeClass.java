package com.careercupYahoo.com;

public class NTreeClass {
	
	int value;
	NTreeClass[] children;
	public NTreeClass(int value,int size)
	{
		this.value = value;
		children = new NTreeClass[size];
		for(int i=0;i<size;i++)
		{
			children[i] = null;
		}
		
		
	}
	

}
