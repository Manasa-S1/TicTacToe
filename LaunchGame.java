package com.tictactoe.main;

public class LaunchGame {
	public static void main(String[] args) {
		TicTacToe t = new TicTacToe();
		HumanPlayer p1 = new HumanPlayer("Bob", 'X');
		AIPlayer p2 = new AIPlayer("Riya", 'O');

		Player cp = p1;
		while(true) {
			System.out.println(cp.name + " TURN ");
			cp.makeMove();
			TicTacToe.displayBoard();

			if(TicTacToe.checkColWin() || TicTacToe.checkRowWin() || TicTacToe.checkDiagWin()) {
				System.out.println(cp.name + " has won");
				break;
			} else if(TicTacToe.checkDraw()) {
				System.out.println("Game is a draw");
				break;
			} else {
				cp = (cp == p1) ? p2 : p1;
			}
		}
	}
}
