package com.google.step_definitions;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.pages.HomePage;
import com.google.pages.SearchPage;
import com.google.utilities.Base;
import com.google.utilities.Utils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchItemPositive extends Base{
	
	HomePage homePage = new HomePage();
	SearchPage searchPage = new SearchPage();
	
	List<WebElement> list;
	WebDriverWait wait;
	
	@Given("^I am in the Google page$")
	public void i_am_in_the_Google_page() throws Throwable {
		driver.get("http://www.google.com");
		wait = new WebDriverWait(driver, 10);
	}

	@Given("^I enter \"([^\"]*)\" to search for$")
	public void i_enter_to_search_for(String item) throws Throwable {
		WebElement inputFieldQ = wait.until
				(ExpectedConditions.elementToBeClickable(homePage.searchInput));
		inputFieldQ.sendKeys(item);
	}

	@When("^I click in the search button$")
	public void i_click_in_the_search_button() throws Throwable {
		WebElement searchButton = wait.until
				(ExpectedConditions.elementToBeClickable(homePage.searchButton));
		searchButton.click();
	}

	@Then("^I see the results$")
	public void i_see_the_results() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(searchPage.nextLink));
		list = searchPage.ResultLinks;
	}

	@Then("^the result links are valid$")
	public void the_result_links_are_valid() throws Throwable {
		int httpReturnCode;
		String link ="",tagOK="";
		
//		System.out.println(Utilities.checkWebLinks("http://www.google.com/"));
		
		// Print the links and if they are working without clicking them
		for (WebElement el : list) {
			link = el.getAttribute("href");
			httpReturnCode = Utils.checkWebLinks(link);
			if (httpReturnCode==200){
				tagOK = "OK";
			} else {
				tagOK = "FALSE";
				break;
			}
			System.out.println(link+" : "+tagOK);
		}
		assertTrue("This link is not valid: "+link, tagOK.equals("FALSE"));
	}
}
