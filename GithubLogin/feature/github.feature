@execute
Feature: Github Login Functionality Check

	Scenario: User is trying to sign in in Github using valid username and password
		
		Given User is on GitHubLoginPage
		When user enter Invalid username and passwords
		Then Incorrect 'username or password' Message should display
	
	Scenario: User is trying to sign in in Github using Invalid username and password
		Given User is on GitHubLoginPage
		When user enter valid username and password
		Then user should successfully sign in on his github page