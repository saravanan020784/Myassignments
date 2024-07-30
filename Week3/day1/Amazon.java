package Week3.day1;

public class Amazon extends CanaraBank{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon az = new Amazon();
		az.cardPayments();
	}

	@Override
	public void cashOnDelivery() {
		System.out.println("cashOnDelivery");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("upiPayments");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("internetBanking");
		
	}

}
