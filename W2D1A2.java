package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W2D1A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// setup Driver
		WebDriverManager.chromedriver().setup();

		// to get the path where driver are installed
		String driverPath = System.getProperty("webdriver.chrome.driver");
		System.out.println(driverPath);

		// Launch the Browser
		ChromeDriver driver = new ChromeDriver();

		// Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");

		// Maximize the screen/window
		driver.manage().window().maximize();

        //Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click on Login Button using Class Locator

		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();

		// Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();

		// Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XYZ&co pvt ltd");

		// Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Preeiyaa");

		// Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("L");

		// Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Achu");

		// Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QualityAssurence");

		// Enter Description Field Using any Locator of your choice
		driver.findElement(By.id("createLeadForm_description"))
				.sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry");

		// Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("priyalakshmipathi@gmail.com");

		// Select State/Province as NewYork Using Visible Text
		WebElement selectauto = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drpdwn = new Select(selectauto);
		drpdwn.selectByVisibleText("New York");

		// Click on Create Button
		driver.findElement(By.name("submitButton")).click();

		// Get the Title of Resulting Page. refer the video using driver.getTitle()
		System.out.println("The Title is " + driver.getTitle());
			
		//Click on Duplicate button
		driver.findElement(By.className("subMenuButton")).click();
		
		//Clear the CompanyName Field using .clear()  
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		
		//Enter new CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("X&co pvt ltd");
		
		//Clear the FirstName Field using .clear()  
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		
		//Enter new FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Preiya");
		
		//Click on Create Lead Button
		driver.findElement(By.name("submitButton")).click();
		
		//Get the Title of Resulting Page(refer the video)  using driver.getTitle()
		System.out.println("The Title is " + driver.getTitle());
		
		
		// Window close
		driver.close();
	}

}
