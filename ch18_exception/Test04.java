/**
 * 
 */

package ch18_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			Scanner sc = new Scanner(new File("a.txt"));
			System.out.println(2);
			/*
			 * java.lang.Object
					java.lang.Throwable
						java.lang.Exception
							java.io.IOException
								java.io.FileNotFoundException
			//FileNotFoundException fnfe = new FileNotFoundException(..);
			//IOException fnfe = new FileNotFoundException(..);
			//Exception fnfe = new FileNotFoundException(..);
			//Throwable fnfe = new FileNotFoundException(..);
			//Object fnfe = new FileNotFoundException(..);   전부 가능?!
			*/
		} 
//		catch (FileNotFoundException fnfe) {
//		catch (IOException fnfe) {
//		catch (Exception fnfe) { //보통 여기까지 사용
		catch (Throwable fnfe) { //Throwable 까지가 예외 관련된 클래스 -> Throwable의 자식클래스만 올 수 있다.
//		catch (Object fnfe) {    //Object는 불가능
			System.out.println(3);
		}
		System.out.println(4);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}













