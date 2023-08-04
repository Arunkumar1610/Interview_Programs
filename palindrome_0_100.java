package interview_Programs;

public class palindrome_0_100 {
public static void main(String[] args) {
	
	for(int n=0; n<=1000; n++)
	{
		int a=n;
		int rem=0;
		int sum=0;
		while(a>0)
		{
			rem=a%10;
			sum=(sum*10)+rem;
			a=a/10;
		}
		if(n==sum)
		{
			System.out.println(sum);
		}
	}
}
}
