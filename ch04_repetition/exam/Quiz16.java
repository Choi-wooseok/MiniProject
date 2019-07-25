/**
아래와 같이 실행되는 프로그램을 작성하시오
시작단과 종료단은 2 ~ 19단 사이만 가능합니다.
사용자가 시작단에서 -1을 입력할 때 까지 반복합니다.


출력결과>

시작단 입력(종료 : -1) : 22
시작단은 2~19단 까지 가능합니다.
시작단 입력(종료 : -1) : 5
종료단 입력 : 33
종료단은 2~19단 까지 가능합니다.
종료단 입력 : 6
 5 *  1 =   5
 5 *  2 =  10
 5 *  3 =  15
 5 *  4 =  20
 5 *  5 =  25
 5 *  6 =  30
 5 *  7 =  35
 5 *  8 =  40
 5 *  9 =  45
 6 *  1 =   6
 6 *  2 =  12
 6 *  3 =  18
 6 *  4 =  24
 6 *  5 =  30
 6 *  6 =  36
 6 *  7 =  42
 6 *  8 =  48
 6 *  9 =  54
시작단 입력(종료 : -1) : -1
프로그램이 종료되었습니다.

 */
package ch04_repetition.exam;

import java.util.Scanner;

public class Quiz16 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int start;
		int end;

		while (true) {
			System.out.print("시작단 입력(종료: -1) : ");
			start = sc.nextInt();
			if (start == -1) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			if (start < 2 || start > 19) {
				System.out.println("시작단은 2~19단 까지 가능합니다.");
				continue;
			}

			while (true) {

				System.out.print("종료단 입력 : ");
				end = sc.nextInt();
				if (end < 2 || end > 19) {
					System.out.println("종료단은 2~19단 까지 가능합니다.");
				} else
					break;
			}
			for (int j = start; j <= end; j++) {
				for (int i = 1; i < 10; i++) {

					System.out.printf("%d * %d = %d\n", j, i, j * i);
				}
			}
		}

	}

}
