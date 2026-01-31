// Take three numbers and print the largest.

import java.util.Scanner;

public class Q7LargestOfThree
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter your 1st number: ");
            int num1 = sc.nextInt();

            System.out.println("Enter your 2nd number: ");
            int num2 = sc.nextInt();

            System.out.println("Enter your 3rd number: ");
            int num3 = sc.nextInt();

            if (num1 > num2 && num1 > num3)
            {
                System.out.println(num1 + "is the Largest Number");
            }

            else if(num2 > num1 && num2 > num3)
            {
                System.out.println(num2 + " is the Largest Number");
            }

            else
            {
                System.out.println(num3 + " is the Largest Number");
            }
        }
    }
}