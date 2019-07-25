package ch20_lambda;

interface Sub02 {
	int power(int val);
}
class Child02 implements Sub02{
	public int power(int val) {
		return val * val;
	}
}
public class Test02 {
	public static void main(String[] args) {
		//클래스 정의
		Sub02 s1 = new Child02();
		System.out.println(s1.power(10));
		
		//익명
		Sub02 s2 = new Sub02() {
			public int power(int val) {
				return val * val;
			}
		};
		System.out.println(s2.power(10));
		
		//람다
		Sub02 s3 = (val) -> {return val * val; };
		System.out.println(s3.power(10));

		Sub02 s4 = val -> val * val; ;   //return이 있을때 중괄호를 빼면 구분을 못함 -> 중괄호, 리턴 둘 다 생략
		System.out.println(s3.power(10));
		
		
		
		
		
		
		
		
	}
}





















