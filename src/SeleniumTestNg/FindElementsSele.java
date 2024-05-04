package SeleniumTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementsSele {
	WebDriver driver;
	
  @Test
  public void handlingfindElements() {
	  driver.findElement(By.xpath("(//a[text()='Frames'])[1]")).click();
	  //iframes methods
	  
	 driver.switchTo().frame("packageListFrame");
	 driver.findElement(By.xpath("//li/a[text()='org.openqa.selenium']")).click();
	 driver.switchTo().defaultContent();
	 driver.switchTo().frame(1);
	 driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
	 driver.switchTo().defaultContent();
	 driver.switchTo().frame(2);
	 String text=driver.findElement(By.xpath("//div[@class='subTitle']/following-sibling::h2")).getText();
	 String Title=driver.getTitle();
	 
	 if (text.equalsIgnoreCase("Interface WebDriver")&& Title.equals("WebDriver")) {
		System.out.println("Test is SuccessFull");
	}
	 else {
		System.out.println("test is Failed");
	}
	

		 
	
		
	 
	
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("WebDriver.chorme.driver","C:\\Users\\RAMA\\OneDrive\\Desktop\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
  }
  @AfterTest
  public void afterTest() {
	 // driver.quit();
  }
}
