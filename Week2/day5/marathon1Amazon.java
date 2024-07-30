package Week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class marathon1Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://www.amazon.in/
		ChromeOptions optChrome = new ChromeOptions();
		optChrome.addArguments("--disable-notifications");
		ChromeDriver aMazonpurbag = new ChromeDriver(optChrome);
		aMazonpurbag.manage().window().maximize();
		aMazonpurbag.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		aMazonpurbag.get("https://www.amazon.in/");
		aMazonpurbag.findElement(By.id("twotabsearchtextbox")).sendKeys("bag for m");
		aMazonpurbag.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

		// (//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]
		WebElement getResult = aMazonpurbag
				.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
		// String text = getResult.getText();

		System.out.println(getResult.getText());

		// (//i[@class="a-icon a-icon-checkbox"])[4]

		aMazonpurbag.findElement(By.xpath("//span[text()='FUR JADEN']")).click();

		// (//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]
		WebElement getResult1 = aMazonpurbag
				.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));

		// String text =getResult1.getText();

		System.out.println(getResult1.getText());
		
		aMazonpurbag.close();
	}

}
