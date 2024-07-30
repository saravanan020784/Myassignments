package Week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveduplicateofArrayusingset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaring Array
		String nText = "google";
		nText.toCharArray();
		int length = nText.length();

		// Declaring integer set
		Set<Character> uniqueNumber = new LinkedHashSet<Character>();

		for (int i = 0; i < nText.length(); i++) {

			uniqueNumber.add(nText.charAt(i));

		}
		System.out.println(uniqueNumber);
	}

}
