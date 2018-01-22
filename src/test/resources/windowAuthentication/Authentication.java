package windowAuthentication;

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
		driver.get("http://www.fb.com");
	}
}
