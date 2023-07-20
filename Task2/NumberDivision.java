package Assgn1.Template.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter two numbers
            System.out.print("Enter two numbers: ");
            // Read the two numbers from the user
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            // Divide the first number by the second number
            int div = num1 / num2;
            // Display the result of the division
            System.out.println("The first number divided by the second number is: " + div);
        } catch (ArithmeticException e) {
            // Handle the ArithmeticException and display an error message
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            // Handle the InputMismatchException and display an error message
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
