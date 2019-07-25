/**

아래와 같이 출력되는 로또 프로그램을 작성하시오.
로또번호는 1 ~ 45 사이의 숫자만 가능합니다.
* 중복된 번호가 나오는 것을 체크하지 마세요~


출력형식>

Set 1 :  39 36 28 21  4  5
Set 2 :  33 29 43 24 17 22
Set 3 :   3 31 10  5  6 28
Set 4 :   7 28 29 32 43 45
Set 5 :   2  2  8 13 21 24

 */
package ch04_repetition.exam;

import java.util.Random;

public class Quiz17 {
	public static void main(String[] args) {
		Random r = new Random();
		
		for(int i = 1; i <= 5; i++) {
			System.out.printf("Set%d : ", i);
			for (int j = 1; j <= 5; j++) {
			int num = r.nextInt(45)+1;
				System.out.printf("%2d ", num);
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
