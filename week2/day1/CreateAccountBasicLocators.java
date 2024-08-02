package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountBasicLocators {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Enter a username and password.
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click the "Login" button.
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the "CRM/SFA" link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// Click on the "Accounts" tab.
		driver.findElement(By.linkText("Accounts")).click();
		
		// Click on the "Create Account" button.
		driver.findElement(By.linkText("Create Account")).click();
		
		//Enter an account name.
		driver.findElement(By.id("accountName")).sendKeys("Sofia Test2");
		
		// Enter a description as "Selenium Automation Tester." 
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//Utilising Select class to handle dropdown (industry dropdown)
	    //driver.findElement(By.name("industryEnumId"));
	    //store the above syntax in webelement, to reuse data multiple times if needed
	    //ctrl+2 -> chose 2nd option
	
  WebElement industry = driver.findElement(By.name("industryEnumId"));
	    //creating object for select class
	    Select opt=new Select(industry);
	    //object.method()
	    //Select "ComputerSoftware" as the industry. 
	    opt.selectByIndex(3);
	
	//Select "S-Corporation" as ownership using SelectByVisibleText. 
	WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
	Select opt1 = new Select(ownership);
	opt1.selectByVisibleText("S-Corporation");
	
	// Select "Employee" as the source using SelectByValue.
	WebElement Src = driver.findElement(By.id("dataSourceId"));
	Select opt3 =new Select(Src);
	opt3.selectByValue("LEAD_EMPLOYEE");
	
	//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
	
	WebElement market = driver.findElement(By.id("marketingCampaignId"));
	Select opt4=new Select(market);
	opt4.selectByIndex(6);
	  
	//Select "Texas" as the state/province using SelectByValue
	WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
	Select opt2=new Select(state);
	opt2.selectByValue("TX");
	
	//Enter a Number Of Employees.
	driver.findElement(By.id("numberEmployees")).sendKeys("100");
	// Enter a Site Name as “LeafTaps”
	driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
	// Click the "Create Account" button.
	driver.findElement(By.className("smallSubmit")).click();
		
		//Find the title of the page using getTitle method
		String title = driver.getTitle();
		System.out.println(title);
		
		//Verify that the Title is displayed correctly.
		if (title.contains("Account")) {
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

