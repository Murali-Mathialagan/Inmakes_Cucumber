Feature: To validate the log in functionality of the facebook web application

Background:
Given user has to launch the chrome browser 

@Fb
Scenario:  To validate the log in page with valid username and password
When user has to launch the facebook url to log in
And user has to pass the username in the email or phone textbox field
And user has to pass the password in the password textbox field
And user has to click the log in button
And to check whether the page navigate to next page or not
Then user has to close the entire browser





