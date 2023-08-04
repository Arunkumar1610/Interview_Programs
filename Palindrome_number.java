package interview_Programs;

public class Palindrome_number {

	private int check(int num) {
		// TODO Auto-generated method stub
		
		int rem=0;
		int sum=0;
		
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Palindrome_number pn=new Palindrome_number();
		int num=1221;
		
		int sum=pn.check(num);
		
		if (num==sum)
		{
			System.out.println(num+" It is panlidrome");
		}
		else
		{
			System.out.println(num+" It is not a panlindrome");
		}
	}

}
