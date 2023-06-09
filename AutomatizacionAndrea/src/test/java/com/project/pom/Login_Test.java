package com.project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Login_Test {
	
	private WebDriver driver;
	LoginUserPage loginPage;

	@Before
	public void setUp() throws Exception {
	 loginPage = new LoginUserPage(driver);
	 driver=loginPage.chromeDriverConnection();
	 loginPage.visit("https://the-internet.herokuapp.com/login");
	}

	@After
	public void tearDown() throws Exception {
	 driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
	 loginPage.loginUser();
	 Thread.sleep(2000);
	 assertTrue(loginPage.loginMessage());
	}

}
