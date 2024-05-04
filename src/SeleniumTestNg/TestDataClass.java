package SeleniumTestNg;

import org.testng.annotations.DataProvider;

public class TestDataClass {
	 @DataProvider(name = "LoginTestData")
	  public Object[][] loginData(){
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
	 @DataProvider(name = "RegisterData")
	 public Object[][] Register() {
		 Object[][] data= new Object[3][4];
		 data[0][0]="siddu";
		 data[0][1]="potti";
		 data[0][2]="siddu@gmail.com";
		 data[0][3]=865745621;
		 
		 data[1][0]="ramu";
		 data[1][1]="ram";
		 data[1][2]="Ramu@gmail.com";
		 data[1][3]=987546218;
		 
		 data[2][0]="jai";
		 data[2][1]="sri Ram";
		 data[2][2]="sriram@gmail.com";
		 data[2][3]=756231524;
		 
		 return data;
		 
		 
		 
	 }
}
