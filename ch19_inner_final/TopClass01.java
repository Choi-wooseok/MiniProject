package ch19_inner_final;

public class TopClass01 {
	String data = "TopClass01 data";
	static String data2 = "TopClass01 data2";
	
	public void test() { //내부클래스를 포함한 탑클래스 안에서의 사용은 일반 클래스의 사용과 다를게 없으나 아예 외부로 빼려면 복잡...
		InnerMember im = new InnerMember();
		im.call();
		im.printTopClassData();
	}
	
	class InnerMember {
		int val = 100;
//		static int val2 = 200; //에러 발생 (static 사용 불가능)
		public /*static*/ void call () { //에러발생 (static 선언 불가능) static 쓰고싶으면 내부클래스도 static으로
			System.out.println("InnerMember.call -> " + val);
		}
		
		public void printTopClassData() {
			System.out.println("InnerMember.printTopClassData -> " + data);
			System.out.println("InnerMember.printTopClassData -> " + data2);
		}
		
		
		
		
	}
}




