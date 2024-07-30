package Week2.day3;

import java.util.Iterator;

public class fibnocissSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// output - 0,1,1,2,3,5...

		int a = 0, b = 1, c;

		System.out.println(a + "\n" + b);
		for (int i = 0; i < 5; i++) {

			c = a + b;
			System.out.println(+c);
			a = b;
			b = c;
		}
	}

}
