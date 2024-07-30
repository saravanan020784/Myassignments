package Week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Model alert - can't be inspectable
		// Simple alert -https://www.hdfcbank.com/
		// Confirmation alert - https://www.leafground.com/alert.xhtml
		// prompt alert - https://www.leafground.com/alert.xhtml

		// Non-alert -can be inspectable
		// Sweet alert- - https://www.leafground.com/alert.xhtml
		// https://www.leafground.com/alert.xhtml

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// span[text()='Show'] - Simple Alert
		driver.findElement(By.xpath("//span[text()='Show']")).click();

		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		// transfer driver focus to alert box

		driver.switchTo().alert().accept();

		// (// span[text()='Show'])[2] - Confirmation Alert

		driver.findElement(By.xpath("(// span[text()='Show'])[2]")).click();

		String text1 = driver.switchTo().alert().getText();
		System.out.println(text1);

		driver.switchTo().alert().dismiss();

	}

}
