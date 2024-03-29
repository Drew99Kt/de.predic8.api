package de.step_definitions;

import java.io.File;

import org.json.simple.JSONObject;
import org.junit.Assert;

import de.utilities.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;

import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;

public class AddNewProduct {

	private static Response response;
	private static RequestSpecification request;
	public static int pepsiProductid;
	CommonMethods com = new CommonMethods();

	@SuppressWarnings("unchecked")
	@Given("I post a new product called {string} for an exsisting vendor")
	public void i_post_a_new_product_called_for_an_exsisting_vendor(String pepsi) {
//
		RestAssured.baseURI = "https://api.predic8.de/shop";

		request = RestAssured.given();

		JSONObject requestParams = new JSONObject();

		int vendorId=com.getValidVendorId();
		
		// this is the json body we are sending, we could use java faker for these
		// better testing using random values
		requestParams.put("name", pepsi); // Cast
		requestParams.put("price", 2);
		requestParams.put("category_url", "/shop/categories/Drinks");
		requestParams.put("vendor_url", "/shop/vendors/"+vendorId);
		request.header("Content-Type", "application/json");
		request.body(requestParams.toJSONString());

		// here we do a post api comand to products to add the above json body
		response = request.post("/products/");

		// getting product_url then converting the data type to int. (this will be
		// used for a later test)
		String x = response.getBody().asString();
		System.out.println(x);
		pepsiProductid = com.getProductId(x);

	}

	@Then("I should get a {int} success Status code")
	public void i_should_get_a_success_Status_code(int expectedStatusCode) {
		// checking if the status code is correct from the feature file
		int actualStatusCode = response.getStatusCode();
		Assert.assertEquals(expectedStatusCode, actualStatusCode);

	}

	@SuppressWarnings("unchecked")
	@Given("I do a put to update the name to {string} and price to {double} of the product")
	public void i_do_a_put_to_update_the_name_to_and_price_to_of_the_product(String pepsiZero, double price) {

		RestAssured.baseURI = "https://api.predic8.de/shop";
		request = RestAssured.given();

		// this is the json body we are using to do a update/put to the product we just
		// created.
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", pepsiZero); // Cast
		requestParams.put("price", price);
		request.header("Content-Type", "application/json");
		request.body(requestParams.toJSONString());

		response = request.patch("/products/" + pepsiProductid);

	}

	@Given("I want to get the list of the product pepsi zero i just created")
	public void i_want_to_get_the_list_of_the_product_pepsi_zero_i_just_created() {

		// printing out information about our product.
		RestAssured.baseURI = "https://api.predic8.de/shop";
		request = RestAssured.given();
		request.header("Content-Type", "application/json");
		response = request.get("/products/" + pepsiProductid);

		System.out.println(response.getBody().prettyPeek());

	}

	@Given("I want add a photo for the product pepsi zero")
	public void i_want_add_a_photo_for_the_product_pepsi_zero() {
		// getting file from out project folder then uploading it
		File file = new File("pepsiZero.jpg");
		RestAssured.baseURI = "https://api.predic8.de/shop";
		request = RestAssured.given();
		request.multiPart("file", file, "multipat/form-data");
		response = request.put("/products/" + pepsiProductid + "/photo");

	}

	@Given("I want to display the photo for pepsi zero")
	public void i_want_to_display_the_photo_for_pepsi_zero() {

		/*
		 * Couldn't find a way to display picture. you could open selenium and display
		 * image on a browser if you wanted to. doing a get request will see if
		 * the picture exist, and return 200 response
		 */

		RestAssured.baseURI = "https://api.predic8.de/shop";
		request = RestAssured.given();
		request.header("Content-Type", "application/json");
		response = request.get("/products/" + pepsiProductid + "/photo");

	}

	@Given("I want to delete the product pepsi zero")
	public void i_want_to_delete_the_product_pepsi_zero() {

		RestAssured.baseURI = "https://api.predic8.de/shop";
		request = RestAssured.given();
		request.header("Content-Type", "application/json");
		response = request.delete("/products/" + pepsiProductid);
		System.out.println(response.getBody().prettyPrint());

	}

	@Then("I should get a {int} success Status Code")
	public void i_should_get_a_success_Status_Code(int expectedStatusCode) {
		// Checking to see if we get the correct response for our request
		int actualStatusCode = response.getStatusCode();
		Assert.assertEquals(expectedStatusCode, actualStatusCode);
	}

}
