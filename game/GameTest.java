package game;

import java.util.Scanner;

import game.Game;

public class GameTest {
	public static void main(String[] args) {
		Game g = null;
		
		Scanner sc = new Scanner(System.in);
		int totalCount = 0;
		
		outer :
		while(true) {
		System.out.println("게임을 선택하세요");
		System.out.println("A. 가위 바위 보");
		System.out.println("B. 주사위 값 맞추기");
		System.out.println("C. 종료");
		String choice = sc.nextLine().toUpperCase();
		
		switch(choice) {
		case "A": 
			System.out.println("가위바위보 게임입니다.");
			System.out.println("가위바위보 중 하나를 선택하세요.");
			System.out.println("1.가위   2.바위   3.보");
			int srp = Integer.parseInt(sc.nextLine());
			g = new ScissorsRockPaper();
			totalCount += g.startGame(srp); 
			break;
		case "B": 
			System.out.println("주사위 값 맞추기 게임입니다.");
			System.out.println("주사위를 선택하세요.(1~6)");
			int dice = Integer.parseInt(sc.nextLine());
			g = new Dice();
			totalCount += g.startGame(dice);
			break;
		case "C": 
			System.out.println("게임을 종료합니다.");	
			System.out.printf("당신의 total score는 %d입니다.\n", totalCount);
			break outer;
			default:
				System.out.println("다시 입력하세요.");
			
		}
		}
		
		
		
		
	}
}












