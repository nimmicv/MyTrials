package com.technical.google;

import java.util.HashSet;
import java.util.Set;

public class CanWin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CanWin cwin = new CanWin();
		cwin.canWin("++++");
	}
	public boolean canWin(String s) {
	    if(s == null || s.length() < 2) return false;

	    Set<String> winSet = new HashSet<String>();
	    return canWin(s, winSet);
	}

	public boolean canWin(String s, Set<String> winSet){
	    if(winSet.contains(s)) return true;

	    for(int i = 0; i < s.length() - 1; i++) {
	        if(s.charAt(i) == '+' && s.charAt(i + 1) == '+') {

	            String sOpponent = s.substring(0, i) + "--" + s.substring(i + 2);
	            if(!canWin(sOpponent, winSet)) {
	                winSet.add(s);
	                return true;
	            }
	        }
	    }
	    return false;
	}


}
