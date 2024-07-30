package Week3.day1;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// Declaring list

		List<String> learners = new ArrayList<String>();

		learners.add("Saravanan");
		learners.add("Maniyarasan");
		learners.add("Guna");
		// remove the index
		System.out.println(learners.remove(1));

		System.out.println(learners);
		// add the index
		learners.add(2, "Maniyarasan");
		System.out.println(learners);
		// remove all

		// add a duplicate name
		learners.add(2, "Maniyarasan");
		System.out.println(learners);

		// to get that size of list

		// to check the value or not

		System.out.println(learners.contains("maniyarasan"));

		// to get that index of values

		System.out.println(learners.get(0));

		learners.clear();
		System.out.println(learners.size());

	}

}
