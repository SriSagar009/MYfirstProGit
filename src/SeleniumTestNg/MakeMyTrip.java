package SeleniumTestNg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MakeMyTrip {
	WebDriver driver;
	@BeforeTest
	public void Setup() {
		driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test
	public void Booikng() throws InterruptedException {
		WebElement ele=driver.findElement(By.xpath("//ul[@class='makeFlex font12 headerIconsGap']"));
	List<WebElement> webe=ele.findElements(By.tagName("a"));
	for (WebElement webElement : webe) {
		String str= webElement.getText();
		System.out.println(str);
		if(str.contains("Hotels")) {
			
			webElement.click();
		}if(str.contains("Homestays & Villas")) {
			
			Thread.sleep(5000);
			webElement.click();
		}	if(str.contains("Holiday Packages")) {
			
			Thread.sleep(5000);
			webElement.click();
		}if(str.contains("Trains")) {
			
			Thread.sleep(5000);
			webElement.click();
		}	if(str.contains("Buses")) {
			
			Thread.sleep(5000);
			webElement.click();
		}if(str.contains("Cabs")) {
			
			Thread.sleep(5000);
			webElement.click();
		}	if(str.contains("Forex Card & Currency")) {
			
			Thread.sleep(5000);
			webElement.click();
		}if(str.contains("Travel Insurance")) {
			
			Thread.sleep(5000);
			webElement.click();
		}
		
		
		else {
			System.out.println("Webelement Not clickable");
		}
	}
	}

}