Feature: To test login functionality

	Scenario: login with valid set of inputs/testdata
	Given user navigates to demowebshop on Chrome browser
	When user clicks on Login link
	Then verify user naviagted to login page succesfully
	And user enter email id 
	And user enter password
	And clicks on Submit button
	Then validates login success  

