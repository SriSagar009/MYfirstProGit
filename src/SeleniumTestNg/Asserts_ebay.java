package SeleniumTestNg;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asserts_ebay {
	WebDriver driver;
	WebDriverWait wait;
  @Test(priority=1) 
  public void VerifyingElements() {
	  		//Total Links in Home Page
	  List<WebElement> totElmt=driver.findElements(By.tagName("a"));
	  System.out.println("total elemts links :"+totElmt.size());
	  
	  WebElement fottersec=driver.findElement(By.id("glbfooter"));
	  int fotterLnks=fottersec.findElements(By.tagName("a")).size();
	  System.out.println("Total fotter Links :"+fotterLnks);
	  			//ASSERTS
	  assertEquals(fotterLnks,95,"Failed to match FotterLinks Count");
	  System.out.println("Successfully matched fotterlinks Count");
	  
	  System.out.println("*******************************************************");
	  	//finding total no of links in Second Column in fotter section
	  WebElement secCol=driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[2]"));
	  List<WebElement> SecColList=secCol.findElements(By.tagName("a"));
	  System.out.println("Total No.of Links in Scocol :"+SecColList.size());
	  		//Getting text of second col section
	  for (WebElement webElement : SecColList) {
		System.out.println(webElement.getText());
	
		
	}
	  
  }
  @Test(priority=2)
  public void verifydisplay() {
	  WebElement secColm=driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[2]"));
	  List<WebElement> SecColmList=secColm.findElements(By.tagName("a"));
	  System.out.println("Total No.of Links in Scocol :"+SecColmList.size());
	  		//Getting text of second col section
	  for (WebElement webElement : SecColmList) {
		  String text=webElement.getText();
		  System.out.println(text);
		  if(text.equals("Developers")) {
			  webElement.click();
			  
			  
		  }
		  
	  }
	  //wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("logo")));
	 
	  String attr=driver.findElement(By.className("logo")).getAttribute("alt");
	  String Title=driver.getTitle();
	  String CUrl=driver.getCurrentUrl();
	  
	  
	 assertTrue(Title.contains("Developers"),"failed to validate the page");
	 assertTrue(attr.contains("Developers"),"falied to validate the page");
	assertTrue(CUrl.contains("developer"),"failed to valiate the page");
	System.out.println("Successfully Title, CUrl, attr validated");
	 
	  
	   }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.crome.driver","C:\\Users\\RAMA\\OneDrive\\Desktop\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://www.ebay.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	  
  }
  @AfterTest
  public void afterTest() {
	  
  }
}
