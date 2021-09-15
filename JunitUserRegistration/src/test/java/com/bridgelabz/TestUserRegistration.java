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
}
