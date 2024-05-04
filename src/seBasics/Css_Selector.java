package seBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Css_Selector {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	driver.findElement(By.cssSelector("#email")).sendKeys("Srisagar");
	driver.findElement(By.cssSelector("[name='pass']")).sendKeys("9966325");
	driver.findElement(By.cssSelector("[class='_9lsb _9ls8']")).click();
}
}
