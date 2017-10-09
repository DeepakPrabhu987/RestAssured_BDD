package com.testing.steps;






import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import io.restassured.response.Response;
import junit.framework.Assert;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;



public class EndUserSteps extends ScenarioSteps{




	public  String QUERY_PARAM;
	public String myResponse;
	public String ENDPOINT;
	public Response  Response;

@Step
	public void SetBaseURI(String baseURI) {

		RestAssured.baseURI=baseURI;
		

	}


@Step
	public void addBasePath(String path) {

		RestAssured.basePath=path;

	}






@Step
	public void addQueryParam(String queryParam)

	{

		QUERY_PARAM = queryParam;

	}
@Step
	public void sendRequest(String requestType, String msgBody){
	
	System.out.println(ENDPOINT);

	
	switch(requestType)
	
	{
	case "GET": Response=RestAssured.given().contentType(ContentType.JSON).get(ENDPOINT);
	break;
	case "POST":Response= RestAssured.given().contentType(ContentType.JSON).body(msgBody).when().post(ENDPOINT);
	break;

	}
	

	 myResponse = Response.asString();

	}  

@SuppressWarnings("deprecation")
@Step

	public void  ResponseCheck()
	{
	
	    Assert.assertTrue("Response Status Code Check", Response.statusCode()==200);
	    
		
		
	}





	public void addEndPoint(String endpoint) {
		
		
		 this.ENDPOINT=endpoint;
		
	}



}


