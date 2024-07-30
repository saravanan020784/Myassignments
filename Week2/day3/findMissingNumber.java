package Week2.day3;

import java.sql.Array;
import java.util.Arrays;

public class findMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nMissingNum = { 1, 5, 4, 2, 6 };

		Arrays.sort(nMissingNum);

		for (int i = 0; i < nMissingNum.length; i++) {

			if (nMissingNum[i] != i + 1) {
				System.out.println("Missig of number is: " + (i + 1));
				break;
			}
		}

	}

}
