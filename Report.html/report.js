$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/IciciBank.feature");
formatter.feature({
  "name": "To validate the log in functionality of the ICICI Bank web Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate the log in page with valid userid and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Bank"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to pass the url of the ICICI bank",
  "keyword": "When "
});
formatter.match({
  "location": "IciciBank.user_has_to_pass_the_url_of_the_ICICI_bank()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to pass the valid data in the user id textbox",
  "keyword": "And "
});
formatter.match({
  "location": "IciciBank.user_has_to_pass_the_valid_data_in_the_user_id_textbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the arrow button",
  "keyword": "And "
});
formatter.match({
  "location": "IciciBank.user_has_to_click_the_arrow_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to pass the valid data in the password textbox",
  "keyword": "And "
});
formatter.match({
  "location": "IciciBank.user_has_to_pass_the_valid_data_in_the_password_textbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the log in button and print the message",
  "keyword": "And "
});
formatter.match({
  "location": "IciciBank.user_has_to_click_the_log_in_button_and_print_the_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to check the credentials are valid or not",
  "keyword": "Then "
});
formatter.match({
  "location": "IciciBank.user_has_to_check_the_credentials_are_valid_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});