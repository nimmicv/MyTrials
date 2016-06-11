package com.learn.games;

class test_127 {
	//Represent letters from A-Z in  26 bit string of binary, where each bit represents the corresponding Letter
	// 1=>A,10 =>B,100=>C etc
	public static void main(String[] args) {
		masterMind("AAGB", "ARGB");
	}

	public static int[] masterMind(String guess, String real) {
		if (guess.length() != real.length()) return new int[] {0, 0};
		int hit = 0;
		int pse = 0;
		int len = guess.length();

		char[] g = guess.toCharArray();
		char[] r = real.toCharArray();
		int mask = 0;
		int x=0;
		int y=0;
		for (int i = 0; i < len; ++i)
		{
			x=0;y=0;
			x= ( r[i] - 'A');
			y=1 << x;//shift 1 x times left
			System.out.println(Integer.toBinaryString(y));
			mask |= y;
			System.out.println(Integer.toBinaryString(mask));
		}
		for (int i = 0; i < len; ++i) {
			if (g[i] == r[i]) ++hit;
			else if ((mask & (1 << ( g[i] - 'A'))) >= 1) ++pse;
		}
		System.out.println(hit + " " + pse);
		return new int[] {hit, pse};
	}
}
