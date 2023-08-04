package interview_Programs;

public class Password_validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String p="Arun@123";
		Password_validation pwd=new Password_validation();
		
		boolean result=pwd.Checking(p);
		
		if(result)
		{
			System.out.println("given password is valid");
		}
		else
		{
			System.out.println("given password is not valid");
		}
	}


	public Boolean Checking(String password)
	    {
	            boolean Valid = true;
	            if (password.length() > 15 || password.length() < 8)
	            {
	                    Valid = false;
	            }
	            String upperCaseChars = "(.*[A-Z].*)";
	            if (!password.matches(upperCaseChars ))
	            {
	                    Valid = false;
	            }
	            String lowerCaseChars = "(.*[a-z].*)";
	            if (!password.matches(lowerCaseChars ))
	            {
	                    Valid = false;
	            }
	            String numbers = "(.*[0-9].*)";
	            if (!password.matches(numbers ))
	            {
	                    Valid = false;
	            }
	            String specialChars = "(.*[@,#,$,%].*$)";
	            if (!password.matches(specialChars ))
	            {
	                    Valid = false;
	            }
				return Valid;
}
}
