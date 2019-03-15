package com.cg.github.stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.github.pagebeans.LoginPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GithubStepDefination {
	private WebDriver driver;
	private LoginPage loginPage;

	@Before
	public static void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver", "D:\\Software_backup\\chromedriver.exe");
	}
	@Given("^User is on GitHubLoginPage$")
	public void user_is_on_GitHubLoginPage() throws Throwable {
	    driver=new ChromeDriver();
	    driver.get("https://github.com/login");
	    loginPage=PageFactory.initElements(driver, LoginPage.class);
	}

	@When("^user enter Invalid username and passwords$")
	public void user_enter_Invalid_username_and_passwords() throws Throwable {
	loginPage.setUsername("na11121997");
	loginPage.setPassword("pass");
	loginPage.clickSignIn();
	
	}

	@Then("^Incorrect 'username or password' Message should display$")
	public void incorrect_username_or_password_Message_should_display() throws Throwable {
		String expectedErrorMessages="Incorrect username or password.";
		Assert.assertEquals(expectedErrorMessages,loginPage.getActualMessage());
	}

	@When("^user enter valid username and password$")
	public void user_enter_valid_username_and_password() throws Throwable {
		loginPage.setUsername("na11121997");
		loginPage.setPassword("Nitish");
		loginPage.clickSignIn();
		loginPage.toString();
	}

	@Then("^user should successfully sign in on his github page$")
	public void user_should_successfully_sign_in_on_his_github_page() throws Throwable {
	    String actualTitle=driver.getTitle();
	    String expectedTitle="GitHub";
	    Assert.assertEquals(expectedTitle, actualTitle);
	}

	@cucumber.api.java.After
	public void tearDownStepEnv() {
		//driver.close();
	}
}
