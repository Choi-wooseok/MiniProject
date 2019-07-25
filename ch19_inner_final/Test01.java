/**
 * 목표
 * 
 * final의 세가지 사용
 * 변수: final 타입 변수명 -> 상수
 * 메서드: final 반환타입 이름(매개변수) -> 오버라이딩 금지
 * 클래스: final class 클래스명 -> 상속 금지
 */

package ch19_inner_final;

import java.util.Random;

class MyRandom extends Random {
	public int nextInt(int max) {
		return super.nextInt(max) + 1;   //1부터 max까지 랜덤 / 그냥 하면 max값만 계속 출력됨 -> 부모(Random)를 이용
	}
}

/*final*/ class Parent01 {
	/*final*/ void call() throws Exception {

	}
}

class Child01 extends Parent01 {
	void call() throws Exception {
	}
}

public class Test01 {
	public static void main(String[] args) {
		Random r = new MyRandom();
		System.out.println(r.nextInt(3));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

























