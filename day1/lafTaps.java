package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lafTaps {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();

		WebElement elseusername = driver.findElement(By.id("username"));
		elseusername.sendKeys("DemoCSR");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("leafTap");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("saranya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("v");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("saran");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("My Program");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("saran21110@gmail.com");
		
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec = new Select(sourceDD);
		sec.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		System.out.println (driver.getTitle());
		
		
		
		
		
		
		
	}

}
