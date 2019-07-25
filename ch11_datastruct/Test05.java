package ch11_datastruct;

import java.util.Arrays;
import java.util.Scanner;

public class Test05 {

	Scanner sc = new Scanner(System.in);
	
	IntArrayStack stack = new IntArrayStack();


	int menu() {
		System.out.println("------------------");
		System.out.println("1. 입력");
		System.out.println("2. 꺼내기");
		System.out.println("3. 전체데이터 확인");
		System.out.println("0. 종료");
		System.out.println("------------------");
		System.out.print("메뉴 : ");
		return Integer.parseInt(sc.nextLine());
	}

	void add() {
		if (stack.full()) {
			System.out.println("비어있는 공간이 없습니다.\n");
			return;
		}
		System.out.print("입력 값 : ");
		stack.add(Integer.parseInt(sc.nextLine()));
	}

	void del() {
		if (stack.empty()) {
			System.out.println("입력된 데이터가 없습니다.\n");
			return;
		}
		stack.del();
	}

	void showStack() {
		System.out.println(stack.toString());
	}

	void service() {

		while (true) {
			switch (menu()) {
			case 1:
				add();
				break;
			case 2:
				del();
				break;
			case 3:
				showStack();
				break;
			case 0:
				return;
			}
		}
	}

	public static void main(String[] args) {
//				Test02 t = new Test02();
//				t.service();
		// 한번만 쓰이는건 합쳐버릴 수 있음
		new Test05().service();

	}

}
