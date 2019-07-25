/**
 * class TopClass {
 * 	  static class SInner {}
 * }
 * 
 * 2. 멤버변수 자리에 선언되면서 static을 붙이는 클래스
 * 		- static 변수나 메서드를 선언할 수 있음
 */

package ch19_inner_final;


public class Test03 {
	public static void main(String[] args) {
		TopClass02 top = new TopClass02();
		// Top클래스 객체가 필요 없다! static이 없을땐 top.new Inner....
		TopClass02.StaticMember im = new TopClass02.StaticMember();
		
		TopClass02.StaticMember sm = new TopClass02.StaticMember();
		// nonstatic 들은 객체 생성 후 접근
		System.out.println(sm.val);
		sm.test();
		sm.printTopClassData();
		
		//static 선언된 변수 또는 메서드는 이름으로 접근
		System.out.println(sm.val2);
		System.out.println(TopClass02.StaticMember.val2);
		TopClass02.StaticMember.call();
		
		
		
		
		
	}
}










