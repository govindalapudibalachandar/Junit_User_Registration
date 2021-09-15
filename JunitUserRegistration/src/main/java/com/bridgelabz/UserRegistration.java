package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {

	// validate first name
    public boolean firstName( String firstname ) {
     
		   Pattern pattern=Pattern.compile("[A-Z][a-z]{3,}"); //delcaration of pattern
		   return pattern.matcher(firstname).matches();
    }
}
