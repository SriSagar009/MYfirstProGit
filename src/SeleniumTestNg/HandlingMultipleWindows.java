 package SeleniumTestNg;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandlingMultipleWindows {
	WebDriver driver;
	 Actions act;
	 WebDriverWait wait;
  @Test
  public void VerifyHandlingMultipleWindow() throws InterruptedException {
	  
	  String mwind=driver.getWindowHandle();
	  System.out.println("mwind "+mwind);
	  
	 driver.findElement(By.linkText("Signup")).click();
	 Set<String>winds=driver.getWindowHandles();
	 System.out.println("windows ID "+winds);
	 
	String childWind=null;
	for(String wind:winds) {
		if (!wind.equals(mwind)) {
			childWind=wind;
		}
	}
	 driver.switchTo().window(childWind);
	 driver.findElement(By.id("inputFirstName")).sendKeys("sri");
	 driver.findElement(By.id("inputLastName")).sendKeys("sagar");
	 driver.switchTo().window(mwind);
	 driver.findElement(By.linkText("Demo")).click();
	 driver.findElement(By.name("first_name")).sendKeys("jai");
	 driver.findElement(By.name("last_name")).sendKeys("sriram");
	 driver.switchTo().window(childWind);
	 driver.findElement(By.id("inputLastName")).click();
	 driver.findElement(By.id("inputLastName")).sendKeys(Keys.chord(Keys.CONTROL,"A"));
	 driver.findElement(By.id("inputLastName")).sendKeys(Keys.chord(Keys.CONTROL,"C"));
	 driver.findElement(By.id("inputEmail")).click();
	 driver.findElement(By.id("inputEmail")).sendKeys(Keys.chord(Keys.CONTROL,"V")+"@gmail.com");
	 Thread.sleep(2000);
	 driver.switchTo().window(mwind);
	 
	 
	 
	 
	  
	  
	
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("WebDriver.chrome.driver","C:\\Users\\RAMA\\OneDrive\\Desktop\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.get("https://phptravels.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  act = new Actions(driver);
	 
	  
  }
}
