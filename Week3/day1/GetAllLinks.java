package Week3.day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		List<WebElement> alllist = driver.findElements(By.tagName("div"));
		System.out.println(alllist.size());

		List<String> alllistStr = new ArrayList<String>();

		for (int i = 0; i < alllist.size(); i++) {
			String strTex = alllist.get(i).getText();
			alllistStr.add(i, strTex);
		}
		System.out.println(alllistStr);
	}
}