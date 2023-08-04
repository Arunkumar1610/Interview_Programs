package interview_Programs;

public class Count_of_digit {

	//private static int num;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String num_S="701078462";
  
  int a=Integer.parseInt(num_S);
  
  int num=a;
  
  System.out.println(num);
 
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
	}
	}

