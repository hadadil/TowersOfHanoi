package com.baier.toh;

public class MoveCounter {
	/**
	 * It counts the necessary number of steps to take to move N number of discs
	 * from the first peg to the 3rd peg.
	 * 
	 * @param n
	 *            the number of discs on the first peg/tower
	 * @return the minimum steps we have to take to move through N disc to the
	 *         last tower.
	 */
	public int countMovesForDisc(int n) {
		if (n == 1) {
			return 1;
		} else {
			int moves = countMovesForDisc(n - 1);
			moves++;
			moves += countMovesForDisc(n - 1);
			return moves;
		}

	}

}
