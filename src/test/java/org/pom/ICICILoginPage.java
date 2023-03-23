package org.pom;

import org.baseclass.UtilityFiles;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ICICILoginPage extends UtilityFiles{
	
	public ICICILoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='DUMMY1']")
	private WebElement userId;
	
	@FindBy(xpath = "(//img[@id='user-id-goahead'])[1]")
	private WebElement arrowBtn;
	
	@FindBy(xpath = "//input[@id='AuthenticationFG.ACCESS_CODE']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='VALIDATE_CREDENTIALS1']")
	private WebElement logIn;

	public WebElement getUserId() {
		return userId;
	}

	public WebElement getArrowBtn() {
		return arrowBtn;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogIn() {
		return logIn;
	}
	
	
}
