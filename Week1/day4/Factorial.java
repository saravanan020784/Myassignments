package Week1.day4;

import java.util.Iterator;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = 1;

		for (int i = 1; i <= 10; i++) {

			fact = fact * i;
		}
		System.out.println("Factorial :" + fact);
	}

}
