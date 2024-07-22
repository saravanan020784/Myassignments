package Week1.day4;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= new String("TestLeaf123@#$%%!#%$");
		char ch;
		int leng = str1.length();
		System.out.println(str1.charAt(4)); //Length-1
		System.out.println(str1.concat("Saravanan"));//Concatenation
		System.out.println(str1.contains("Test"));// To check the char
		System.out.println(str1.equalsIgnoreCase("testLeaf"));
		System.out.println(str1.replaceAll("[^A-Za-z]", ""));
		
		
		/*
		 * for(ch ='a';ch<='z';ch++) { System.out.println(ch +" ");// lower
		 * case-Alphabets } for(ch ='A';ch<='Z';ch++) { System.out.println(ch +" ");//
		 * Upper case-Alphabets }
		 */
	}

}
