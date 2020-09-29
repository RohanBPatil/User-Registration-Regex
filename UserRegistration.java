package UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static void main(String[] args) {
		UserRegistration patternMatcher = new UserRegistration();
		String firstName = "Rohan";
		System.out.println(firstName + "----->" + patternMatcher.validateName(firstName));
		String lastName = "Patil";
		System.out.println(lastName + "----->" + patternMatcher.validateName(lastName));
		String email = "abc.xyz@bl.co.ukkk";
		System.out.println(email + "----->" + patternMatcher.validateEmail(email));
		
	}
	
	
	private String validateName(String check) {
		String regex = "^([A-Z]{1}[A-Za-z]{2,})$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(check);
		if(matcher.find()) {
			return "valid";
		}
		return "invalid";
	}
	
	private String validateEmail(String check) {
		String regex = "^(abc[.][A-Za-z]+@bl[.]co[.][A-Za-z]{2,})$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(check);
		if(matcher.find()) {
			return "valid";
		}
		return "invalid";
	}
}
