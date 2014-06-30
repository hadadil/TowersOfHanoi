package com.baier.toh;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoveCounterTest {

	@Test
	public void towersOfHanoi_5discTest() {
		// given
		MoveCounter moveCounter = givenWeHaveMoveCounter();

		// when
		int actual = moveCounter.countMovesForDisc(5);
		// then

		assertEquals(31, actual);
	}

	@Test
	public void towersOfHanoi_MultipleTestWithSameNumber() {
		// given
		MoveCounter moveCounter = givenWeHaveMoveCounter();
		MoveCounter moveCounter2 = givenWeHaveMoveCounter();

		// when
		int actual = moveCounter.countMovesForDisc(3);
		int actual2 = moveCounter2.countMovesForDisc(3);

		// then
		assertEquals(7, actual);
		assertEquals(7, actual2);
	}

	@Test(timeout = 30000)
	public void towersOfHanoi_64disc() {
		// given
		MoveCounter moveCounter = givenWeHaveMoveCounter();
		
		// when
		moveCounter.countMovesForDisc(64);
		
		//then
		//? timeout, why?
	}

	private MoveCounter givenWeHaveMoveCounter() {
		return new MoveCounter();
	}

}
