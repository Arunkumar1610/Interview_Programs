package interview_Programs;

import java.util.Arrays;

public class Split_the_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Arunkumar became a software engineer at Accenture Solutions Private Limited Chennai (India)";
		str=str.toLowerCase();
		String[] arrStr=str.split(" ");
		//System.out.println(arrStr.length);
		int count=0;
		int temp=0;
		String a="";
		for(String s : arrStr)
		{
			for(int i=0;i<s.length(); i++)
			{
				if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
				{
					count++;
				}
			
			}
			if(temp<=count)
			{
				a=s;
				temp=count;
			}
			count=0;
		}
		
		System.out.println(a+" have "+temp+" Vowels");
	}

}
