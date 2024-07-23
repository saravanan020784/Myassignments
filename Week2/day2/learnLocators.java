package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class learnLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		////input[@id='username'] -- Relative Xpath
		driver.findElement(By.xpath("input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		// Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		// createLeadForm_companyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Saravanan TestLeaf");
		// createLeadForm_firstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saravanan");
		// createLeadForm_lastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		
		// Select value from dropdown list
		WebElement sourceDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd1 = new Select(sourceDropdown);
		//SelectByIndex
		dd1.selectByIndex(4);
		//id="createLeadForm_industryEnumId"
		 WebElement sourceDropdown1 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		 Select dd2 = new Select(sourceDropdown1);
		 //SelectByValue
		 dd2.selectByValue("IND_HARDWARE");//Computer Hardware

		 //createLeadForm_ownershipEnumId
		 WebElement sourceDropdown2= driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		 Select dd3 = new Select(sourceDropdown2);
		 //SelectByVisibleText
		 dd3.selectByVisibleText("Corporation");
		 
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
	}

}