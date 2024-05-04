package seBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OutlookCeateAccount {
	WebDriver driver;
	public static void main(String[] args) {
		OutlookCeateAccount a1 = new OutlookCeateAccount();
		a1.setup();
		a1.createaccount();
		a1.profile();
	}
	public void setup() {
		System.setProperty("webdriver.chorme.driver","C:\\Users\\RAMA\\OneDrive\\Desktop\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
	public void createaccount() {
		driver.findElement(By.xpath("(//span[text()='Create free account'])[1]")).click();
		driver.findElement(By.id("MemberName")).sendKeys("sri966643");
		driver.findElement(By.id("iSignupAction")).click();
		driver.findElement(By.id("PasswordInput")).sendKeys("stftuf6664");
		driver.findElement(By.id("ShowHidePasswordCheckbox")).click();
		driver.findElement(By.id("iSignupAction")).click();
		}
	public void profile() {
		driver.findElement(By.id("FirstName")).sendKeys("Sri");
		driver.findElement(By.id("LastName")).sendKeys("Sagar");
		driver.findElement(By.id("iSignupAction")).click();
		new Select(driver.findElement(By.id("Country"))).selectByValue("AF");
		new Select(driver.findElement(By.name("BirthMonth"))).selectByValue("4");
		new Select(driver.findElement(By.id("BirthDay"))).selectByIndex(11);
		driver.findElement(By.id("BirthYear")).sendKeys("1998");
		driver.findElement(By.id("iSignupAction")).click();
		
		
		
	}
	
		
	}

