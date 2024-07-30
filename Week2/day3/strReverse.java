package Week2.day3;

public class strReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inStr = "testleaf", nstr="";
		char ch;
		for (int i = 0; i < inStr.length(); i++) {

			ch = inStr.charAt(i);
			nstr= ch+nstr;
		}
		System.out.println("Reversed word: "+ nstr);
	}
}
