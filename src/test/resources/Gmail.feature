Feature: To validate the sign in functionality of the gmail

@Gmail
Scenario Outline: To validate the sign in page
Given user has to launch the chrome browser and maximize the window
When user has to launch the gmail url
And user has to click the sign in button and navigate to sign in page
And user has to pass the valid "<username>" username or phone in the email or phone textbox field
And user has to click the next button and navigate to the next page
And user has to pass the "<password>" in the enter your password textbox field
Then user has to close the browser

Examples:
|username									|password			|
|muralimariyan8@gmail.com	|Murali@12345	|
|muralimari@gmail.com			|12345				|
|7708324140								|1#@%46				|
|7695990215								|Mariyan@25		|