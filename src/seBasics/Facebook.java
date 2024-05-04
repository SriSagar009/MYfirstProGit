package seBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	WebDriver driver;
public  void browserlaunch() {
	 driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
	
	
}
public void selectDate (int date)
{
Select select = new Select(driver.findElement(By.cssSelector("select[name='birthday_day']")));
	
	List<WebElement> listOfDtaes = select.getOptions();
	
	System.out.println(listOfDtaes.size());
	
	for (int i=0;i<listOfDtaes.size();i++)
	{
		if (i==date)
		{
			 select.selectByIndex(i-1);
		}
	}
	}
public static void main(String[] args) 
{
	Facebook face = new Facebook();
	face.browserlaunch();
	face.selectDate(29);
}
}
