package org.stepdefenition;

import io.cucumber.datatable.*;

import java.util.Date;
import java.util.List;

import org.baseclass.UtilityFiles;
import org.pom.AmazonSignInPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class Amazon extends UtilityFiles {

	public AmazonSignInPage a;

	@Before(value = "@Amazon")
	public void preCondition() {
		Date d = new Date();
		System.out.println("Amazon Sign In Page start Time: " +d);
	}

	@After(value = "@Amazon")
	public void postCondition() {
		close();
	}

	@Given("To open the chrome browser and maximize the window to automate amazon sign in page")
	public void to_open_the_chrome_browser_and_maximize_the_window_to_automate_amazon_sign_in_page() {
		launchBrowser("chrome");
	}
	
	@When("To launch the amazon url of the application")
	public void to_launch_the_amazon_url_of_the_application() {
		runUrl("https://www.amazon.in/");
	}
	
	@When("user has to move the cursor to the Accounts and lists element")
	public void user_has_to_move_the_cursor_to_the_Accounts_and_lists_element() {
		a = new AmazonSignInPage();
		moveToElement(a.getAccounts());
	}

	@When("user has to click the signin button and navigate to the sign in page")
	public void user_has_to_click_the_signin_button_and_navigate_to_the_sign_in_page() {
		a = new AmazonSignInPage();
		click(a.getSignIn());
	}

	@When("user has to pass the valid email id in the email textbox field")
	public void user_has_to_pass_the_valid_email_id_in_the_email_textbox_field(DataTable d) {
		a = new AmazonSignInPage();
		
		List<String> l = d.asList();
		sendKeys(a.geteMail(), l.get(2));
	}

	@When("user has to click continue button and navigate to the next page")
	public void user_has_to_click_continue_button_and_navigate_to_the_next_page() {
		a = new AmazonSignInPage();
		click(a.getContinueBtn());
	}

	@When("user has to pass the valid password in the password textbox field")
	public void user_has_to_pass_the_valid_password_in_the_password_textbox_field(DataTable d) {
		a = new AmazonSignInPage();
		List<List<String>> list = d.asLists();
		sendKeys(a.getPassword(), list.get(0).get(2));
	}

	@Then("click the submit button to sign in")
	public void click_the_submit_button_to_sign_in() {
		a = new AmazonSignInPage();
		click(a.getSubmit());
	}


}
