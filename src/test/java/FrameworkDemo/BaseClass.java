package FrameworkDemo;

import static io.restassured.RestAssured.given;


import org.testng.annotations.BeforeClass;

import FrameworkDemo.pojos.ShopperLoginPojo;
import dataUtils.ReadDataFromPropertiesFile;
import io.restassured.response.Response;

public class BaseClass extends ReadDataFromPropertiesFile{
	public static String accessToken;
	public static int shopperId;
	public static int productId;
	public static int itemId;
	public static int quantity;
	public static int addressId;
	public static int orderId;
	
	@BeforeClass
	public void login()
	{
		ShopperLoginPojo body = new ShopperLoginPojo(email, password , role);
		
		Response res = given()
				.log().all()
				.contentType("application/json")
				.relaxedHTTPSValidation() //allows to access the server
				.body(body)
				.baseUri(baseUrl)
				.when()
				.post("/users/login");
			
		res.then()
			.assertThat().statusCode(200)
			.log().all();
		
		accessToken = res.path("data.jwtToken"); 
		shopperId = res.jsonPath().getInt("data.userId");
	}
}
