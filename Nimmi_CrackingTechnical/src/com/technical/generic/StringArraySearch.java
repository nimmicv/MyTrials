package com.technical.generic;

public class StringArraySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] values = {"ant","","","","boy","","cat",""};
		
		int index = search_binary(values,0,values.length-1,"boy");
		System.out.println("Index = "+index);
	}
	
	
	//Use ordinary binary search, but when you hit an empty string, advance to the next non- empty string;
	//if there is no next non-empty string, search the left half
	public static int search_binary(String[] array, int lb, int ub, String value)
	{
		if(lb>ub)
		{
			return 1;
		}
		int mid = (lb+ub) /2;
		if(array[mid].equals(value))
		{
			return mid;
		}
		if(array[mid].isEmpty())
		{
			int curmid = mid;
			while(mid<=ub&&array[mid].isEmpty())
			{
				mid++;
			}
			if(mid<=ub && array[mid].compareTo(value)<=0)
			{
				return search_binary(array,mid,ub,value);
			}
			else
			{
				return search_binary(array,lb,curmid-1,value);
			}
			
		}
		else
		{
			if(array[mid].compareTo(value)<0)
			{
				return search_binary(array,mid+1,ub,value);
			}
			else
			{
				return search_binary(array,lb,mid-1,value);
			}
		}
	}

}
