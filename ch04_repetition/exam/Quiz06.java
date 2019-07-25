/**
 *    아래와 같이 동작되는 프로그램을 작성하시오
 *    
 *    설명>
 *    임의의 수(1 ~ 10)를 2개를 입력받는다(사용자 화면에서...)
 *    단, 같은 숫자는 입력하지 않는다.
 *    큰수가 앞에 입력되어도 실행 될 수 있도록 합니다.
 *    
 *    화면출력>
 *    수를 입력 : 3
 *    수를 입력 : 5
 *    
 *    3부터 5까지의 합은 12입니다.
 *    
 *    화면출력>
 *    수를 입력 : 5
 *    수를 입력 : 3
 *    
 *    3부터 5까지의 합은 12입니다.
 */
package ch04_repetition.exam;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("수를 입력 : ");
		int num2 = sc.nextInt();
		int sum = 0;
		int i = num1;
		int j = num2;

		if(num1 < num2) {
		for (; i <= num2; i++) {
			sum += i;}
		System.out.printf("%d부터 %d까지의 합은 %d입니다.", num1, num2, sum);
	    }
		else if(num2 < num1) {
		for (; j <= num1; j++) {
			sum += j;}
		System.out.printf("%d부터 %d까지의 합은 %d입니다.", num2, num1, sum);
		}
		
		
		
		
		sc.close();

	}
}
