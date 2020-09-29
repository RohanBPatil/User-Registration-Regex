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
		String phone = "91 3265986532";
		System.out.println(phone + "----->" + patternMatcher.validatePhone(phone));
		String password = "rohanPatil8#";
		System.out.println(password + "----->" + patternMatcher.validatePassword(password));
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
	
	private String validatePhone(String check) {
		String regex = "^([0-9]{1,4}[ ][0-9]{10})$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(check);
		if(matcher.find()) {
			return "valid";
		}
		return "invalid";
	}
	
	private String validatePassword(String check) {
		String regex = "^((?=.*[A-Z]+)(?=.*[0-9]+)([A-Za-z0-9@#$%^&*]{8,}))$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(check);
		if(matcher.find()) {
			return "valid";
		}
		return "invalid";
	}
}
