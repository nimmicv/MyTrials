package com.samsung.array;

import java.util.Arrays;
import java.util.Comparator;
//class MyComparator implements Comparator<Person>
//{
//
////    private Person p;
////
////    public MyComparator(Person g)
////    {
////         this.p = g;
////    }
//
//	@Override
//	public int compare(Person o1, Person o2) {
//		// TODO Auto-generated method stub
//		return(o1.id - o2.id);
//	}
//
//    // compare function, using game and I'd
// }


public class sort_array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("abc",1,"india");
		Person p2 = new Person("cde",2,"usa");
		Person p3 = new Person("bcd",3,"london");
		Person[] p = new Person[3];
		p[0] = p1;
		p[1] = p2;
		p[2] = p3;
		Arrays.sort(p,new Comparator<Person>(){
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.id-o2.id;
			}
		});
		for(Person pp: p)
		{
			System.out.println(pp.name);
		}
	}

}
