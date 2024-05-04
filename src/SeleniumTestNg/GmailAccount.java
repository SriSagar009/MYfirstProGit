package SeleniumTestNg;

import org.testng.annotations.Test;

public class GmailAccount {
  @Test(dataProviderClass = TestDataClass.class,dataProvider = "RegisterData")
  public void verifyRegister(String fname, String lname, String gmail,double pNno) {
	  System.out.println(fname);
	  System.out.println(lname);
	  System.out.println(gmail);
	  System.out.println(pNno);
	  
  }
}
