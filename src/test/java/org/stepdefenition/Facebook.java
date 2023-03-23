package org.stepdefenition;

import org.baseclass.UtilityFiles;
import org.pom.FacebookLoginPage;

import cucumber.api.java.en.*;

public class Facebook extends UtilityFiles{
	public  FacebookLoginPage f;
	
	@Given("user has to launch the chrome browser")
	public void user_has_to_launch_the_chrome_browser() {
		launchBrowser("chrome");
	}

	@When("user has to launch the facebook url to log in")
	public void user_has_to_launch_the_facebook_url_to_log_in() {
		runUrl("https://www.facebook.com/");
	}

	@When("user has to pass the username in the email or phone textbox field")
	public void user_has_to_pass_the_username_in_the_email_or_phone_textbox_field() {
		f = new FacebookLoginPage();
		sendKeys(f.getMail(), "muralimariyan8@gmail.com");
	}

	@When("user has to pass the password in the password textbox field")
	public void user_has_to_pass_the_password_in_the_password_textbox_field() {
		f = new FacebookLoginPage();
		sendKeys(f.getPass(), "murali");
	}

	@When("user has to click the log in button")
	public void user_has_to_click_the_log_in_button() {
		f = new FacebookLoginPage();
		click(f.getLogIn());
	}

	@When("to check whether the page navigate to next page or not")
	public void to_check_whether_the_page_navigate_to_next_page_or_not() {
		System.out.println("Check the username or password");
	}

	@Then("user has to close the entire browser")
	public void user_has_to_close_the_entire_browser() {
		close();
	}

}
