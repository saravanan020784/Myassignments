package Week2.day4;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser extends safariBrowser {

	String browserName = "browserName";
	String browserVersion= "browserVersion";

	public void openURL() {

		System.out.println("openURL");

	}

	public void closeBrowser() {
		System.out.println("closeBrowser");
	}

	public void navigateBack() {
		System.out.println("navigateBack");
	}

	public static void main(String[] args) {

		browser obj = new browser();
		System.out.println(obj.browserName);
		System.out.println(obj.browserVersion);
		obj.openURL();
		obj.navigateBack();
		obj.openIncognito();
		obj.clearCache();
		obj.takeSnap();
		obj.clearCookies();
		obj.readerMode();
		obj.fullScreenMode();
	}
}
