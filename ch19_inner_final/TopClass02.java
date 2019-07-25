package ch19_inner_final;

public class TopClass02 {
	String data = "TopClass02 data";
	static String data2 = "TopClass02 data2";
	
	public void test() { //내부클래스를 포함한 탑클래스 안에서의 사용은 일반 클래스의 사용과 다를게 없으나 아예 외부로 빼려면 복잡...
		StaticMember im = new StaticMember();
		im.call(); 
		StaticMember.call(); //static의 성질대로 클래스이름.변수이름 으로 접근
		im.printTopClassData(); //static이 아닌 메서드나 변수는 객체를 생성하고 접근
	}
	
	static class StaticMember { //static이 붙으면 InnerMember보다 확장성은 높아짐 (일반 변수, 메서드도 생성 가능)
		int val = 100;
		static int val2 = 200;
		
		public void test () { //에러발생 (static 선언 불가능) static 쓰고싶으면 내부클래스도 static으로
			System.out.println("StaticMember.call -> " + val);
		}

		public static void call () { //에러발생 (static 선언 불가능) static 쓰고싶으면 내부클래스도 static으로
			System.out.println("StaticMember.call -> " + val2);
		}
		
		public void printTopClassData() {
			// 탑클래스의 nonStatic 은 접근이 불가능
//			System.out.println("StaticMember.printTopClassData -> " + data);  //에러
			System.out.println("StaticMember.printTopClassData -> " + data2);
		}
		
		
		
		
	}
}




