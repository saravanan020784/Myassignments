package Week3.day3;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "A man, a plan, a canal: Panama";
		//String str = "Sara";
		String lowerCase = str.toLowerCase();
		String replaceAll = lowerCase.replaceAll("[^a-z]", "");
		String strGetResult = "";
		for (int i = replaceAll.length() - 1; i >= 0; i--) {

			strGetResult += replaceAll.charAt(i);

		}

		if (strGetResult.equals(replaceAll)) {
			System.out.println("The given string is palindrome:" + strGetResult);
		} else {

			System.out.println("The given string is not palindrome:" + strGetResult);
		}

	}

}
