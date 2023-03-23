package org.pom;

import org.baseclass.UtilityFiles;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraLoginPage extends UtilityFiles{

	public MyntraLoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='desktop-navLink']//child::a[text()='Men']")
	private WebElement men;
	
	@FindBy(xpath = "//li[@data-reactid='30']//child::a[text()='T-Shirts']")
	private WebElement tShirt;
	
	@FindBy(xpath = "//img[contains(@alt,'Black Typography Printed Sustainable T-shirt')]")
	private WebElement img;
	
	@FindBy(xpath = "(//p[@class='size-buttons-unified-size'])[2]")
	private WebElement size;
	
	@FindBy(xpath = "//input[@placeholder='Enter pincode']")
	private WebElement pinCode;
	
	@FindBy(xpath = "//input[@value='Check']")
	private WebElement check;

	public WebElement getMen() {
		return men;
	}

	public WebElement gettShirt() {
		return tShirt;
	}

	public WebElement getImg() {
		return img;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getPinCode() {
		return pinCode;
	}

	public WebElement getCheck() {
		return check;
	}

}
