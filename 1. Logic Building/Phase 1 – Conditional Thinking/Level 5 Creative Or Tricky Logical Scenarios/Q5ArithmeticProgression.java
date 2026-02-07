// Take three numbers and check if they are in arithmetic progression. 

import java.util.Scanner;

public class Q5ArithmeticProgression
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

            if((num2 - num1) == (num3 - num2))
            {
                System.out.println("The numbers are in arithmetic progression.");
            }

            else
            {
                System.out.println("The numbers are not in arithmetic progression.");
            }
        }
    }
}