Feature:
As a user
I want to be able to Create an account
So that I can login to the application


@Smoke
Scenario: Create a new account flow
Given the user is on the home page of HR Block
When the user clicks on the Sign in button
Then the Sign in panel open on the right side block
When the user clicks on the Create Account button
Then the Create an account page open successfully 
When the user enters the email address
And the user enters the phone number 
And the use enters a user name
And the user click on the Next button
Then the user is navigated to the Create a Password page
When the user enters a password 
And the user enters the confirm password 
And the user selects the agree check box 
When the user clicks on Create Account button 
Then the account is created successfully  
