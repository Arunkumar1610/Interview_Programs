package interview_Programs;

public class string_contains_the_specified_sequence_of_char_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="This is exercise 1";
		String str2="This is exercise 1";
		
		boolean ok=true;
		
		if(str1.length()==str2.length())
		{
		
		for(int i=0; i<str1.length(); i++)
		{
			if(str1.charAt(i)==str2.charAt(i))
			{
				continue;
			}
			else
			{
				ok=false;
				break;
			}
		}
		
		if(ok)
		{
			System.out.println(ok+"! it is equal content");
		}else
		{
			System.out.println(ok+"! it isnot equal content");
		}
		}
		else
		{
			ok=false;
			System.out.println(ok+"! it is not equal length");
		}
		
//        String str1 = "PHP Exercises and Python Exercises";
//        String str2 = "an";
//        
//        boolean str3=str1.contains(str2);
//        
//        System.out.println(str3);
	}

}
