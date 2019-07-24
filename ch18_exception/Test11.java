package ch18_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test11 {
	private static void a() throws FileNotFoundException, ArithmeticException {
		System.out.println(1 / 0);
		Scanner sc = new Scanner(new File("a.txt"));
	}
	public static void main(String[] args) {
		try {
			a();
		} catch (FileNotFoundException e) {
//		} catch (IOException e) {
//		} catch (Exception e) {
			e.printStackTrace();
		} catch (ArithmeticException a) {
			System.out.println("ArithmeticException 예외발생");
			a.printStackTrace();
		}

	
	
	
	
	
	
	
	
	
	
	
	}
}
