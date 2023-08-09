package interview_Programs;

import java.util.Scanner;

public class InputParsing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your input (e.g., 'Hi 5'): ");
        String input = scanner.nextLine();
        
        
        String[] parts = input.split("\\s+");
        if (parts.length == 2) {
            String myString = parts[0];
            int myInt = Integer.parseInt(parts[1]);
            
            System.out.println("myString is: " + myString);
            System.out.println("myInt is: " + myInt);
        } else {
            System.out.println("Invalid input format. Please enter a string followed by an integer.");
        }
        
        scanner.close();
    }
}
