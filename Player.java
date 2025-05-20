package com.tictactoe.main;

public abstract class Player {
	protected String name;
	protected char mark;
	
	public Player(String name, char mark) {
		this.name = name;
		this.mark = mark;
	}
	
	abstract void makeMove();
	
	boolean isValidMove(int row, int col) {
		if(row>=0 && row <=2 && col >= 0 && col<=2) {
			if(TicTacToe.board[row][col] == ' ') {
				return true;
			}
		}
		return false;
	}
	

}
