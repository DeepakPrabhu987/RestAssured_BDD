package com.testing.jbehave;

import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.testing.config.RestAssuredEngine;
import com.testing.steps.EndUserSteps;

import io.restassured.config.Config;




public class DefinitionSteps{

    @Steps
    RestAssuredEngine restTest;


 

    @Given("I have a Base URI <baseURI> for the REST API")
    public void givenTheUserhasBaseURI(@Named("baseURI") String baseURI){
    	
    	restTest.SetBaseURI(baseURI);
    
    	
    	
    }

    @Given("its base path is <BASE_PATH>")
    public void givenThePathParameter(String path)
    {
    	
    	restTest.addBasePath(path);
    	
    	
    }
    
    
  
    @Given("its query parameter is <QUERY_PARAM>")
    public void givenTheQueryParameter(String path)
    {
    	
    	restTest.addQueryParam(path);    	
    	
    }

    @When("I send the request to RestAPI")
    public void sendRequest()
    {
    	restTest.sendRequest();
    }
    
    
    
    @Then("the REST API should return me a valid response")
    public void verifyRequest()
    {
    	System.out.println(restTest.getResponse());
    }

    
    
    
    
    
    
    
    
    
    
    
    
}
