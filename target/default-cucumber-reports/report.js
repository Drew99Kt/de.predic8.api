$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/AddNewProduct.feature");
formatter.feature({
  "name": "Verify new product can be added and deleted",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Functional"
    }
  ]
});
formatter.scenario({
  "name": "add new product with valid information",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Functional"
    },
    {
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "name": "I post a new product called \"Pepsi\" for an exsisting vendor",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.AddNewProduct.i_post_a_new_product_called_for_an_exsisting_vendor(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get a 201 success Status code",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.AddNewProduct.i_should_get_a_success_Status_code(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "update pepsi to pepsiZero and change price",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Functional"
    },
    {
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "name": "I do a put to update the name to \"Pepsi zero\" and price to 1.50 of the product",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.AddNewProduct.i_do_a_put_to_update_the_name_to_and_price_to_of_the_product(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get a 200 success Status code",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.AddNewProduct.i_should_get_a_success_Status_code(int)"
});
formatter.result({
  "status": "passed"
});
});