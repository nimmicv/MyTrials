package com.careercupYahoo.com;

public class NTree {
	public static int size = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NTreeClass tcls = new NTreeClass(1,3);
		NTreeClass t1 = new NTreeClass(2,3);
		NTreeClass t2 = new NTreeClass(3,3);
		NTreeClass t3 = new NTreeClass(4,3);
		tcls.children[0] = t1;
		tcls.children[1] = t2;
		tcls.children[2] = t3;
		t1.children[0] =new NTreeClass(5,3); 
		t1.children[1] =new NTreeClass(6,3); 
		t3.children[0] =new NTreeClass(7,3); 
		t3.children[1] =new NTreeClass(8,3); 
		t3.children[2] =new NTreeClass(9,3); 
	    String str = serialize(tcls,"");
	    str = str.substring(1);
	    String[] values = str.split(",");
	    NTreeClass root = deserialize(values);
	    System.out.println(root.value);
	}
	
	public static String serialize(NTreeClass node,String s)
	{
		if(node == null)
		{
			s=s+"," + "#";
			return s;
		}
		s=s+","+node.value;
		for(int i=0;i<size;i++)
		{	
			s = serialize(node.children[i],s);
		}
		return s;
	}
	
	public static int index = 0 ;
	
	public static NTreeClass deserialize(String[] s)
	{
		if(s[index].endsWith("#"))
		{
			index ++;
			return null;
			
		}
		int x= Integer.parseInt(s[index]);
		NTreeClass tr = new NTreeClass(x,3);
		index++;
		for(int i=0;i<3;i++)
		{
			tr.children[i] = deserialize(s);
		}
		return tr; 
		
	}

}
