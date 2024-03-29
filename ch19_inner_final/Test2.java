/**
 * 목표
 * 
 * 내부클래스 이해
 * 
 * 내부클래스 : 최상위 클래스에 포함된 클래스
 * 
 * class TopClass{
 * 		class Inner {}
 * 		static class StaticInner
 *		void call () {
 *			class Local {}
 *		}
 * }
 * 
 * 선언되는 위치에 따른 분류
 *   - 멤버변수 자리에 선언
 *   - 메서드 안에 선언
 *   
 * 1. 멤버변수 자리에 선언되면서 static이 붙지 않은 클래스 (InnerClass)
 *    : Top Class의 변수를 접근할 수 있음
 *    : static이 붙지 않은 클래스 영역에 선언
 *    : 클래스에만 선언가능하고 인터페이스에는 선언이 불가능 //인터페이스 안에 클래스 생성 불가능
 *    : InnerClass 내부에 static 선언이 불가능
 *    : 외부에서 특정클래스의 내부클래스를 접근하는 방법
 *      외부클래스 객체 = new 외부클래스();
 *      외부클래스.내부클래스 변수 = 객체.new 내부클래스();
 */

package ch19_inner_final;

public class Test2 {
	public static void main(String[] args) {
		TopClass01 top = new TopClass01(); //탑클래스를 먼저 선언해줘야 내부클래스 이용 가능
		TopClass01.InnerMember im = top.new InnerMember(); // 
		im.call();
		im.printTopClassData();
		
		
		
	}
}












