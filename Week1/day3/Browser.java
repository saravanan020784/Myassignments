package Week1.day3;

public class Browser {

	public void launchBrowser(String browserName) {

		System.out.println("Browser launched successfully");
	}

	public String launchBrowserName() {

		return "Chrome";
	}

	private int atmNumber() {

		return 1234;
	}

	Boolean isPhoneOnOff() {

		return true;
	}

	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser obj = new Browser();
		obj.launchBrowser("Check browser status");
		System.out.println(obj.launchBrowserName());
		System.out.println(obj.atmNumber());
		System.out.println(obj.isPhoneOnOff());
		obj.loadUrl();
	}

}
