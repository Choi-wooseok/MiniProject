/**

구구단을 아애와 같이 출력하는 프로그램을 작성하시오


출력형식>

 :   1   2   3   4   5   6   7   8   9
------------------------------------------
2단    2   4   6   8  10  12  14  16  18
3단    3   6   9  12  15  18  21  24  27
4단    4   8  12  16  20  24  28  32  36
5단    5  10  15  20  25  30  35  40  45
6단    6  12  18  24  30  36  42  48  54
7단    7  14  21  28  35  42  49  56  63
8단    8  16  24  32  40  48  56  64  72
9단    9  18  27  36  45  54  63  72  81
------------------------------------------

 */
package ch04_repetition.exam;

public class Quiz12 {
	public static void main(String[] args) {

		System.out.print(" : ");
		for (int k = 1; k < 10; k++) {
			System.out.printf("%d   ", k);
		}
		System.out.println();
		System.out.println("------------------------------------------");
		for (int j = 2; j < 10; j++) {
			System.out.print(j + "단");
			for (int i = 1; i < 10; i++) {
				System.out.printf(" %2d ", i * j);
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");

//		System.out.print(" : ");
//		for (int k = 1; k < 10; k++) {
//			System.out.printf("%2d ", k);
//		}
//		System.out.println();
//		System.out.println("------------------------------------------");
//		
//		for (int dan = 2; dan < 10; dan++) {
//		   System.out.printf("%d단 ",dan);
//			for (int k = 1; k < 10; k++) {
//			System.out.printf("%2d ", dan * k);
//			}System.out.println();
//			}
//		System.out.println("------------------------------------------");

	}
}
