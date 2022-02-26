package practc;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Junittask4 {
	static Baseclass b = new Baseclass();
	
	@BeforeClass
	public static void beforeclass() {
		b.browserconfig();
		b.openUrl("https://www.flipkart.com/account/login");
		b.maximizeWindow();
	}
	@Before
	public void before() {
		Date d = new Date();
		System.out.println(d);
	}
	@After
	public void after() {
		Date d = new Date();
		System.out.println(d);
	}
	@Test
	public void num() {
		WebElement num = b.locateByXpath("//input[@class='_2IX_2- VJZDxU']");
		num.sendKeys("9159937706");
	}
	@Test
	public void pass() {
		WebElement pass = b.locateByXpath("//input[@class='_2IX_2- _3mctLh VJZDxU']");
		pass.sendKeys("Prasath@123");
	}
	@AfterClass
	 public static void afterclass() {
		 b.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 b.quit();
	 }

}
