package com.technical.google.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.technical.google.vowelSwap;

public class vowelSwapTest {

	@Test
	public void test() {
		vowelSwap swp = new vowelSwap();
		String res = swp.swap("aeiou");
		assertEquals("uoiea", res);
	}

}
