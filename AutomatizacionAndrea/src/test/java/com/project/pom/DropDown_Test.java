package com.project.pom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class DropDown_Test {
	
	private WebDriver driver;
	Dropdown_List loginPage;

	@Before
	public void setUp() throws Exception {
		loginPage = new Dropdown_List(driver);
		driver=loginPage.chromeDriverConnection();
		loginPage.visit("https://the-internet.herokuapp.com/dropdown");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		loginPage.searchDropDown();
		
	}

}
