package com.product.demo;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import io.restassured.http.ContentType;

@SpringBootTest
class ProductMicroserviceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void getAllClothing() throws Exception {
		
		         given()
		         .header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
		         .when()
		         .get("http://localhost:8002/getAllClothing")
		         .then()
		         .assertThat().statusCode(200)
		         .extract().response().asString();
		       

}

	@Test
	public void getAllfootwear() throws Exception {
		
		         given()
		         .header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
		         .when()
		         .get("http://localhost:8002/getAllfootwear")
		         .then()
		         .assertThat().statusCode(200)
		         .extract().response().asString();
		       

}

	@Test
	public void getAllelectronics() throws Exception {
		
		         given()
		         .header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
		         .when()
		         .get("http://localhost:8002/getAllelectronics")
		         .then()
		         .assertThat().statusCode(200)
		         .extract().response().asString();
		       

}

	@Test
	public void getAlljewellery() throws Exception {
		
		         given()
		         .header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
		         .when()
		         .get("http://localhost:8002/getAlljewellery")
		         .then()
		         .assertThat().statusCode(200)
		         .extract().response().asString();
		       

}

	@Test
	public void getproduct() throws Exception {
		
		         given()
		         .header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
		         .when()
		         .get("http://localhost:8002/getproduct")
		         .then()
		         .assertThat().statusCode(200)
		         .extract().response().asString();
		       

}
	
	
}
