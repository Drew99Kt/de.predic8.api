@Functional
Feature: Verify new product can be added and deleted 


#write a scenario for creating an account on automation practice
#Given = pre-condition
#When = steps/actions to take 
#Then = expected result / what you're verifying 
#And = defined based on whatever Given, When, Then you put it after 
@Test1
Scenario: add new product with valid information
	Given I post a new product called "Pepsi" for an exsisting vendor
	Then I should get a 201 success Status code
	
Scenario: update pepsi to pepsi and change price
	Given I do a put to update the name to "Pepsi zero" and price to 1.50 of the product
	Then I should get a 201 success Status code
	
Scenario: list all the information about the product pepsi zero
	Given I want to get the list of the product pepsi zero i just created
	Then I should get a 200 success Status code
	
Scenario: add a photo to the product pepesi zero
	Given I want add a photo for the product pepsi zero
	Then I should get a 201 success Status code
	
Scenario: diplay the photo we just added to pepsi zero
	Given I want to display the photo for pepsi zero
	Then I should get a 200 success Status code
	
Scenario: delete our added product pepsi zero
	Given I want to delete the product pepsi zero
	Then I should get a 200 success Status Code

	