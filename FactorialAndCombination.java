package interview_Programs;


import java.util.Scanner;

public class FactorialAndCombination 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of r: ");
        int r = scanner.nextInt();

        
        long factorialN = calculateFactorial(n);
        long combination = calculateCombination(n, r);

        System.out.println(n + "! = " + factorialN);
        System.out.println("C(" + n + ", " + r + ") = " + combination);
    }

    public static int calculateFactorial(int n) 
    {
    	int sum=1;
    	
    	while(n>0)
    	{
    		sum=sum*n;
    		n--;	
    	}
    	return sum;
    }

    public static int calculateCombination(int n, int r) 
    {
    	int comb=(calculateFactorial(n) / (calculateFactorial(r) * calculateFactorial(n - r)));
        return comb;
    }
}
