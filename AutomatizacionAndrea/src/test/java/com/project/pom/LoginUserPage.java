package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginUserPage extends Base {
	
	By userLocator = By.id("username");
	By passLocator = By.id("password");
	By signInBtnLocator = By.xpath("//*[@id=\"login\"]/button/i");
	By homePageLocator = By.xpath("//*[@id=\"content\"]/div/h4");
	By LogoutInBtnLocator = By.xpath("//*[//*[@id=\"content\"]/div/a");

	public LoginUserPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void loginUser() throws InterruptedException {
		Thread.sleep(2000);
		click(userLocator);
		if(isDisplayed(userLocator)) {
			type("tomsmith",userLocator);
			type("SuperSecretPassword!",passLocator);
			click(signInBtnLocator);
		}
	}
	
	public boolean loginMessage() {
	return isDisplayed(homePageLocator);
	}

}
