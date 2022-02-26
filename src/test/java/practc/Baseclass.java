package practc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	static WebDriver driver;
	static String data;

	public void browserconfig() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public void openUrl(String url) {
		driver.get(url);

	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void quit() {
		driver.quit();
	}

	public WebElement locateById(String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;

	}

	public WebElement locateByName(String name) {
		WebElement findElement = driver.findElement(By.name(name));
		return findElement;

	}

	public WebElement locateByClassName(String classname) {
		WebElement findElement = driver.findElement(By.className(classname));
		return findElement;

	}

	public WebElement locateByXpath(String xpath) {
		WebElement findElement = driver.findElement(By.xpath(xpath));
		return findElement;

	}

	public WebElement inputText(WebElement element, String value) {
		element.sendKeys(value);
		return element;

	}

	public void click(WebElement element) {
		element.click();

	}

}
