package ch04_repetition;

public class Test02 {
	public static void main(String[] args) {
		
		//10, 20, 30, 40, 50을 출력하는 반복문 작성
		
//		for (int i=10; i<=50; i+=10) {
//			System.out.println(i);
//		}
		
//		for (int i=1; i<6; i++) {
//			System.out.println(i * 10);
//		}
		
		int num = 10;
		for (int i = 1; i < 6; i++) {
			System.out.println(num);
			num +=10;
		}
		
		int num2 = 10;
		for (int i=1; i<6; i++, num2 +=10) {
			System.out.println(num2);
		}
		
		
		
		
		
		
		
	}

}
