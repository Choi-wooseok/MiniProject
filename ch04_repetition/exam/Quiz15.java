/**

화면에서 행의 수와 열의 수를 입력 받아 아래와 같은 형식으로 출력되는 프로그램을 작성하시오

주의 사항 : 
출력 행이 홀수일 경우 문자( "<" )를 먼저 출력, 짝수일 경우 문자( ">" )를 먼저 출력


출력형식 > 

출력할 행의 수를 입력하세요(1-10) : 4
출력할 열의 수를 입력하세요(1-10) : 3
>>>
<<<
>>>
<<<


출력형식 > 

출력할 행의 수를 입력하세요(1-10) : 3
출력할 열의 수를 입력하세요(1-10) : 3
<<<
>>>
<<<

 */
package ch04_repetition.exam;

import java.util.Scanner;

public class Quiz15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("출력할 행의 수를 입력하세요(1-10) : ");
		int hang = sc.nextInt();
		System.out.print("출력할 열의 수를 입력하세요(1-10) : ");
		int yul = sc.nextInt();
		
		
		if (yul % 2 == 0) {
			for (int i = 1; i <= yul; i++) {
				System.out.println();
				for (int k = 1; k <= hang; k++) {
					if (i % 2 == 0) {
						System.out.print("<");
					} else if (i % 2 != 0) {
						System.out.print(">");
					}
				}
			}
		} else {
			for (int i = 1; i <= yul; i++) {
				System.out.println();
				for (int k = 1; k <= hang; k++) {
					if (i % 2 == 0) {
						System.out.print(">");
					} else if (i % 2 != 0) {
						System.out.print("<");
					}
				}
			}
		}
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("출력할 행의 수를 입력하세요(1~10) : ");
//		int line = sc.nextInt();
//		System.out.print("출력할 열의 수를 입력하세요(1~10) : ");
//		int width = sc.nextInt();
//
//		if (line % 2 == 0) {
//			for (int i = 1; i <= line; i++) {
//				System.out.println();
//				for (int k = 1; k <= width; k++) {
//					if (i % 2 == 0) {
//						System.out.print("<");
//					} else if (i % 2 != 0) {
//						System.out.print(">");
//					}
//				}
//			}
//		} else {
//			for (int i = 1; i <= line; i++) {
//				System.out.println();
//				for (int k = 1; k <= width; k++) {
//					if (i % 2 == 0) {
//						System.out.print(">");
//					} else if (i % 2 != 0) {
//						System.out.print("<");
//					}
//				}
//			}
//		}
//		
//		
//		sc.close();

	}
}
