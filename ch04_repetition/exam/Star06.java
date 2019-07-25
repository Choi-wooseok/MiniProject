package ch04_repetition.exam;

public class Star06 {

	public static void main(String[] args) {

//	     *
//	    ***
//	   *****
//	  *******
//	 *********

		int j, i;

		for (i = 1; i < 6; i++) {
			for (j = 1; j < 5; j++) {
				System.out.print(" ");
			}
			for (j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
