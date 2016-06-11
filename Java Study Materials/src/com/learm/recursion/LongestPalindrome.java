package com.learm.recursion;
class LongestPalindrome {

    /**
     * @param input is a String input
     * @return The longest palindrome found in the given input.
     */
    public static String getLongestPalindrome(final String input) {
        int rightIndex = 0, leftIndex = 0;
        String currentPalindrome = "", longestPalindrome = "";
        for (int centerIndex = 1; centerIndex < input.length() - 1; centerIndex++) {
            leftIndex = centerIndex - 1;  rightIndex = centerIndex + 1;
            while (leftIndex >= 0 && rightIndex < input.length()) {
                if (input.charAt(leftIndex) != input.charAt(rightIndex)) {
                    break;
                }
                currentPalindrome = input.substring(leftIndex, rightIndex + 1);
                longestPalindrome = currentPalindrome.length() > longestPalindrome.length() ? currentPalindrome : longestPalindrome;
                leftIndex--;  rightIndex++;
            }
        }
        return longestPalindrome;
    }
    
    public static int longestPalin(String s,int low, int high)
    {
    	if(low==high)
    	{
    		return 1;
    	}
    	if(s.charAt(low)==s.charAt(high) && high==low+1)
    	{
    		return 2;
    	}
    	if(s.charAt(low)==s.charAt(high))
    	{
    		return longestPalin(s,low+1,high-1)+2;
    	}
    	else
    	{
    		return Math.max(longestPalin(s,low+1,high),longestPalin(s,low,high-1));
    	}
    }

    public static void main(String ... args) {
        //String str = "HYTBCABADEFGHABCDEDCBAGHTFYW1234567887654321ZWETYGDE";
    	String str = "CDCABBA";
        int l = longestPalin(str,0,str.length()-1);
        System.out.println("l= "+l);
        String longestPali = getLongestPalindrome(str);
        System.out.println("String: " + str);
        System.out.println("Longest Palindrome: " + longestPali);
    }
}