package com.google.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.utilities.Base;

public class SearchPage extends Base{
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@class='pn']")
	public WebElement nextLink;
	
	@FindBy(xpath="//h3/a")
	public List<WebElement> ResultLinks;
}
