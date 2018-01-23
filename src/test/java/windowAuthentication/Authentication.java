package windowAuthentication;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;

public class Authentication extends Base {

	@BeforeMethod
	public void init() {
		browserInitialize();
	}
	
	@Test
	public void auth() {
		driver.get("https://mukeshotwani:password123@www.engprod-charter.net/");
		
	}
}
