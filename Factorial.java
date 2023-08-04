package interview_Programs;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=1;
		
		
		int fact=10;
		
		int num=fact;
		
		while(num>=1)
		{
			sum=sum*num;
			num--;
		}
		
		System.out.println(fact+"! = "+sum);
	}

}
