package Week1.day4;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 5;
		System.out.println("Before Swap" +a  +b);
		a = a + b; // a=15
		b = a - b;// b=10
		a = a - b;// a=5
		System.out.println("After Swap" + a  +b);
	}
}