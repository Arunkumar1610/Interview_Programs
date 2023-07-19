package interview_Programs;

//---------Finding Armstrong Number---------//


public class Armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int armN=1634;
		Armstrong_number arm=new Armstrong_number();
		
		int count=arm.find_count(armN);
		int sum=arm.split(armN,count);
		
		if (armN==sum)
		{
			System.out.println(armN+" is Armstrong number!");
		}
		else
		{
			System.out.println(armN+" is Not Armstrong number!");
		}
	}

	private int split(int num, int count) {
		// TODO Auto-generated method stub
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			int result=find_power(rem,count);
		    sum=sum+result;
			num=num/10;
		}
		return sum;
		
		
	}

	private int find_count(int num) {
		// TODO Auto-generated method stub
		
		int count=0;
		
		while (num>0)
		{
			num=num/10;
			count++;
		}
		
		return count;
	}
	
    int find_power(int base, int power)
    {
        int box = 1;
        while(power>0)
        {
            box = box * base;
            power = power - 1;
        }
        return box;
    }

}
