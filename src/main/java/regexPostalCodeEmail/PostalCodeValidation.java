package regexPostalCodeEmail;

import java.util.regex.Pattern;

public class PostalCodeValidation {
	

		public static void main(String[] args) {
	      
			System.out.println("Welcome to Java regex program");
			String postalPattern = "400088B"; // string to be validated
			String matcher = "[1-9]{1}[0-9]{5}$"; // regular expression to restrict character at end and begining
			System.out.println(Pattern.matches(matcher, postalPattern));//prints false
	}

}