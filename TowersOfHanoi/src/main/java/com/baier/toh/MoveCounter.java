package com.baier.toh;

public class MoveCounter {
	private int moves = 0;

	public int countMovesForDisc(int n) {
		if(n == 1){
			moves++;
			return 1;
		}else{
			countMovesForDisc(n-1);
			countMovesForDisc(1);
			countMovesForDisc(n-1);
			
		}
		return moves;
		
		
	}

	
	
}
