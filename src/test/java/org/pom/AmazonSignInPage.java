package org.pom;

import org.baseclass.UtilityFiles;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSignInPage extends UtilityFiles {

	public AmazonSignInPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Account & Lists']")
	private WebElement Accounts;
	@FindBy(xpath = "(//span[text()='Sign in'])[1]")
	private WebElement signIn;
	@FindBy(xpath = "//input[@id='ap_email']")
	private WebElement eMail;
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continueBtn;
	@FindBy(xpath = "//input[@id='ap_password']")
	private WebElement password;
	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement submit;

	public WebElement getAccounts() {
		return Accounts;
	}

	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement geteMail() {
		return eMail;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
