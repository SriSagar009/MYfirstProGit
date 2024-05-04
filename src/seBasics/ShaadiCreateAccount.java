package seBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShaadiCreateAccount {
	WebDriver driver;
	WebDriverWait wait;
	Actions act;

	public static void main(String[] args) {
	ShaadiCreateAccount s1=new ShaadiCreateAccount();
	s1.setup();
	s1.CreateAccount();

}
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAMA\\OneDrive\\Desktop\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://shaadi.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		act = new Actions(driver);
		
	}
	public void CreateAccount() {
		driver.findElement(By.xpath("//label[text()=\"I'm looking for a\"]/following-sibling::div/div/div[1]")).click();
		driver.findElement(By.xpath("//div[text()='Man']")).click();
		driver.findElement(By.xpath("//label[text()='aged']/following-sibling::div/div[contains(@class,'ageFrom')]//div[contains(@class,'is-selected')]")).click();
		driver.findElement(By.xpath("//div[text()='23']")).click();
		driver.findElement(By.xpath("//div[text()='to']/following-sibling::div/div[contains(@class,'Dropdown-root')]//div[contains(@class,'is-selected')]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='27']")));
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath("//div[text()='27']")).click();
		driver.findElement(By.xpath("//label[text()='of religion']/following-sibling::div//div[text()='Select']")).click();
		driver.findElement(By.xpath("//div[text()='Hindu']")).click();
		driver.findElement(By.xpath("//label[text()='and mother tongue']/following-sibling::div//div[text()='Select']")).click();
		driver.findElement(By.xpath("(//div[text()='Telugu'])[1]")).click();
		driver.findElement(By.xpath("//button[text()=\"Let's Begin\"]")).click();
		driver.findElement(By.xpath("(//span[@class='MuiChip-label'])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Male']")).click();
		driver.findElement(By.xpath("//label[text()='First name']/following-sibling::div/input")).sendKeys("sri");
		driver.findElement(By.xpath("//label[text()='Last name']/following-sibling::div/input")).sendKeys("sagar");
		driver.findElement(By.xpath("//label[text()='Day']/following-sibling::div/input")).sendKeys("10");
		driver.findElement(By.xpath("//input[@name='month']")).sendKeys("04");
		driver.findElement(By.xpath("//input[@name='year']")).sendKeys("1998");
		driver.findElement(By.xpath("(//p[text()='Continue'])[1]")).click();
		driver.findElement(By.xpath("//div[text()='His religion']/following-sibling::div//div[@id='mui-component-select-community']")).click();
		driver.findElement(By.xpath("//Li[@data-value='Hindu']")).click();
	    driver.findElement(By.xpath("//div[text()='Community']/following-sibling::div//label/following-sibling::div/div")).click();
		driver.findElement(By.xpath("//Li[@data-value='Telugu']")).click();
		driver.findElement(By.xpath("//div[text()='Living in']/following-sibling::div/label/following-sibling::div/div")).click();
		driver.findElement(By.xpath("//li[@data-value='India']")).click();
		driver.findElement(By.xpath("(//p[text()='Continue'])[2]")).click();
		
		driver.findElement(By.xpath("//label[text()='Email ID']/following-sibling::div/input")).sendKeys("psri009@gmail.com");
		driver.findElement(By.xpath("//label[text()='Mobile no.']/following-sibling::div/input[@name='mobileNo']")).sendKeys("9666438140");
		driver.findElement(By.xpath("//p[text()='Submit']")).click();
		 
		
		
		
		
	}
}

