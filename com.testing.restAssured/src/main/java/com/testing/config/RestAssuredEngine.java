package com.testing.config;




import org.jbehave.core.steps.Steps;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.model.Stories;
import net.thucydides.core.steps.ScenarioSteps;



public class RestAssuredEngine extends ScenarioSteps{


	public  String QUERY_PARAM;
	public String myResponse;

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
	public void sendRequest(){

		Response  response = getResponseType().get(QUERY_PARAM);
		myResponse = response.asString();

	}  

@Step
	public String  getResponse()
	{
		return myResponse;
	}


	public RequestSpecification getResponseType(){


		return RestAssured.given().contentType(ContentType.JSON);

	}



}


