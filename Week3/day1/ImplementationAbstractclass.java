package Week3.day1;

public class ImplementationAbstractclass extends Axisabstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImplementationAbstractclass iAbstract =  new ImplementationAbstractclass();
		iAbstract.Carload();
		iAbstract.Goldloan();
		iAbstract.withDrawableLimit();

	}

	@Override
	public void withDrawableLimit() {
		System.out.println("50000");
		
	}

	@Override
	public void Carload() {
		System.out.println("Car Loan");
		
	}
	
	public void Goldloan() {
		
		System.out.println("Gold Loan");
	}

}
