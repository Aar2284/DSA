// Take income and age, and check if eligible for tax (age > 18 and income > 5 L)

import java.util.Scanner;

public class Q5TaxEligibility
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter your age: ");
            int age = sc.nextInt();

            System.out.println("Enter your income in lakhs: ");
            double income = sc.nextDouble();

            if(age > 18 && income > 5)
            {
                System.out.println("You are eligible to pay tax.");
            }

            else
            {
                System.out.println("You are not eligible to pay tax.");
            }
        }
    }
}