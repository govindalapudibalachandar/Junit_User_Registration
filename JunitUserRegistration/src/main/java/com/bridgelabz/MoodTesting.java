package com.bridgelabz;

public class MoodTesting {
	 @Test
	    public void happyTestCase() {
	        UserValidator validator = new UserValidator();
	        boolean resultFirstName = validator.validateFirstName("Asim");
	        Assertions.assertEquals(true, resultFirstName);

	        boolean resultLastName = validator.validateLastName("Ahammed");
	        Assert.assertEquals(true, resultLastName);

	        boolean resultEmail = validator.validateEmailAddress("asim@123.cvv");
	        Assert.assertEquals(true, resultEmail);

	        boolean resultPhoneNum = validator.validatePhoneNumber("91 9874563210");
	        Assert.assertEquals(true, resultPhoneNum);

	        boolean resultPassword = validator.validatePassword("Asim@007");
	        Assert.assertEquals(true, resultPassword);
	    }

	    @Test
	    public void sadTestCase() {
	        UserRegistration registration = new    UserRegistration();
	        boolean resultfirstname = registration.firstname("Asim");
	        Assert.assertEquals(true, resultFirstName);

	        boolean resultLastName = validator.validateLastName("Ahammed");
	        Assertions.assertEquals(true, resultLastName);

	        boolean resultEmail = validator.validateEmailAddress("asim@123.cvv");
	        Assertions.assertEquals(true, resultEmail);

	        boolean resultPhoneNum = validator.validatePhoneNumber("91 9874563210");
	        Assertions.assertEquals(true, resultPhoneNum);

	        boolean resultPassword = validator.validatePassword("asim@007");//missing a caps causing fail in test case
	        Assertions.assertEquals(true, resultPassword);
	    }
	} 
}
