package interview_Programs;

public class AmstrongNumber_1_1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=1000; i++)
		{
			int rem=0;
			int sum=0;
		int a=i;
			while(a>0)
			{
				rem=a%10;
				sum=(rem*rem*rem)+sum;
				a=a/10;
			}
			
			if(i==sum)
			{
				System.out.println(sum);
			}
		}

	}

}
