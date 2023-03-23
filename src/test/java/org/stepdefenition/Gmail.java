package org.stepdefenition;

import org.baseclass.UtilityFiles;
import org.pom.GmailLoginPage;

import cucumber.api.java.en.*;

public class Gmail extends UtilityFiles {

	public GmailLoginPage g;

	@Given("user has to launch the chrome browser and maximize the window")
	public void user_has_to_launch_the_chrome_browser_and_maximize_the_window() {
		launchBrowser("chrome");
		windowMaximize();
	}

	@When("user has to launch the gmail url")
	public void user_has_to_launch_the_gmail_url() {
		runUrl("https://www.google.com/intl/en-GB/gmail/about/");

	}

	@When("user has to click the sign in button and navigate to sign in page")
	public void user_has_to_click_the_sign_in_button_and_navigate_to_sign_in_page() throws InterruptedException {
		g = new GmailLoginPage();
		click(g.getSignIn());
	}

	@When("user has to pass the valid {string} username or phone in the email or phone textbox field")
	public void user_has_to_pass_the_valid_username_or_phone_in_the_email_or_phone_textbox_field(String mail) {
		g = new GmailLoginPage();
		sendKeys(g.getEmail(), mail);
	}

	@When("user has to click the next button and navigate to the next page")
	public void user_has_to_click_the_next_button_and_navigate_to_the_next_page() {
		g = new GmailLoginPage();
//		click(g.getNext());
	}

	@When("user has to pass the {string} in the enter your password textbox field")
	public void user_has_to_pass_the_in_the_enter_your_password_textbox_field(String pass) {
		g = new GmailLoginPage();
//		sendKeys(g.getPass(), pass);
	}

	@Then("user has to close the browser")
	public void user_has_to_close_the_browser() {
		close();
	}

}
