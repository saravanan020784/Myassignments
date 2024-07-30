package Week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class marathon1Pvrchennai {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions optChrome = new ChromeOptions();
		optChrome.addArguments("--disable-notifications");
		ChromeDriver pVRBookticket = new ChromeDriver(optChrome);
		pVRBookticket.manage().window().maximize();
		pVRBookticket.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		pVRBookticket.get("https://www.pvrcinemas.com/");
		pVRBookticket.findElement(By.xpath("(//div[@class='cities-overlay cities-active'])[6]")).click();
		pVRBookticket.findElement(By.xpath("//span[text()='Select Movie']")).click();
//		Thread.sleep(5000);
//		WebElement gresult = pVRBookticket.findElement(By.xpath("//span[text()='Select Movie']"));
		// (//span[text()='INDIAN 2'])[1]
		pVRBookticket.findElement(By.xpath("(//span[text()='RAAYAN'])[2]")).click();
		
		//span[text()='Select Date']
		//pVRBookticket.findElement(By.xpath("//span[text()='Select Date']")).click();
		
		//(//span[contains(text(),'Tomorrow')])[2]
		Thread.sleep(5000);
		pVRBookticket.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		
		
		//(//li[@class='p-dropdown-item'])[3]
		
		pVRBookticket.findElement(By.xpath("html[1]/body[1]/div[2]/div[1]/ul[1]/li[2]/span[1]")).click();
		
		////span[text()='09:30 AM']
		
		pVRBookticket.findElement(By.xpath("//span[text()='09:30 AM']")).click();
		
	}
}