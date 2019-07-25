/**

2부터 10사이의 수를 입력 받아 배수만을 출력하는 프로그램을 작성하시오
배수는 10개 출력합니다.

출력형식 >
수를 입력하세요(2 - 10) : 6
6의 배수 : 6 12 18 24 30 36 42 48 54 60 

 */
package ch04_repetition.exam;

import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요(2 ~ 10) : ");
		int num = sc.nextInt();
		System.out.printf("%d의 배수  : ",num);
		for (int j = 1; j < 11; j++) {
			System.out.printf("  %d",num*j);
		}

		
	
		
		sc.close();

	}
}
