package interview_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter First String : ");
		String s1=in.nextLine();
		
		System.out.println("Enter Second String : ");
		String s2=in.nextLine();
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if (s1.length()==s2.length())
		{
		
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			boolean resut=Arrays.equals(c1, c2);
			
			if (resut) 
			{
				System.out.println(s1+" "+s2+" "+" is anagram");
			}
			else
			{
				System.out.println(s1+" "+s2+" "+" is not anagram");
			}
			
			
		}
				
	}

}
