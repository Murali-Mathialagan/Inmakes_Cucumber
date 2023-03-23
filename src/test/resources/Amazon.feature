Feature: To validate the signin functionality of the amazon application

Background:
Given To open the chrome browser and maximize the window to automate amazon sign in page

@Amazon
Scenario: To validate signin page with valid username and invalid password
When To launch the amazon url of the application
And user has to move the cursor to the Accounts and lists element
And user has to click the signin button and navigate to the sign in page

#without header one dimensional
And user has to pass the valid email id in the email textbox field
|muralimariyan8@gmail.com|Varshinipriya@gmail.com|muralimathi@gmail.com|7708324140|

And user has to click continue button and navigate to the next page

#without header two dimensional
And user has to pass the valid password in the password textbox field
|murali@123|mariyan@25|varshini@35|priya@34|
|12345@murali|3@345#6$|bjfjfh@746247|jhfjas^&^|
|fhfsfhsgui|jhffywr387687|^%^%hjhjh|YGYG^&*^&|

Then click the submit button to sign in



