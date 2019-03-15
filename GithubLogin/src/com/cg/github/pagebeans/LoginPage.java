package com.cg.github.pagebeans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	@FindBy(how=How.ID,id="login_field")
	private WebElement username;
	@FindBy(how=How.ID,id="password")
	private WebElement password;
	@FindBy(className="btn")
	private WebElement button;
	@FindBy(how=How.XPATH,xpath="//*[@id=\"js-flash-container\"]/div/div")
	private WebElement actualErrorMessage;
	
	public LoginPage() {}
	
	public String getUserName() {
		return username.getAttribute("value");
	}
	public void setUsername(String username) {
		this.username.sendKeys(username);
	}
	public String getPassword() {
		return password.getAttribute("value");
	}
	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
    public WebElement getButton() {
    	return button;
    }
    public String getActualMessage() {
    	return actualErrorMessage.getText();
    }
    public void clickSignIn() {
    	button.submit();
    }
}
