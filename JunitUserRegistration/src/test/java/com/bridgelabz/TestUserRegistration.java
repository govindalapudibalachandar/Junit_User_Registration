package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistration {

	UserRegistration registration = new UserRegistration();
	@Test
	public  void FirstNameshouldreturnTrue() {
		boolean  result = registration.firstName("Govindalapudi" );
		Assert.assertEquals(true,result );
    }
	
	@Test
	public  void If_LastNames_Is_AllCases_hould_returnFalse() {
		boolean  result = registration.firstName("balachandar" );
		Assert.assertEquals(true,result );
}
	@Test
	public  void If_LastNames_Is_Startwith_UpperCase_Should_returnTrue() {
		boolean  result = registration.firstName("Balachandar" );
		Assert.assertEquals(true,result );
}
}