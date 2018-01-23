package webTable;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;

public class TestWebTable1 extends Base{
	
	@BeforeMethod
	public void setup() {
		browserInitialize();
	}
	
	@Test
	public void method() throws InterruptedException, AWTException {
		System.out.println("hi");
		driver.get("http://www.google.com");
		Thread.sleep(4);
		
		driver.findElement(By.xpath("//a[text( )='Gmail']"));
		
		Robot r = new Robot();
		driver.findElement(By.xpath("//a[text( )='Gmail']"));
		

		r.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	@AfterTest
	public void quit() {
		driver.close();
		driver.close();
	}

}
