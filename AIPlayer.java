package com.tictactoe.main;

import java.util.Random;

public class AIPlayer extends Player {
	private Random random = new Random();
	
	public AIPlayer(String name, char mark) {
		super(name, mark);
	}
	
	void makeMove() {
		int row, col;
		do {
			row = random.nextInt(3);
			col = random.nextInt(3);
		} while(!isValidMove(row, col));
		TicTacToe.placeMark(row, col, mark);
	}
}
