package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {

	// validate first name
    public boolean firstName( String firstname ) {
     
		   Pattern pattern=Pattern.compile("[A-Z][a-z]{3,}"); //delcaration of pattern
		   return pattern.matcher(firstname).matches();
    }
//validate Last name
    public boolean Lastname(String Lastname) {
    	Pattern pattern=Pattern.compile("[A-Z][a-z]{3,}"); //delcaration of pattern
		   return pattern.matcher(Lastname).matches();
    }
    //validate Email id
    public boolean Email_Id(String Email_Id) {
    	Pattern pattern=Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{3,})$"); //delcaration of pattern
		   return pattern.matcher(Email_Id).matches();
    }
}
