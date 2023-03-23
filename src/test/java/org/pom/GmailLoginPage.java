package org.pom;

import org.baseclass.UtilityFiles;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLoginPage extends UtilityFiles {

	public GmailLoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Sign in']")
	private WebElement signIn;

	@FindBy(xpath = "//input[@id='identifierId']")
	private WebElement email;

	@FindBy(xpath = "//span[text()='Next']")
	private WebElement next;

	@FindBy(xpath = "//div[text()='Enter your password']")
	private WebElement pass;

	@FindBy(xpath = "//span[text()='Next']")
	private WebElement submit;

	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getNext() {
		return next;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
