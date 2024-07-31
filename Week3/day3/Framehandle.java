package Week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// button[contains(@id,'Click')]
		// WebElement iFrame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("// button[contains(@id,'Click')]")).click();
		
		//h5[contains(text(),'Inside Nested frame')]/following::iframe
		
		WebElement outerframe =  driver.findElement(By.xpath("//h5[contains(text(),'Inside Nested frame')]/following::iframe"));
		
		
		
	}

}
