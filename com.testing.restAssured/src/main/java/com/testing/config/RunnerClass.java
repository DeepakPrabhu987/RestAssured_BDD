package com.testing.config;
import java.util.Arrays;
import java.util.List;

import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.steps.CandidateSteps;
import org.junit.runner.RunWith;

import com.github.valfirst.jbehave.junit.monitoring.JUnitReportingRunner;
import com.testing.jbehave.DefinitionSteps;

import net.serenitybdd.jbehave.SerenityStories;


public class RunnerClass extends SerenityStories {
	 
		public void dsd()
		{
			findStoriesCalled("**/*.story");
			runSerenity().inASingleSession();
			
		}
	}	
	
	
	
	
	
	


