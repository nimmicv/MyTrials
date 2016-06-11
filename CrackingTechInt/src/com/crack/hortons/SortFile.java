package com.crack.hortons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SortFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1 = new File("/Users/nimmicv/Documents/Nimmi/file1.txt");
		FileInputStream fir = new FileInputStream(f1);
		File f2 = new File("/Users/nimmicv/Documents/Nimmi/file2.txt");
		FileOutputStream fileout = new FileOutputStream(f2);
		Scanner sc = new Scanner(fir);
		sc.useDelimiter("\\.");
		reverseFile(sc,fileout);
		fileout.close();
		
		
	}
	
  public static void reverseFile(Scanner sc, FileOutputStream fout) throws IOException
  {
	  if(!sc.hasNext())
	  {
		  return;
	  }
	  String s = sc.next();
	  reverseFile(sc,fout);
	  String space = " ";
	  fout.write(s.getBytes());
	  fout.write(space.getBytes());
	  System.out.println(s);
	  
  }
  


}
