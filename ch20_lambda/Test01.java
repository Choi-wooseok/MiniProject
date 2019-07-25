/**
 * jdk8 부터 가능
 * 
 * 인터페이스에 메서드가 하나만 있는 경우 람다를 사용하게 되면 코드가 심플해짐
 * 
 */

package ch20_lambda;

interface Sub01{
	void call(String msg);
}

class Child01 implements Sub01 {
	public void call(String msg) {
		System.out.println("Child msg : " + msg);
	}
}

public class Test01 {
	public static void main(String[] args) {
		//클래스 정의
		Sub01 sub01 = new Child01();
		sub01.call("^^");
		
		//익명
		Sub01 sub02 = new Sub01() {
			public void call(String msg) {
				System.out.println("익명 msg" + msg);
			}
		};
		sub02.call("@_@");
		
		//람다
		Sub01 sub03 = (msg) -> {System.out.println("람다 msg : " + msg);}; //메서드의 매개변수가 하나만 있을땐 (msg)에서 msg만 써줘도 됨
		sub03.call("*^^*");
			
		MySub01 ms = (i, j) -> System.out.println(i + j); ; //실행문장이 하나일땐 중괄호 생략 가능
		ms.test(100, 200);
	}
}

interface MySub01 {
	public void test(int i, int j);
}















