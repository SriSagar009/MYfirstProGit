package seBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelenium {

	public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\RAMA\\OneDrive\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//	driver.findElement(By.id("email")).sendKeys("Sri");
//	driver.findElement(By.name("pass")).sendKeys("Sri0090");
//	driver.findElement(By.name("login")).click();	
	driver.findElement(By.linkText("Create new account")).click();
	driver.findElement(By.name("firstname")).sendKeys("fuffn");
	driver.findElement(By.name("lastname")).sendKeys("ssffkmm");
	driver.findElement(By.name("reg_email__")).sendKeys("9658423147");
	driver.findElement(By.id("password_step_input")).sendKeys("sri0090");
	new Select(driver.findElement(By.id("day"))).selectByIndex(11);
	new Select(driver.findElement(By.id("month"))).selectByValue("4");
	new Select(driver.findElement(By.id("year"))).selectByVisibleText("1998"); 
	driver.findElement(By.xpath("//label[text()='Male']")).click();	
	driver.findElement(By.name("websubmit")).click(); 
	}

}
