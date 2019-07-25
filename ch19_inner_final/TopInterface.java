package ch19_inner_final;

public class TopInterface {
	public /*static*/ interface Player { //static은 안보이지만 자동추가
		void play();
		void call();
		interface Address {
			String BASIC_ADDR = "테스트~";
		}
	}
}
