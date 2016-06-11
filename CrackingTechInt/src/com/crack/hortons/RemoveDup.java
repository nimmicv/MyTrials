package com.crack.hortons;

public class RemoveDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "aabbccdd";
		char[] a = s.toCharArray();
		int last =1;
		//int j=1;
		for(int i=1;i<a.length;i++)
		{
			int k=0;
			for(k=0;k<last;k++)
			{
				if(a[k] == a[i])
				{
					break;
				}
				
			}
			if(k==last)
			{
				a[last]=a[i];
				last++;
			}
		}
		for(int i= last;i<a.length;i++)
		{
			a[i]='\0';
		}
		String str = new String(a);
		System.out.println(str);
		
	}

}
