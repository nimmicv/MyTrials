package com.learn.file;

import java.io.File;

public class RecusiveFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     File path = new File("/Users/nimmicv/Documents");
     File[] flist = path.listFiles();
     for( File f : flist)
     {
    	 //if(!f.isDirectory())
    		 System.out.println(f.getName());
    		 
     }
	}

}
