package SeleniumTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriverBuilder;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon_Test {
	 WebDriver driver;
	 Actions act;
	 WebDriverWait wait;
  @Test
  public void verifyingElements() {

	  act.moveToElement(driver.findElement(By.xpath("//span[text()='Account & Lists']"))).perform();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Your Account']")));
	 act.moveToElement(driver.findElement(By.xpath("//span[text()='Your Account']"))).click().perform();
	  
  }
 @ BeforeTest
  public void beforeTest() {
	//  System.setProperty("WebDriver,chrome.driver","C:\\Users\\RAMA\\OneDrive\\Desktop\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  act =new Actions(driver);
	  wait = new WebDriverWait(driver, Duration.ofSeconds(30));
  }
}   
