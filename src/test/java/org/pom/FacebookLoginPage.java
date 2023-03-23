package org.pom;

import org.baseclass.UtilityFiles;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage extends UtilityFiles{
	
	public FacebookLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement mail;
	
	@FindBy(xpath = "//input[@id='pass']")
	private WebElement pass;
	
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement logIn;

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogIn() {
		return logIn;
	}
	

}
