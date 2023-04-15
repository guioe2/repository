package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input_Number extends Base{


	By inputsLocator = By.xpath("//*[@id=\"content\"]/div/div/h3");
	By numberLocator = By.xpath("//*[@id=\"content\"]/div/div/div/input");
	

	public Input_Number(WebDriver driver) {
		super(driver);
	}
	
	public void writeNumber() throws InterruptedException {
		click(numberLocator);
		if(isDisplayed(numberLocator)) {
			type("-2",numberLocator);
		}
	}
	
	
}
