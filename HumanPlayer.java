package com.tictactoe.main;

import java.util.Scanner;

public class HumanPlayer extends Player {
	private static Scanner sc = new Scanner(System.in);
	
	public HumanPlayer(String name, char mark) {
		super(name, mark);
	}
	
	void makeMove() {
		int row, col;
		do {
			System.out.println("Enter the row and col");
			row = sc.nextInt();
			col = sc.nextInt();
		} while(!isValidMove(row, col));
		TicTacToe.placeMark(row, col, mark);
	}
}
