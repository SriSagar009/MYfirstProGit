package SeleniumTestNg;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.dataloader.impl.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementsEbay {
	WebDriver driver;
	WebDriverWait wait;
	
	
  @Test(priority=1)
  
  public void handlingWebElements() {
	  //total no.of Links on home page
	  List<WebElement> totWebEle = driver.findElements(By.tagName("a"));
	  System.out.println("Total Links: "+totWebEle.size());
	  
	  int totLinks = driver.findElements(By.tagName("a")).size();
	  System.out.println("Total Links: "+totLinks);
	  
	  //Total No.of links in footer section
	  WebElement footerSection = driver.findElement(By.id("glbfooter"));
	  int footerLinks = footerSection.findElements(By.tagName("a")).size();
	  System.out.println("footer Links: "+footerLinks);
	  
	  //Total No.of Links in Second Column Section
	  WebElement secCol= driver.findElement(By.xpath("//div[@id='gf-BIG']//td[2]"));
	  List<WebElement> secColList = secCol.findElements(By.tagName("a"));
			  System.out.println("List: "+secColList);
	  System.out.println("sec Links: "+secColList.size());
	  
	  //finding Element Text
		for (WebElement webElement : secColList) {
			System.out.println(webElement.getText());
		}
		System.out.println("**************************************");
		
		for (int i = 0; i <secColList.size(); i++) {
			String s=secColList.get(i).getText();
			System.out.println(secColList.get(i).getText());
			}	
		}
  @Test(priority=2)
  public void displayElement() {
	 WebElement col=driver.findElement(By.xpath("//div[@id='gf-BIG']//td[2]"));
	 List<WebElement> linklist=col.findElements(By.tagName("a"));
	 System.out.println("Total No.of Links in SecCol "+linklist.size());
	 for (WebElement webElement : linklist) {
		String text = webElement.getText();
		System.out.println(text);
		if (text.equals("Developers")) {
			webElement.click();
		
		}
	 }
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='logo']")));
		String attri=driver.findElement(By.xpath("//img[@class='logo']")).getAttribute("alt");
		String title= driver.getTitle();
		String curl=driver.getCurrentUrl();
		System.out.println ("*********************DISPLAY WITH USING IF CONDITION*******************************");
		if (attri.contains("Developers")&& title.contains("Developers")&& curl.contains("developer")) {
			System.out.println("test passed");
			
		}
		else {
			System.out.println("not passed");
		}
		
//		WebElement colm=driver.findElement(By.xpath("//div[@id='gf-BIG']//td[2]"));
//		List<WebElement> colmList=colm.findElements(By.tagName("a"));
//		System.out.println("total no.of Elements "+colmList.size());
//		for (WebElement webElement : colmList) {
//			String txt=webElement.getText();
//			System.out.println(txt);
//			if (txt.equals("Security center")) {
//				webElement.click();
//				
//			}
//		}
		
	}
	  
  @BeforeTest 
  public void beforeTest() {
	  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\RAMA\\OneDrive\\Desktop\\chromedriver.exe");
	 ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*"); 
	 driver = new ChromeDriver();
	 driver.get("https://www.ebay.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 wait=new WebDriverWait(driver,Duration.ofSeconds(20));
  }
  
  @AfterTest
  public void afterTest() {
	//  driver.quit();
	  
  }
}
