Feature: To validate the log in functionality of the ICICI Bank web Application

@Bank
Scenario: To validate the log in page with valid userid and password
When user has to pass the url of the ICICI bank
And user has to pass the valid data in the user id textbox
And user has to click the arrow button
And user has to pass the valid data in the password textbox
And user has to click the log in button and print the message
Then user has to check the credentials are valid or not
