package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown_opcion extends Base{

	By DropdownLocator = By.id("dropdown");
	
	public Dropdown_opcion(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public String SelectDropdown() {
		Select selectList = new Select(findElement(DropdownLocator));
		selectList.selectByVisibleText("Option 2");
		return getText(selectList.getFirstSelectedOption());
	}
}
