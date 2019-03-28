package com.kuntal.maven.maven_demo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
{   
	@Test
	public void givenANameWhenHelloThenReturnHelloName(){
		
		
	 App app = new App();
	 
	 String result = app.hello("kuntal");
	 
	 Assert.assertNotNull(result);
	 
	 Assert.assertEquals("Hellokuntal", result);
		
	}
	
	
	
}
