package interview_Programs;

public class reverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=341;
		int rem=0;
		int reverse=0;
		
		while(num>0)
		{
			rem=num%10;
			
			reverse=(reverse*10)+rem;
			
			num=num/10;
		}
		System.out.print(reverse);
	}

}
