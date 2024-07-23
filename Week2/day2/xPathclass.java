package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		// driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//// input[@id='username'] -- Absolute Xpath
		driver.findElement(By.xpath("/Html/body/div[2]/div/div/form/p/input")).sendKeys("DemoSalesManager");
		// Relative value
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	}

}
