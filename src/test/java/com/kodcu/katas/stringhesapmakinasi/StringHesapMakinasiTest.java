package com.kodcu.katas.stringhesapmakinasi;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHesapMakinasiTest {

	StringHesapMakinasi calculator = new StringHesapMakinasi();

	private void checkAdd(String string, int expected) {
		assertEquals(expected, calculator.add(string));
	}

	@Test
	public void shouldReturnBasicValues() {
		checkAdd("", 0);
		checkAdd("1", 1);
	}

	@Test
	public void shouldReturnSum() throws Exception {
		checkAdd("1,2", 3);
		checkAdd("1,2,5,4,1,7,10,12,1,0", 43);
	}


	

}
