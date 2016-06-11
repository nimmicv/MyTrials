package com.technical.generic;

public class Excel_Column_Title {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = (char) (1 + 'A');
		System.out.println("CH = "+ ch);
     int n = 27;
     System.out.println(convertToTitle(n));
	}
	
	public  static String convertToTitle(int n) {
	    if(n <= 0){
	        throw new IllegalArgumentException("Input is not valid!");
	    }
	 
	    StringBuilder sb = new StringBuilder();
	 
	    while(n > 0){
	        n--;
	        char ch = (char) (n % 26 + 'A');
	        n /= 26;
	        sb.append(ch);
	    }
	 
	    sb.reverse();
	    return sb.toString();
	}

}
