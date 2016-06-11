package com.samasung;

import java.util.Stack;

public class NextPowerOf2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NextPowerOf2 np = new NextPowerOf2();
        System.out.println(np.nextPowerOf2(5));
        String s = "bbcaac";
        System.out.println(removeDuplicateLetters(s));
	}
	    public int nextPowerOf2(int num){
	        if(num ==0){
	            return 1;
	        }
	        if(num > 0 && (num & (num-1)) == 0){
	            return num;
	        }
	        while((num & (num-1)) > 0){
	            num = num & (num-1);
	        }
	        return num<<1;
	    }
	    
	    public static String removeDuplicateLetters(String s) {
	        int[] letters = new int[27];
	        boolean[] letters_bool = new boolean[27];
	        Stack<Character> stk = new Stack<Character>();
	        int max = Integer.MAX_VALUE;
	        for(int i=0;i<s.length();i++)
	        {
	            int ch_ar = s.charAt(i)-'a';
	            letters[ch_ar]++;;
	        }
	        for(int i=0;i<s.length();i++)
	        {
	            if(!letters_bool[s.charAt(i) - 'a'])
	            {
    	            if(!stk.isEmpty())
    	            {
    	              
    	              while(!stk.isEmpty() && (stk.peek() > s.charAt(i)) && letters[stk.peek() - 'a']>0)
    	              {
    	                 letters_bool[stk.peek() - 'a']=false;
    	                 stk.pop();
    	              }
    	            }
    	            stk.push(s.charAt(i));
    	            letters_bool[s.charAt(i) - 'a']=true;
    	            
	            }
	            letters[s.charAt(i) - 'a']--;
	        }
	        StringBuffer strin = new StringBuffer();
	        while(!stk.isEmpty()) strin.insert(0, stk.pop());//str.insert(0, s1.pop());

	        return strin.toString(); 
	        
	    }


}
