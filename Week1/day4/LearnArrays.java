package Week1.day4;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = { 56, 76, 76, 55, 89, 45, 45 };
		System.out.println("Duplicate elements in given array: ");  
		Arrays.sort(score);
		for (int i = 0; i < score.length-1; i++) {
			
			if(score[i]==score[i+1]) {
				
				System.out.println(score[i]);
			}
			/*for (int j = i + 1; j < score.length; j++) {
				if (score[i] == score[j]) {
					System.out.println(score[j]);
				}
			}*/
		}
	}
}