package SeleniumTestNg;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.IOException;
import com.beust.ah.A;

public class robotclass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Robot r= new  Robot();
		Runtime.getRuntime().exec("notepad");
		Thread.sleep(30);
		 
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		Thread.sleep(20);
		//Toolkit .getDefaultToolkit().getSystemClipboard().setContents(r, null);

}
}