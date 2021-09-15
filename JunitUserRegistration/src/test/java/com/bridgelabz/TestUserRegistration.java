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
	public  void If_LastNames_Is_notproper_should_returnfalse() {
		boolean  result = registration.Lastname("bal");
		Assert.assertFalse(result); 
}
	@Test
	public  void If_LastNames_Is_Startwith_UpperCase_Should_returnTrue() {
		boolean  result = registration.Lastname("Balachandar");
		Assert.assertEquals(true,result );
}

	@Test
	public  void  If_Email_Id_Isnotproper_should_returnfalse() {
		UserRegistration registration = new UserRegistration();
		boolean  result = registration.Email_Id("bal.@gmail.com");
		Assert.assertFalse(result);
}
		@Test
	public  void If_Email_Id_Should_returnTrue() {
		UserRegistration registration = new UserRegistration();
		boolean  result = registration.Email_Id("Bala123@gmail.com");
		Assert.assertTrue(result );
}
}