/**
 * 목표
 * 
 * 예외의 개념 이해
 * 예외: Exception
 *   - 직접처리(ex.합의)방식, 간접처리(ex.보험처리)방식
 *   - try, catch, finally: 직접처리와 연관
 *   - throws: 간접처리와 연관
 *   - throw: 예외를 직접 발생시킬때
 *   
 *   - 발생시점
 *     : 컴파일 시에 발생(checked exception)
 *     : 런타임 시에 발생(unchecked exception) : 개발자가 선택적으로 작업
 *     
 *   - 발생 가능한 예외들을 이미 클래스로 정의해둠    
 *                      Object
 *                        |  
 *                    Throwable (예외 개념의 클래스 중 최상위)
 *                        |
 *                  -------------
 *                  |           |
 *              exception     Error(프로그램에서 처리가 불가능한 심각한 것)
 *                  |           |
 *        ---------------------
 *        |                   |
 *   IOException       RuntimeException  //exception이 상위 개념인데 런타임exception이 아니다..?
 *   FileNotFoundException    |
 *   ......           -------------------
 *                    |       |         |       
 *                 NullPointerException
 *                 ......
 *             
 *             
 *             
 */

package ch18_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		try {
			//컴파일시에 발생하는 예외
			//
			Scanner sc = new Scanner(new File(""));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //이 경우 try catch가 사용됨
		
		
		
		
		
		
		
		
		
		
		
	}
}














