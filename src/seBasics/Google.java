package seBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Google {
	WebDriver driver;
	WebDriverWait wait;
  @Test
  public void CreateAccount() {
	  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\RAMA\\OneDrive\\Desktop\\chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*"); 
		 driver = new ChromeDriver();
		 driver.get("https://www.google.co.in/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		 
		 
	  driver.switchTo().frame("callout");
	  driver.findElement(By.xpath("//button[text()='No thanks']")).click();
	  driver.switchTo().defaultContent();
	  driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("r4r4y6yu7hrr");
	  driver.findElement(By.xpath("(//input[@class='gNO89b'])[1]")).click();
	  
  }
}
