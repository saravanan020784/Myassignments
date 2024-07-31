package Week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClassroomActWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions optChrome = new ChromeOptions();
		optChrome.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(optChrome);
		driver.get("https://www.irctc.co.in/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String parentWindow = driver.getWindowHandle();
		// label[text()='FLIGHTS']-Click on Flights label
		driver.findElement(By.xpath("//a[@href='https://www.air.irctc.co.in']")).click();
		Set<String> getAllwindows = driver.getWindowHandles();

		String parentTitle = driver.switchTo().window(parentWindow).getTitle();

		List<String> getAllwindows1 = new ArrayList<String>(getAllwindows);

		String ChildTitle = driver.switchTo().window(getAllwindows1.get(1)).getTitle();

		if (!getAllwindows1.get(1).equals(parentWindow)) {

			driver.switchTo().window(parentWindow);
			driver.close();
		}
	}

}
