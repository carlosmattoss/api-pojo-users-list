package usersApiTest;

import org.testng.annotations.Test;

import apiConfigs.APIPath;
import apiConfigs.HeaderConfigs;
import baseTest.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import pojo.GetAPIPojo;
import pojo.PostAPIPojo;

public class SerTest extends BaseTest{

	@Test
	public void postTest() {
		HeaderConfigs head = new HeaderConfigs();
		PostAPIPojo pojo = new PostAPIPojo(287, "sertest", "caseSensitive");
		
		System.out.println(pojo.toString());

		Response response = RestAssured.given().when().headers(head.defaultHeaders()).body(pojo)
				.post(APIPath.apiPath.CREATE_POST);
		
		System.out.println(response.getBody().asString());
		
		System.out.println(pojo.getAuther());
		System.out.println(pojo.getId());
		System.out.println(pojo.getTitle());
	}
	
	@Test
	public void getTest() {
		HeaderConfigs head = new HeaderConfigs();
		GetAPIPojo pojo = new GetAPIPojo();
		
		System.out.println(pojo.toString());

		Response response = RestAssured.given().when().headers(head.defaultHeaders()).body(pojo)
				.get(APIPath.apiPath.GET_SINGLE_POST);
		
		System.out.println(response.getBody().asString());
		
		System.out.println(pojo.getPage());
		System.out.println(pojo.getPer_page());
		System.out.println(pojo.getTotal());
		System.out.println(pojo.getTotal_pages());
		System.out.println(pojo.getData());
		System.out.println(pojo.getAd());
	}
}
