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
    //validate Mobile number 
    public boolean Mobilenumber(String Mobilenumber) {
    	Pattern pattern=Pattern.compile("^[0-9]{2}+[\\s][0-9]{10}$"); //delcaration of pattern
		   return pattern.matcher(Mobilenumber).matches();
    }
    //validate password with one Special Character
		   
		   public boolean atleastone_special_characterpassword (String atleastone_special_characterpassword) {
		    	Pattern pattern=Pattern.compile("^(?=.[A-Za-z0-9])(?=.*[0-9])(?=.*[A-Z]).{8,}$"); //delcaration of pattern
				   return pattern.matcher(atleastone_special_characterpassword).matches();
}
		
		   //validate for happy  case
	//	   public boolean user_enter(String user_enter) {
			   
		//	Pattern pattern = Pattern.compile("[A-Z][a-z]{3,}",);
			//   return pattern.matcher(happy_firstname).matches();
}
		   
