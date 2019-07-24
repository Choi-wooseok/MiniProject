/**
 * 목표
 * 
 * finally 블럭의 이해
 * 
 */

package ch18_exception;

public class Test09 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			String s = null;
//			s = "a";
			System.out.println(s.length());
			System.out.println(2);
		} catch (Exception e) {
			System.out.println(3);
//			return; // 메소드를 끝내라는 의미   1 - 3 - 4
			System.exit(0); // 1 - 3
		} finally { // try catch finally 함께 쓸 경우 finally가 제일 끝에 위치!
			        // return 이 있더라도 finally까지는 끝내고 return
			System.out.println(4);
		}
		System.out.println("main end");
		
		
		
		
		
		
		
		
		
		
		
	}
}
















