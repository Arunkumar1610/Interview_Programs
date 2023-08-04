package interview_Programs;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		System.out.println("Enter year : ");
		int year=in.nextInt();
		boolean leap=true;
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					leap=true;
				}
				else
				{
					leap=false;
				}
			}
			else
			{
				leap=false;
			}
		}
		else
		{
			leap=false;
		}
		
		if(leap)
		{
			System.out.println(year + " is a leap year.");
		}
		else
		{
			System.out.println(year + " is not a leap year.");
		}
	}

}
