// Take a single digit (0–9) and print its word form (“Zero” to “Nine”)

import java.util.Scanner;

public class Q7DigitToWord
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a single digit (0-9): ");
            int digit = sc.nextInt();

            if(digit >= 0 && digit <= 9)
            {
                String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
                System.out.println("The word form of the digit is: " + words[digit]);
            }

            else
            {
                System.out.println("Invalid input. Please enter a single digit between 0 and 9.");
            }
        }
    }
}