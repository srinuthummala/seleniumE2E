package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;

public class WebTableTest extends Base {

	@BeforeMethod
	public void setup() {
		browserInitialize();
	}

	@Test
	public void table() {
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("thummala");
		driver.findElement(By.name("password")).sendKeys("thummala");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@type='submit']")));

		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[@title='Contacts']")).click();

		List<WebElement> contacts = driver.findElements(By.xpath("//a[@context='contact']"));
		System.out.println(contacts.size());

		for (WebElement ele : contacts) {
			String str = ele.getAttribute("_name");
			 
			try 
			{
				WebElement phone = ele.findElement(By.xpath("//a[@_name='" + str + "']//parent::td//parent::tr//child::td/span[@context='phone']"));
				System.out.println(str + "-->" + phone.getText());

			} catch (Exception e) 
			{
				System.out.println(str+"no phone no assigned to this contact");
			}

		}

		driver.switchTo().defaultContent();

	}
	
	@AfterMethod
	public void quit() {
		driver.close();
		driver.close();
	}

}
