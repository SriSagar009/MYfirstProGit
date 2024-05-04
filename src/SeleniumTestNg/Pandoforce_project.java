package SeleniumTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Pandoforce_project {
	WebDriver driver;
	WebDriverWait wait;
	
	
	 @BeforeTest
	  public void Setup() {
		  driver = new ChromeDriver();
			driver.get("http://pandoforce.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	  }
	 
	 
  @Test(priority =1, enabled = true )
  public void ValidInputs() {
	  driver.findElement(By.xpath("//button[text()='Login']")).click();
		 
		driver.findElement(By.xpath("//input[@name='LoginForm[email_address]']")).sendKeys("demo.farmreach@pandoforce.com");
		driver.findElement(By.xpath("//input[@name='LoginForm[password]']")).sendKeys("Goodluck@123");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='My Markets']")));
		String attri=driver.findElement(By.xpath("//span[text()='My Markets']")).getText();
		
		System.out.println(attri);
		if(attri.contains("My Markets")) {
			System.out.println(" logged in Successfully ");
		}else {
			System.out.println("Login failed");
		}
		
		
  }
  @Test(priority = 2, enabled = false)
  public void Invalidinputs() {
	  driver.findElement(By.xpath("//button[text()='Login']")).click();
	  driver.findElement(By.xpath("//input[@name='LoginForm[email_address]']")).sendKeys("farmreach@pandoforce.com");
		driver.findElement(By.xpath("//input[@name='LoginForm[password]']")).sendKeys("luck@123");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Login Failed! Please check your Email and Password']")));
		String attri_1=driver.findElement(By.xpath("//p[text()='Login Failed! Please check your Email and Password']")).getText();
		
		System.out.println(attri_1);
		if(attri_1.contains("Login Failed! Please check your Email and Password")) {
			System.out.println("Error Message displaying successfully ");
		}else {
			System.out.println("Failed to display Error message to invalid inputs");
		}
		
		
  }
  @Test(priority = 3, enabled = false)
  public void ValidEmail_invalidpass() {
	  driver.findElement(By.xpath("//button[text()='Login']")).click();
	  driver.findElement(By.xpath("//input[@name='LoginForm[email_address]']")).sendKeys("demo.farmreach@pandoforce.com");
		driver.findElement(By.xpath("//input[@name='LoginForm[password]']")).sendKeys("luck@123");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Login Failed! Please check your Email and Password']")));
		String attri_2=driver.findElement(By.xpath("//p[text()='Login Failed! Please check your Email and Password']")).getText();
		
		System.out.println(attri_2);
		if(attri_2.contains("Login Failed! Please check your Email and Password")) {
			System.out.println("Error Message displaying successfully ");
		}else {
			System.out.println("Failed to display Error message to invalid inputs");
		}
		
	  
  }
  @Test(priority = 4,enabled =false)
  public void InvalidEmail_validPassword() {
	  driver.findElement(By.xpath("//button[text()='Login']")).click();
	  driver.findElement(By.xpath("//input[@name='LoginForm[email_address]']")).sendKeys("farmreach@pandoforce.com");
		driver.findElement(By.xpath("//input[@name='LoginForm[password]']")).sendKeys("Goodluck@123");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Login Failed! Please check your Email and Password']")));
		String attri_3=driver.findElement(By.xpath("//p[text()='Login Failed! Please check your Email and Password']")).getText();
		
		System.out.println(attri_3);
		if(attri_3.contains("Login Failed! Please check your Email and Password")) {
			System.out.println("Error Message displaying successfully ");
		}else {
			System.out.println("Failed to display Error message to invalid inputs");
		}
		
	  
  }
  @Test(priority = 5, enabled = false)
  public void Empty_Input() {
	  
	  driver.findElement(By.xpath("//button[text()='Login']")).click();
	  driver.findElement(By.xpath("//input[@name='LoginForm[email_address]']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='LoginForm[password]']")).sendKeys("");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Email Address cannot be blank.']")));
		String attri_4=driver.findElement(By.xpath("//p[text()='Email Address cannot be blank.']")).getText();
		
		System.out.println(attri_4);
		if(attri_4.contains("Email Address cannot be blank")) {
			System.out.println("Error Message displaying successfully ");
		}else {
			System.out.println("Failed to display Error message for no inputs");
		}
	  
  }
 
}
