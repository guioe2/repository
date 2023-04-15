package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dropdown_List extends Base {

	By dropDownLocator = By.xpath("//*[@id=\"content\"]/div/h3");
	By dropDownList = By.id("dropdown");
	By dropDownValue = By.xpath("//option[@value='1']");
	String expectedOptions[] = {"Option 1", "Option 2"};
	
	public Dropdown_List(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void searchDropDown() throws InterruptedException {
		if(isDisplayed(dropDownLocator)) {	
			Thread.sleep(2000);
			String Actual = getText(dropDownValue);
			for(int i = 0; i < findElements(dropDownList).size(); i++) {		
				String Esperada = expectedOptions[i];
				searchArray(Actual,Esperada, dropDownList);	
			}
			
			Thread.sleep(2000);
		}
	}
	
}
