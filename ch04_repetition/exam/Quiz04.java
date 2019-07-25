/**
	랜덤한 숫자를 5개 생성하고 생성된 숫자의 합계와 평균을 구하는 프로그램을 작성하시오
	
	출력형식 > 
	생성된 숫자 : 44 89 74 7 47 
	합계 : 261
	평균 : 52.20
 */
package ch04_repetition.exam;

import java.util.Random;

public class Quiz04 {
	public static void main(String[] args) {
		Random r = new Random();
		int sum = 0;
		double avr = 0.00;

		System.out.print("생성된 숫자: ");
		for (int i = 1; i < 6; i++) {
			int num = r.nextInt(100) + 1;
			System.out.print(num + " ");
			sum += num;
		}
		avr = sum/5.00;
		System.out.printf("\n합계: %d\n", sum);
		System.out.printf("평균: %f", avr);
		
		
		
		
		
		
		

//		Random r = new Random();
//		int sum = 0;
//		double avr = 0;
//			System.out.print("생성된 숫자: ");
//			for(int i = 1; i < 6; i++) {
//  		       int num = r.nextInt(100)+1;
//		     System.out.print(" " + num);
//		        sum += num;
//			}
//			avr = sum/5.00;
//			System.out.println();
//			System.out.printf("합계 : %d %n평균 : %.2f", sum, avr);

//		int num2 = r.nextInt(100)+1;
//		int num3 = r.nextInt(100)+1;
//		int num4 = r.nextInt(100)+1;
//		int num5 = r.nextInt(100)+1;

//		System.out.printf("생성된 숫자: %d %d %d %d %d",num1, num2, num3, num4, num5);

//		int all = 0;
//		int avr = 0;

	}
}
