package com.testing.jbehave;

import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.testing.steps.EndUserSteps;
import com.testing.components.TEST;

import io.restassured.config.Config;




public class DefinitionSteps{

    @Steps
    EndUserSteps restTest;
	private String msgBody=null;



    @Given("I have a Base URI <baseURI> for the REST API")
    public void givenTheUserhasBaseURI(@Named("baseURI") String baseURI){
    	
    	restTest.SetBaseURI(baseURI);
    
    	
    	
    }

    @Given("its base path is <BASE_PATH>")
    public void givenThePathParameter(@Named("BASE_PATH") String path)
    {
    	
    
    	restTest.addBasePath(path);
    	
    	
    }
    
    @Given("its body message is <BODY>")
    public void givenTheMsgBody(@Named("BODY") String msgBody)
    {
    	this.msgBody= msgBody;
    	
    }

    
    @Then("all the mandatory fields should be returned in the response")
    public void verifyMandatoryFields()
    {
     
    	TEST test=new TEST();
    	
        test.mandatoryFieldCheck(restTest.Response);
    }
    
    
  
    @Given("its query parameter is <QUERY_PARAM>")
    public void givenTheQueryParameter(@Named("QUERY_PARAM") String path)
    {
    	
    	restTest.addQueryParam(path);    	
    	
    }

    @Given("its endpoint is <ENDPOINT>")
    public void giveTheEndPoint(@Named("ENDPOINT") String endpoint)
    {
    	
    	
    	restTest.addEndPoint(endpoint);
    }
    
    
    @When("I send the <REQUEST_TYPE> request to RestAPI")
    public void sendRequest(@Named("REQUEST_TYPE") String requestType)
    {
    	restTest.sendRequest(requestType,msgBody);
    }
    
    
    
    @Then("the REST API should return me a valid response")
    public void verifyRequest()
    {
    	
    	
    	restTest.ResponseCheck();
    }

    
    
    
    
    
    
    
    
    
    
    
    
}
