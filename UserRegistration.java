package UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static void main(String[] args) {
		UserRegistration patternMatcher = new UserRegistration();
		String sample1 = "Rohan";
		System.out.println(sample1 + "----->" + patternMatcher.validateInput(sample1));
	}
	
	
	private String validateInput(String sample) {
		String regex = "^([A-Z]{1}[A-Za-z]{2,})$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(sample);
		if(matcher.find()) {
			return "valid";
		}
		return "invalid";
	}
}
