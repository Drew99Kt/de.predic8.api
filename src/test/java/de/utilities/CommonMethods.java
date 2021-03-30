package de.utilities;

public class CommonMethods {

	
	/**
	 * @param String x
	 * @return
	 * String x = response.getBody().asString();
	 * use this to parse a response body for the product url id
	 * this returns as a int.
	 * 
	 */
	public int getProductId(String x) {
		
		int productid;
		int getIndexOfProductUrl = x.indexOf("product_url");
		if (getIndexOfProductUrl== -1) {
			System.err.println("no product id was not found  "+getIndexOfProductUrl);
			
			return getIndexOfProductUrl;
		}
		getIndexOfProductUrl+=19;
		String ProductUrl = x.substring(getIndexOfProductUrl, x.length() - 1);
		ProductUrl = ProductUrl.replaceAll("[^0-9]", "");
		productid = Integer.parseInt(ProductUrl);
		System.out.println("product id= " + productid);
	
		
		
		return productid;
	}
	
	
	
	
}
