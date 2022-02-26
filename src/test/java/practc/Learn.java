package practc;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Learn {
	static Baseclass b = new Baseclass();
	
	@BeforeClass
	public static void beforeclass() {
		
		b.browserconfig();
		b.openUrl("https://www.facebook.com/");
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
	public void test1() {
		WebElement usr = b.locateById("esail");
		usr.sendKeys("Prasath");
		
		}
	
	@Test
	public void test2() {
		WebElement pass = b.locateById("pass");
		pass.sendKeys("123456@12");
	}
	 @AfterClass
	 public static void afterclass() {
		 b.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 b.quit();
	 }
	

}
