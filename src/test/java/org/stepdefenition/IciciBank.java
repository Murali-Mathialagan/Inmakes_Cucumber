package org.stepdefenition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.baseclass.UtilityFiles;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.pom.ICICILoginPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class IciciBank extends UtilityFiles {
	
	public ICICILoginPage b;
	
	@Before(order = 1, value = "@Bank")
	public void browserLaunch() {
		launchBrowser("chrome");
	}
	
	@Before(order = 2, value = "@Bank")
	public void maximize() {
		windowMaximize();
	}
	
	@After(order = 1, value = "@Bank")
	public void browserClose() {
		close();
	}
	
	@After(order = 3, value = "@Bank")
	public void getScreenShot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\sblue\\eclipse-workspace\\CucumberProject\\Screenshot\\bank.png");
		FileUtils.copyFile(srcFile, destFile);
	}
	
	@When("user has to pass the url of the ICICI bank")
	public void user_has_to_pass_the_url_of_the_ICICI_bank() {
		runUrl("https://infinity.icicibank.com/corp/AuthenticationController?\r\n"
				+ "FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUT\r\n"
				+ "TONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI\r\n" + "");
	}

	@When("user has to pass the valid data in the user id textbox")
	public void user_has_to_pass_the_valid_data_in_the_user_id_textbox() {
		b = new ICICILoginPage();
		sendKeys(b.getUserId(), "muralimariyan");
	}

	@When("user has to click the arrow button")
	public void user_has_to_click_the_arrow_button() {
		b = new ICICILoginPage();
		click(b.getArrowBtn());
	}

	@When("user has to pass the valid data in the password textbox")
	public void user_has_to_pass_the_valid_data_in_the_password_textbox() {
		b = new ICICILoginPage();
		sendKeys(b.getPassword(), "Murali@123");
	}

	@When("user has to click the log in button and print the message")
	public void user_has_to_click_the_log_in_button_and_print_the_message() {
		b = new ICICILoginPage();
		click(b.getLogIn());
	}

	@Then("user has to check the credentials are valid or not")
	public void user_has_to_check_the_credentials_are_valid_or_not() {
		driver.switchTo().alert().accept();
	}

}
