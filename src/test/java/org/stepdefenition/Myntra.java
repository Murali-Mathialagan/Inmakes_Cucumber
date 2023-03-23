package org.stepdefenition;

import java.util.Set;

import org.baseclass.UtilityFiles;
import org.pom.MyntraLoginPage;

import cucumber.api.java.en.*;


public class Myntra extends UtilityFiles{
	
	public MyntraLoginPage m;
	
	@Given("To launch the chrome browser to validate web application")
	public void to_launch_the_chrome_browser_to_validate_web_application() {
		launchBrowser("chrome");
	}

	@When("user has to launch the myntra url")
	public void user_has_to_launch_the_myntra_url() {
		runUrl("https://www.myntra.com/");
	}

	@When("user has to move the cursor to the men in categories")
	public void user_has_to_move_the_cursor_to_the_men_in_categories() {
		m = new MyntraLoginPage();
		moveToElement(m.getMen());
	}

	@When("user has to click the T shirts in topwear categories")
	public void user_has_to_click_the_T_shirts_in_topwear_categories() {
		m = new MyntraLoginPage();
		click(m.gettShirt());
	}

	@When("user has to click the product and switched to the new tab")
	public void user_has_to_click_the_product_and_switched_to_the_new_tab() {
		m = new MyntraLoginPage();
		click(m.getImg());
	}

	@When("user has to switch the driver to another tab")
	public void user_has_to_switch_the_driver_to_another_tab() {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String newWin : windowHandles) {
			driver.switchTo().window(newWin);
		}
	}

	@When("user has to choose the required size of that product")
	public void user_has_to_choose_the_required_size_of_that_product() {
		m = new MyntraLoginPage();
		click(m.getSize());
		
	}

	@When("user has to pass the pincode in the enter pincode textbox")
	public void user_has_to_pass_the_pincode_in_the_enter_pincode_textbox() {
		m = new MyntraLoginPage();
		sendKeys(m.getPinCode(), "603303");
	}

	@When("user has to click the check button to check the availability")
	public void user_has_to_click_the_check_button_to_check_the_availability() {
		m = new MyntraLoginPage();
		click(m.getCheck());
	}

	@Then("user has to close the whole browser")
	public void user_has_to_close_the_whole_browser() {

	}


	
	


}
