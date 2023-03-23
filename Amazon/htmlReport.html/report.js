$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Amazon.feature");
formatter.feature({
  "name": "To validate the signin functionality of the amazon application",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To open the chrome browser and maximize the window to automate amazon sign in page",
  "keyword": "Given "
});
formatter.match({
  "location": "Amazon.to_open_the_chrome_browser_and_maximize_the_window_to_automate_amazon_sign_in_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate signin page with valid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Amazon"
    }
  ]
});
formatter.step({
  "name": "To launch the amazon url of the application",
  "keyword": "When "
});
formatter.match({
  "location": "Amazon.to_launch_the_amazon_url_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to move the cursor to the Accounts and lists element",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon.user_has_to_move_the_cursor_to_the_Accounts_and_lists_element()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the signin button and navigate to the sign in page",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon.user_has_to_click_the_signin_button_and_navigate_to_the_sign_in_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to pass the valid email id in the email textbox field",
  "rows": [
    {
      "cells": [
        "muralimariyan8@gmail.com",
        "Varshinipriya@gmail.com",
        "muralimathi@gmail.com",
        "7708324140"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Amazon.user_has_to_pass_the_valid_email_id_in_the_email_textbox_field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click continue button and navigate to the next page",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon.user_has_to_click_continue_button_and_navigate_to_the_next_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to pass the valid password in the password textbox field",
  "rows": [
    {
      "cells": [
        "murali@123",
        "mariyan@25",
        "varshini@35",
        "priya@34"
      ]
    },
    {
      "cells": [
        "12345@murali",
        "3@345#6$",
        "bjfjfh@746247",
        "jhfjas^\u0026^"
      ]
    },
    {
      "cells": [
        "fhfsfhsgui",
        "jhffywr387687",
        "^%^%hjhjh",
        "YGYG^\u0026*^\u0026"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Amazon.user_has_to_pass_the_valid_password_in_the_password_textbox_field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the submit button to sign in",
  "keyword": "Then "
});
formatter.match({
  "location": "Amazon.click_the_submit_button_to_sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});