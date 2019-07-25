/**
	하나의 수를 입력받은 다음 입력받은 수까지의 짝수, 홀수, 전체 합을 구하는 프로그램을 작성하시오
	
	출력 형식>
	
	수 입력 : 10
	홀수 합 : 25
	짝수 합 : 30
	전체 합 : 55
 */
package ch04_repetition.exam;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int zzak = 0;
		int hol = 0;

		System.out.printf("수 입력: ");
		int num = sc.nextInt();

		for (int i = 0; i <= num; i++) {
			if (i % 2 == 1) {
				hol += i;
			} else {
				zzak += i;
			}
		}
		System.out.printf("홀수 합: %d\n", hol);
		System.out.printf("짝수 합: %d\n", zzak);
		System.out.printf("전체 합: %d\n", hol + zzak);

//		Scanner sc = new Scanner(System.in);
//		System.out.print("수 입력 : ");
//		int num = sc.nextInt();
//		int even = 0;
//		int odd = 0;
//		
//		for (int i = 1; i <= num ; i++) {
//			if (i%2 == 1) {
//				odd += i;
//			}else if (i%2 == 0) {
//				even += i;
//			}
//		}
//		System.out.println("홀수 합 : " + odd);
//		System.out.println("짝수 합 : " + even);
//		System.out.println("전체 합 : " + (odd + even));

	}
}
