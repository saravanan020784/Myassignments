package Week1.day4;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload"); // File upload
		File uploadFile = new File("src\\test\\resources\\Famil Photo.JPG");
		WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
	    fileInput.sendKeys(uploadFile.getAbsolutePath());
	    driver.findElement(By.id("file-submit")).click();
	    WebElement fileName = driver.findElement(By.id("uploaded-files"));
	    fileName.click();
	    WebElement message = driver.findElement(By.id("uploaded-files"));
		message.getText();
	  	}

}
