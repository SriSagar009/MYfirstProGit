package SeleniumTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandlingMouseActions {
	 WebDriver driver;
	 Actions act;
  @Test(priority=1, enabled=false)
  public void verifyDraggable() {
	  driver.findElement(By.xpath("//a[text()='Draggable']")).click();
	  driver.switchTo().frame(0);
	  act.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).build().perform();
	  act.moveByOffset(100,120).build().perform();
	  act.release().build().perform();
	  
	  //or we can right in one line 
	  act.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).moveByOffset(100, 0).release().build().perform();
	  driver.switchTo().defaultContent();
  }
  @Test(priority=2,enabled=false)
  public void  verifyDroppable() {
	  driver.findElement(By.xpath("//a[text()='Droppable']")).click();
	  driver.switchTo().frame(0);
	  act.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform();
	  String text=driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();
	  if (text.equals("Dropped!")) {
		  System.out.println("Test Passed");
		
	}
	  else {
		  System.out.println("Test failed");
	  }
	  driver.switchTo().defaultContent();
  }

	
	  @Test(priority=3) 
	  public void verifyResize() {
	  driver.findElement(By.xpath("//a[text()='Resizable']")).click();
	  driver.switchTo().frame(0); act.clickAndHold(driver.findElement(By.xpath("//div[@id='resizable']/h3/following-sibling::div/following-sibling::div/following-sibling::div"))).build().perform(); 
	  
	  
	  act.moveByOffset(396, 166).build().perform();
	  act.release().build().perform(); driver.switchTo().defaultContent();
	  }
	 
  
  @Test(priority=4,enabled=false)
  public void verifySelectable() {
	  driver.findElement(By.xpath("//a[text()='Selectable']")).click();
	  driver.switchTo().frame(0);
	  		//selecting one element
	  //act.click(driver.findElement(By.xpath("//li[text()='Item 1']"))).build().perform();
	  				//selecting multiple element at a time
	  act.dragAndDrop(driver.findElement(By.xpath("//li[text()='Item 1']")),driver.findElement(By.xpath("//li[text()='Item 7']"))).build().perform();
	  act.release().build().perform();
	  driver.switchTo().defaultContent();
	  
  }
  @Test(priority=5,enabled=false)
  public void varifySortable() {
	  driver.findElement(By.xpath("//a[text()='Sortable']")).click();
	  driver.switchTo().frame(0);
	 //act.dragAndDrop(driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][1]")),driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][6]"))).build().perform();
	  act.dragAndDropBy(driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][1]")), 100, 125).build().perform();
	  act.release().build().perform();
	  driver.switchTo().defaultContent();
  }
 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("Webdriver.chrome.driver","C:\\Users\\RAMA\\OneDrive\\Desktop\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/");
	  driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 act=new Actions(driver);
	  
  }
}
