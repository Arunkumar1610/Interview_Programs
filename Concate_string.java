package interview_Programs;

public class Concate_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "I am become a ";
		String s2="Software developer";
		
		String s3=s1.concat(s2);
		
		String s4="";
		
		for(int i=s3.length()-1;i>=0; i--)
		{
			char c=s3.charAt(i);
			s4=s4+c;
		}
		
		System.out.println(s4);
		
		System.out.println(s3);
		
		System.out.println(s1+s2);

	}

}
