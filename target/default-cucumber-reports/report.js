$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/AddNewProduct.feature");
formatter.feature({
  "name": "Verify new product can be added, updated and deleted",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.scenario({
  "name": "add new product with valid information",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test"
    },
    {
      "name": "@Test1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I post a new product called \"Pepsi\" for an exsisting vendor",
  "keyword": "Given "
});
formatter.match({
  "location": "de.step_definitions.AddNewProduct.i_post_a_new_product_called_for_an_exsisting_vendor(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get a 201 success Status code",
  "keyword": "Then "
});
formatter.match({
  "location": "de.step_definitions.AddNewProduct.i_should_get_a_success_Status_code(int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "update pepsi to pepsiZero and change price",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test"
    },
    {
      "name": "@Test1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I do a put to update the name to \"Pepsi zero\" and price to 1.50 of the product",
  "keyword": "Given "
});
formatter.match({
  "location": "de.step_definitions.AddNewProduct.i_do_a_put_to_update_the_name_to_and_price_to_of_the_product(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get a 200 success Status code",
  "keyword": "Then "
});
formatter.match({
  "location": "de.step_definitions.AddNewProduct.i_should_get_a_success_Status_code(int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "list all the information about the product pepsi zero",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I want to get the list of the product pepsi zero i just created",
  "keyword": "Given "
});
formatter.match({
  "location": "de.step_definitions.AddNewProduct.i_want_to_get_the_list_of_the_product_pepsi_zero_i_just_created()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get a 200 success Status code",
  "keyword": "Then "
});
formatter.match({
  "location": "de.step_definitions.AddNewProduct.i_should_get_a_success_Status_code(int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "add a photo to the product pepesi zero",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I want add a photo for the product pepsi zero",
  "keyword": "Given "
});
formatter.match({
  "location": "de.step_definitions.AddNewProduct.i_want_add_a_photo_for_the_product_pepsi_zero()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get a 201 success Status code",
  "keyword": "Then "
});
formatter.match({
  "location": "de.step_definitions.AddNewProduct.i_should_get_a_success_Status_code(int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "diplay the photo we just added to pepsi zero",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I want to display the photo for pepsi zero",
  "keyword": "Given "
});
formatter.match({
  "location": "de.step_definitions.AddNewProduct.i_want_to_display_the_photo_for_pepsi_zero()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get a 200 success Status code",
  "keyword": "Then "
});
formatter.match({
  "location": "de.step_definitions.AddNewProduct.i_should_get_a_success_Status_code(int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "delete our added product pepsi zero",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I want to delete the product pepsi zero",
  "keyword": "Given "
});
formatter.match({
  "location": "de.step_definitions.AddNewProduct.i_want_to_delete_the_product_pepsi_zero()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get a 200 success Status Code",
  "keyword": "Then "
});
formatter.match({
  "location": "de.step_definitions.AddNewProduct.i_should_get_a_success_Status_Code(int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});