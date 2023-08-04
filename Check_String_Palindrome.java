package interview_Programs;

public class Check_String_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Madam";

String s1="";

for(int i=s.length()-1;i>=0;i--)
{
	s1=s1+s.charAt(i);
}

if(s.equals(s1))
{
	System.out.println("true");
}
else
{
	System.out.println("false");
}
	}

}
