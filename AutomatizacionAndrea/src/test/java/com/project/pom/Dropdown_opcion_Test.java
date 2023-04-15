package com.project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Dropdown_opcion_Test {

	private WebDriver driver;
	Dropdown_opcion ddLPage;
	
	@Before
	public void setUp() throws Exception {
		ddLPage = new Dropdown_opcion(driver);
		driver = ddLPage.chromeDriverConnection();
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		 driver.quit();
		}

	@Test
	public void testind_DDL() throws InterruptedException {
		ddLPage.visit("https://the-internet.herokuapp.com/dropdown");
		assertEquals(ddLPage.SelectDropdown(),"Option 2");
		Thread.sleep(2000);
	}
	
	
}
