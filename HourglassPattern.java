package interview_Programs;

import java.util.Scanner;

public class HourglassPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the hourglass pattern: ");
        int height = scanner.nextInt();

        // Print the top half of the hourglass pattern
        for (int i = 1; i <= height; i++) {
            // Print spaces before the first half
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // Print asterisks for the first half
            for (int k = 0; k < 2 * (height - i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print the bottom half of the hourglass pattern
        for (int i = height - 1; i >= 1; i--) {
            // Print spaces before the second half
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // Print asterisks for the second half
            for (int k = 0; k < 2 * (height - i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

