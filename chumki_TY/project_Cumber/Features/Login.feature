Feature: Login

Scenario: successful Login with Valid Credentials
	Given User Launch Chrome browser
	When User opens URL "http://admin-demo.nopCommerce.com/login"
	And User enters Email as "admin@yourstote.com" and Password as "admin"
	And Click on Login
	Then Page Title should be "Dashboard / nopCommerce administration"
	When User click on Log out link
	Then Page title should be "Your store. Login"
	And close browser