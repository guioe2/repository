package com.project.pom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Hover_Test {

	private WebDriver driver;
	Hover_User loginPage;
	
	@Before
	public void setUp() throws Exception {
		loginPage = new Hover_User(driver);
		driver=loginPage.chromeDriverConnection();
		loginPage.visit("https://the-internet.herokuapp.com/hovers");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		loginPage.hoverUser();
		Thread.sleep(1000);
	}

}
