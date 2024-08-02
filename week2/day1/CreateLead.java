package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		//Initialize the WebDriver (ChromeDriver)
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Enter a username and password.
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click the "Login" button.
		driver.findElement(By.className("decorativeSubmit")).click();
	    // Click on the "CRM/SFA" link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// Click on the "Leads" tab.
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on the "Create Lead" button.
		driver.findElement(By.linkText("Create Lead")).click();
		
		// Enter a FirstName.
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sofia");
		// Enter a LastName.
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Johnson");
		// Enter a CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Qualitest");
		// Enter a Title .
		driver.findElement(By.name("generalProfTitle")).sendKeys("SeniorEngineer");
		//Dropdowns
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select opt1=new Select(industry);
		opt1.selectByIndex(3);
		
		WebElement market = driver.findElement(By.name("marketingCampaignId"));
		Select opt2=new Select(market);
		opt2.selectByVisibleText("Automobile");
		
		// Click the "Create Lead" button.
		driver.findElement(By.name("submitButton")).click();
		
		//Find the title of the page using getTitle method
				String title = driver.getTitle();
				System.out.println(title);
				
		// Verify that the Title is displayed correctly
		if (title.contains("Lead")) {
			System.out.println("Title is displayed correctly");
		} 
		else {
			System.out.println("Incorrect Title");
		}
			// Close the browser window
			Thread.sleep(5000);
			
			driver.close();
	}

}
