package Week1.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chromedriver.driver",
		// "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");// Types of web elements

		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		driver.findElement(By.name("my-text")).sendKeys("UserName");
		driver.findElement(By.name("my-password")).sendKeys("Password");
		driver.findElement(By.name("my-textarea")).sendKeys("Happy to support");
		List<WebElement> allOptions = driver.findElements(By.cssSelector("select option"));
		String option = "One";
		int size = allOptions.size();
		for (int i = 0; i <= allOptions.size(); i++) {
			if (allOptions.get(i).getText().contains(option)) {
				allOptions.get(i).click();
				System.out.println("Clicked");
				break;
			}

		}
		driver.findElement(By.cssSelector("button")).click();
	}
	// driver.close();
}