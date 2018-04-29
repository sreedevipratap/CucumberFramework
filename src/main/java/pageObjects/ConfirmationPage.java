package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {
	
	public ConfirmationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
