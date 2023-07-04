package Week2.day1;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class editLead {
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
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hemanikha");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("s");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Hema");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
			driver.findElement(By.id("createLeadForm_description")).sendKeys("My Program");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("hema21110@gmail.com");
			
			WebElement sourceDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select sec = new Select(sourceDD);
			sec.selectByVisibleText("New York");
			
			driver.findElement(By.name("submitButton")).click();
			driver.findElement(By.linkText("Edit")).click();
			
			driver.findElement(By.id("updateLeadForm_description")).clear();
			
			driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("My First important Program");
			driver.findElement(By.name("submitButton")).click();
			
			
			
			
			
			
			
		}

	}


