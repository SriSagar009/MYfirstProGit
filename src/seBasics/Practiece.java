package seBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practiece {
	WebDriver driver;
public static void main(String[] args) {
	Practiece p =new Practiece();
	p.setup();
	p.createAccount();
		
}
public void setup() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAMA\\OneDrive\\Desktop\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.shaadi.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 
}
public void createAccount() {
	driver.findElement(By.xpath("//label[text()=\"I'm looking for a\"]/following-sibling::div//div[text()='Woman']")).click();
	driver.findElement(By.xpath("//div[text()='Man']")).click();
	driver.findElement(By.xpath("//label[text()='aged']/following-sibling::div/div[contains(@class,'ageFrom')]//div[text()='23']")).click();
	
	
	
	
}
}
