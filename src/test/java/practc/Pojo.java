package practc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends Baseclass {
	public Pojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement txtusr;

	@FindBy(name = "pass")
	private WebElement txtpass;

	@FindBy(xpath = "//button[@name='login']")
	private WebElement btnlogin;

	public WebElement getTxtusr() {
		return txtusr;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

}
