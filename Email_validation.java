package interview_Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email_validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    String name2 ="12arun@yahoo.com";
	    Pattern p2 = Pattern.compile("^[a-z0-9]+@yahoo\\.com$");
	    Matcher m2 = p2.matcher(name2);
	    if (m2.matches()) {
	      System.out.println(name2);
	      System.out.println(" is valide Gmail number");
	    } else {
	      System.out.println(name2);
	      System.out.println(" is not valide Gmail number");
	    }
	}

}
