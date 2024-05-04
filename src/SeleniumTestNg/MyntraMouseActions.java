package SeleniumTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyntraMouseActions {
	WebDriver driver;
	Actions act;

  @Test
  public void handlingMouseActions() {
	  act.click(driver.findElement(By.xpath("//span[text()='Profile']"))).build().perform();
	  
  }
  @BeforeTest
  public void beforeTest() {
	 
		  System.setProperty("Webdriver.chrome.driver","C:\\Users\\RAMA\\OneDrive\\Desktop\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.myntra.com/");
		  driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 act=new Actions(driver);
  }
}
