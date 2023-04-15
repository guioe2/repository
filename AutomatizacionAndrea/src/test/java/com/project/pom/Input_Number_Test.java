package com.project.pom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Input_Number_Test {
	
	private WebDriver driver;
	Input_Number numberPage;

	@Before
	public void setUp() throws Exception {
		numberPage = new Input_Number(driver);
		driver=numberPage.chromeDriverConnection();
		numberPage.visit("https://the-internet.herokuapp.com/inputs");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		numberPage.writeNumber();
		Thread.sleep(1000);
		//assertTrue(loginPage.writeNumber());
	}

}
