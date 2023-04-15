package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover_User extends Base {
	
	
	By hoverLocator = By.xpath("//*[@id=\"content\"]/div/h3");
	By hoverUser = By.xpath("//div[@class='figure'][2]/img");
	By userNumber = By.xpath("//div[@class='figure'][2]/div/h5");
	
	public Hover_User(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void hoverUser() throws InterruptedException {
		Actions actions = new Actions(getDriver());
		if(isDisplayed(hoverLocator)) {	
			actions.moveToElement(findElement(hoverUser)).build().perform();
			getText(userNumber);
		}
	}

}
