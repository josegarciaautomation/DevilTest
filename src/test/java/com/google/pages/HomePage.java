package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.utilities.Base;

public class HomePage extends Base{
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="input[name='q']")
	public WebElement searchInput;
	
	@FindBy(name="nameOfSearchButton")
	public WebElement searchButton;
}
