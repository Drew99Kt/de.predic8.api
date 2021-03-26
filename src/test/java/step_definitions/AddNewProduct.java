package step_definitions;

import org.json.simple.JSONObject;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AddNewProduct {

	
	private Response response;
	private RequestSpecification request;
	
	@SuppressWarnings("unchecked")
	@Given("I post a new product called {string} for an exsisting vendor")
	public void i_post_a_new_product_called_for_an_exsisting_vendor(String pepsi) {
		
		RestAssured.baseURI = "https://api.predic8.de/shop";
		 request = RestAssured.given();
		JSONObject requestParams = new JSONObject();

		requestParams.put("name", "test"); // Cast
		requestParams.put("price", 2);
		requestParams.put("category_url", "/shop/categories/Drinks");
		requestParams.put("vendor_url", "/shop/vendors/812");
		request.header("Content-Type", "application/json");
		request.body(requestParams.toJSONString());

		 response = request.post("/products/");

		

	}

	@Then("I should get a {int} success Status code")
	public void i_should_get_a_success_Status_code(int expectedStatusCode) {
		
		// print for manual testing, can delete 
		System.out.println(response.getBody().prettyPeek());

		int actualStatusCode = response.getStatusCode();

		Assert.assertEquals(expectedStatusCode, actualStatusCode);

	}

	@Given("I do a put to update the name to {string} and price to {double} of the product")
	public void i_do_a_put_to_update_the_name_to_and_price_to_of_the_product(String name, Double price) {

	}

	@Given("I want to get the list of the product pepsi zero i just created")
	public void i_want_to_get_the_list_of_the_product_pepsi_zero_i_just_created() {

	}

	@Given("I want add a photo for the product pepsi zero")
	public void i_want_add_a_photo_for_the_product_pepsi_zero() {

	}

	@Given("I want to display the photo for pepsi zero")
	public void i_want_to_display_the_photo_for_pepsi_zero() {

	}

	@Given("I want to delete the product pepsi zero")
	public void i_want_to_delete_the_product_pepsi_zero() {

	}

	@Then("I should get a {int} success Status Code")
	public void i_should_get_a_success_Status_Code(Integer statusCode) {

	}

}
