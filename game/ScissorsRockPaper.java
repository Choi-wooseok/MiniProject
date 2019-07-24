package game;

import java.util.Random;
import java.util.Scanner;

import game.Game;

public class ScissorsRockPaper implements Game {

	final static int SCISSORS = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;

	@Override
	public int startGame(int you) {

		Random r = new Random(); 
		int me = r.nextInt(3) + 1;
		if (me == you) {
			System.out.println("비겼습니다.");
		}
		if (you - me == 1 || you - me == -2) {
			System.out.println("You win");
			return 1;
		}
		else {
			System.out.println("You lose");
		}
		return 0;

	}
}
