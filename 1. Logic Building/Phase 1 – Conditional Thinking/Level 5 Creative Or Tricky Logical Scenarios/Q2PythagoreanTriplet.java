// Take three numbers and check if they can form a Pythagorean triplet

import java.util.Scanner;

public class Q2PythagoreanTriplet
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the first number: ");
            int num1 = sc.nextInt();

            System.out.println("Enter the second number: ");
            int num2 = sc.nextInt();

            System.out.println("Enter the third number: ");
            int num3 = sc.nextInt();

            if((num1 * num1) + (num2 * num2) == (num3 * num3) ||
               (num1 * num1) + (num3 * num3) == (num2 * num2) ||
               (num2 * num2) + (num3 * num3) == (num1 * num1))
            {
                System.out.println("The numbers can form a Pythagorean triplet.");
            }

            else
            {
                System.out.println("The numbers cannot form a Pythagorean triplet.");
            }
        }
    }
}