package de.utilities;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CommonMethods {
	private static Response response;
	private static RequestSpecification request;

	/**
	 * @param String x
	 * @return String x = response.getBody().asString(); use this to parse a
	 *         response body for the product url id this returns as a int.
	 * 
	 */
	public int getProductId(String x) {

		int productid;
		int getIndexOfProductUrl = x.indexOf("product_url");
		if (getIndexOfProductUrl == -1) {
			System.err.println("no product id was not found  " + getIndexOfProductUrl);

			return getIndexOfProductUrl;
		}
		getIndexOfProductUrl += 19;
		String ProductUrl = x.substring(getIndexOfProductUrl, x.length() - 1);
		ProductUrl = ProductUrl.replaceAll("[^0-9]", "");
		productid = Integer.parseInt(ProductUrl);
		System.out.println("product id= " + productid);

		return productid;
	}

	public int getValidVendorId() {

		RestAssured.baseURI = "https://api.predic8.de/shop";

		request = RestAssured.given();
		
		request.header("Content-Type", "application/json");
		response = request.get("/vendors/"  );
		
		String responseBody= response.getBody().asString();
		System.out.println(responseBody);
		
		
		
		
		int productid;
		int getIndexOfProductUrl = responseBody.indexOf("vendor_url");
		if (getIndexOfProductUrl == -1) {
			System.err.println("no vendor id was not found  " + getIndexOfProductUrl);

			return getIndexOfProductUrl;
		}
		
		String ProductUrl = responseBody.substring(getIndexOfProductUrl,  getIndexOfProductUrl+43);
		//test
				System.err.println(ProductUrl);
		
		ProductUrl = ProductUrl.replaceAll("[^0-9]", "");
		productid = Integer.parseInt(ProductUrl);
		System.out.println("vendor id= " + productid);
		
		
		
		
		return productid;
	}
		
		
	
}

