package interview_Programs;

import java.util.Iterator;

public class find_large_value 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//Given a unsorted array to find CONTINUES 	PAIR largeset 
		//sum value
		
		int[] a= {0,5,6,0,9,0,1,4};
		
		int temp=0;
		int big=0;
		
		for(int i=0; i<a.length-1;i++)
		{
			 temp=a[i]+a[i+1];
			 if (big<temp) 
			 {
				big=temp;
			}
		}
			System.out.println(big);
  }
}