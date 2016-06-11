package com.technical.facebook;

import java.util.HashMap;

public class BullsCows {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String secret = "1807";
		String guess = "7810";
		System.out.println(getHint(secret, guess)); 
	}
	
	
public static String getHint(String secret, String guess) {
        
        int A = 0;
        int B = 0;
        int count = 0;
        HashMap<Character,Integer> mapSecret = new HashMap<Character,Integer>();
        for(int i=0;i<secret.length();i++)
        {
            if(mapSecret.containsKey(secret.charAt(i)))
            {
                count = mapSecret.get(secret.charAt(i))+1;
                mapSecret.put(secret.charAt(i),count);
            }
            else
            {
                mapSecret.put(secret.charAt(i),1);
            }
        }
        
        for(int i=0;i<guess.length();i++)
        {
            if(mapSecret.containsKey(guess.charAt(i)))
            {
                count = mapSecret.get(guess.charAt(i))-1;
                mapSecret.put(guess.charAt(i),count);
                if(guess.charAt(i) == secret.charAt(i))
                {
                    A++;
                    if(count<0)
                        B--;
                }
                else
                {
                    if(count>=0)
                     B++;
                }
            }
        }
        String s = Integer.toString(A)+"A"+Integer.toString(B)+"B";
        return s;
        
    }
}
