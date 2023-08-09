package interview_Programs;


import java.util.Scanner;

public class NumberSequenceGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        
        while (testCases-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            
            generateSequence(a, b, n);
        }
        
        scanner.close();
    }
    
    private static void generateSequence(int a, int b, int n) {
        int result = a;
        for (int i = 0; i < n; i++) {
            result += b * (1 << i);
            System.out.print(result + " ");
        }
        System.out.println();
    }
}
