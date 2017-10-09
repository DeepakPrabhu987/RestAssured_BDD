package com.testing.components;

import java.util.List;

import javax.validation.constraints.AssertTrue;

import org.junit.Assert;

import com.sun.jna.platform.win32.COM.TypeLibUtil.IsName;

import com.testing.steps.EndUserSteps;

import bin.BaseClass;
import bin.Hotel;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class TEST extends ScenarioSteps{


    /**
	 * 
	 */
    EndUserSteps endUser = new EndUserSteps();
    
  @Step
	public void mandatoryFieldCheck(Response response) 
	{
		
		

		BaseClass b = response.as(BaseClass.class, ObjectMapperType.GSON);

		List<Hotel> items = b.getHotels();

		for(Hotel hotel: items)
		{
			
			Assert.assertTrue("Paramter 'id' " , !hotel.getId().equals(null));
			Assert.assertTrue("Parameter 'hotelName'",!hotel.getHotelName().equals(null));
			Assert.assertTrue("Parameter 'location'",!hotel.getLocation().equals(null));
			Assert.assertTrue("Parameter 'landmark'",!hotel.getLandmark().equals(null));
			Assert.assertTrue("Parameter 'startedOn'",!hotel.getStartedOn().equals(null));
			Assert.assertTrue("Parameter 'getRatings'",!hotel.getRatings().equals(null));
			Assert.assertTrue("Parameter 'famous Dish'",!hotel.getFamousDish().equals(null));
	
		}	
		
	}
}
	

