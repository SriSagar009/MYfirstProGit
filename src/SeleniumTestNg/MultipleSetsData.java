package SeleniumTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleSetsData {
	 WebDriver driver;
	
  @Test(dataProvider = "testSampledata")
  public void verifyTestData(String uname, String pwd) {
	  System.out.println(uname);
	  System.out.println(pwd);
	  
  }
  
  @DataProvider
  public Object[][] testSampledata(){
	  Object[][] data=new Object[4][2];
	  //1st row
	  data[0][0]="Sri";
	  data[0][1]="sri123";
	  
	  //2nd row
	  data[1][0]="sagar";
	  data[1][1]="sagar123";
	  
	  //3rd row
	  data[2][0]="nikhil";
	  data[2][1]="nikhil123";
	  
	 // 4th row
	  data[3][0]="sanjay";
	  data[3][1]="sanjay123";
	  
	  return data;
	  
	  
  }
  @Test
  public void facebook() {
	  driver.findElement(By.id("email")).sendKeys("Sri");
	  driver.findElement(By.id("pass")).sendKeys("sri123");
	  driver.findElement(By.name("login")).click();
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("WebDriver.chrome.driver","C:\\Users\\RAMA\\OneDrive\\Desktop\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
  }
}
