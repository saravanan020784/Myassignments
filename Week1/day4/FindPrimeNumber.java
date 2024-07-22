package Week1.day4;

import java.util.Iterator;

public class FindPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int isprimNumber = 13;
		Boolean flag = false;
		int tempValue = isprimNumber / 2;
		for (int i = 2; i <= isprimNumber / 2; i++) {

			if (isprimNumber % 2 == 0) {
				System.out.println("This not a prime number" + isprimNumber);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("This a prime number" + isprimNumber);
		}
	}

}
