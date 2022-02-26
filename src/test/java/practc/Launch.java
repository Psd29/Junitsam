package practc;

import org.openqa.selenium.WebElement;

public class Launch {
	public static void main(String[] args) {
		Baseclass b = new Baseclass();
		b.browserconfig();
		b.openUrl("https://www.facebook.com/");
		b.maximizeWindow();
		Pojo p = new Pojo();
		WebElement txtusr = p.getTxtusr();
		b.inputText(txtusr, "Manikandan");
		WebElement txtpass = p.getTxtpass();
		b.inputText(txtpass, "Mani3342");
		Baseclass.driver.navigate().refresh();
		WebElement txtusr1 = p.getTxtusr();
		b.inputText(txtusr1, "Prasath");
		WebElement txtpass1 = p.getTxtpass();
		b.inputText(txtpass1, "Bharth454");

	}

}
