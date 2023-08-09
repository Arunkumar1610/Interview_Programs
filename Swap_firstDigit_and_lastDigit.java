package interview_Programs;

import java.util.Scanner;

public class Swap_firstDigit_and_lastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
//		int firstDigit=0 ,lastDigit=0;
//		
		System.out.println("enter the number :");
//		int number=in.nextInt();
//		
//		lastDigit=number%10;
//		
//		int power= (int)Math.log10(number);
//		
//		//System.out.println(power);
//		
//		firstDigit=(int) (number/Math.pow(10, power));
//		
//		//System.out.println(firstDigit);
//		
//		
//		int a=firstDigit*(int)Math.pow(10, power);
//		//System.out.println(a);
//		int b=number%a;
//		
//		number=b/10;
//		
//		number=(lastDigit*(int)Math.pow(10, power))+number*10+firstDigit;
//		
//		System.out.println("The Result: "+number);
		
		
		int num = in.nextInt();
		 String numStr = Integer.toString(num);
	        
	        if (numStr.length() <= 1) {
	             System.out.println(num);
	        }
	        
	        char[] numArray = numStr.toCharArray();
	        char firstDigit = numArray[0];
	        char lastDigit = numArray[numArray.length - 1];
	        
	        numArray[0] = lastDigit;
	        numArray[numArray.length - 1] = firstDigit;
	        
	        int SwappedNum=Integer.parseInt(new String(numArray));
	        
	        System.out.println("Number after swapping first and last digits: " + SwappedNum);
		
	}

}
