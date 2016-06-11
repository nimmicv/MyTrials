package com.crack.hortons;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "waterbottle";
		String s2 = "terbottlewa";
		StringBuffer sb = new StringBuffer(s2);
		sb.append(s2);
		System.out.println(sb.indexOf(s1));
	}

}
