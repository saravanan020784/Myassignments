package Week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LearnSet {

	public static void main(String[] args) {
		// Declaring set
		// Hash Set
		Set<String> mentors1 = new HashSet<String>();

		// insertion order
		Set<String> mentors2 = new LinkedHashSet<String>();

		// ASCII order
		Set<String> mentors3 = new TreeSet<String>();

		// To add elements
		// Hash Set
		mentors1.add("Saravanan");
		mentors1.add("Guna");
		mentors1.add("Maniyarasan");
		mentors1.add("Rajesh");

		mentors1.remove("guna");

	//	System.out.println(" Hash Set:" + mentors1);

		// to get size()

	//	System.out.println(" Hash Set:" + mentors1.size());
		
		//add all elements from one set to another set
		
		Set<String> mentors4 = new TreeSet<String>();
		System.out.println("Before add all elements:"+mentors4);
		mentors4.addAll(mentors1);
		System.out.println("After added all elements:"+mentors4);
		
		List<String> toConvertsetArray = new ArrayList<String>();
		
		System.out.println("Before convert from set to List:" +toConvertsetArray);
		
		toConvertsetArray.addAll(mentors4);

		System.out.println("After convert from set to List:" +toConvertsetArray);
		
		//for each to print the value
		for (String string : toConvertsetArray) {
			
			System.out.println(string);
			
		}
		
		
		// insertion order
		/*
		 * mentors2.add("Saravanan"); mentors2.add("Guna"); mentors2.add("Maniyarasan");
		 * mentors2.add("Rajesh");
		 * 
		 * System.out.println(" Insertion order:" + mentors2);
		 */

		/*
		 * // ASCII order mentors3.add("Saravanan"); mentors3.add("Guna");
		 * mentors3.add("Maniyarasan"); mentors3.add("Rajesh");
		 * 
		 * System.out.println(" ASCII order:" + mentors3);
		 */
	}

}
