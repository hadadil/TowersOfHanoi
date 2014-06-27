package com.baier.toh;

import static org.junit.Assert.*;

import javax.naming.TimeLimitExceededException;

import org.junit.Before;
import org.junit.Test;


public class MoveCounterTest {
	MoveCounter mc1,mc2;

	@Before
	public void setUp() throws Exception {
		mc1 = new MoveCounter();
		mc2 = new MoveCounter();
	}

	@Test
	public void towersOfHanoi_5discTest() {
		assertEquals(31, mc1.countMovesForDisc(5));
	}
	
	@Test
	public void towersOfHanoi_MultipleTestWithSameNumber() {
		assertEquals(7, mc1.countMovesForDisc(3));
		assertEquals(7, mc2.countMovesForDisc(3));	
	}
	
	@Test(timeout=30000)
	public void towersOfHanoi_64disc() throws TimeLimitExceededException {
			assertEquals("will fail", 31, mc1.countMovesForDisc(64));
		
	}

	
}
