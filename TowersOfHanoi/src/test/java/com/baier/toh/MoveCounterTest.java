package com.baier.toh;

import static org.junit.Assert.*;
import com.baier.toh.MoveCounter;

import org.junit.Before;
import org.junit.Test;

public class MoveCounterTest {

	@Before
	public void setUp() throws Exception {
		
	}


	@Test
	public void count_TOH_moves_test() {
		MoveCounter mc = new MoveCounter();
		assertEquals(31, mc.countMovesForDisc(5));
	}

	
}
