package interview_Programs;

public class Spy_number {
	
	public static void main(String[] args) {
		
		int spyN=213;
		Spy_number spy=new Spy_number();
		
		int sum=spy.sum_of_digit(spyN);
		int product=spy.product_of_digit(spyN);
		
		if (sum==product) 
		{
			System.out.println("Given number is Spy Number");	
		}
		
		else
		{
			System.out.println("Given number is Spy Number");
		}
		
	}

	private int product_of_digit(int num) {
		// TODO Auto-generated method stub
		int sum=1;
		while(num>0)
		{
			int rem=num%10;
			sum=sum*rem;
			num=num/10;
		}
		return sum;
	}

	private int sum_of_digit(int num) {
		// TODO Auto-generated method stub
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
			
		}
		return sum;
	}

}
