package Week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnpromptclass {

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

		// (// span[text()='Show'])[5] - Prompt dialog

		driver.findElement(By.xpath("(// span[text()='Show'])[5]")).click();
		driver.switchTo().alert().sendKeys("Saravanan");

		String text = driver.switchTo().alert().getText();
		System.out.println(text);

		driver.switchTo().alert().accept();

		// span[@id='confirm_result']

		String text1 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();

		System.out.println(text1);

		// (// span[text()='Show'])[3] - SweetAlert
		driver.findElement(By.xpath("(// span[text()='Show'])[3]")).click();

		//// span[text()='Dismiss']
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();

	}

}
