/**
 * 목표
 * 반복제어문: for문 이해
 */

package ch04_repetition;

public class Test01 {
	public static void main(String[] args) {
		
		//화면에 100을 3번 출력하시오
//		System.out.println(100);
//		System.out.println(100);
//		System.out.println(100);
		
/*
 for문의 형태
 
 		for (1.초기화 ; 2.조건식; 3.증감) 4.조건식이 참일 경우 실행문장;
 		1.초기화: 반복문에서 한번만 수행
 		2.조건식: 반복문을 계속 돌릴지 결정, 조건식이 참일 동안만 동작, 거짓일 경우 반복문 중단
 
 		   for (int i=1; i<4; i++){
 		      System.out.println(i);
 		      }
 		   반복문 실행순서
 		   1. 초기화 -> 2.조건식(참일 경우) -> 4.실행문장 -> 3.증감
 		             2.조건식(참일 경우) -> 4.실행문장 -> 3.증감 
 		             2.조건식(참일 경우) -> 4.실행문장 -> 3.증감 
 		             2.조건식(거짓일 경우) -> 5.반복문 중단
 		for ( ; ; ){
 		         실행문장들;
 		}
 */

		for (int i= 1; i<4; i++) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
