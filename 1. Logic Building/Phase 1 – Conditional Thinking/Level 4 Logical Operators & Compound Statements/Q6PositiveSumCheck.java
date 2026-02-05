//  Take two numbers and check if both are positive and their sum is less than 100

import java.util.Scanner;

public class Q6PositiveSumCheck
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the first number: ");
            int num1 = sc.nextInt();

            System.out.println("Enter the second number: ");
            int num2 = sc.nextInt();

            if(num1 > 0 && num2 > 0 && (num1 + num2) < 100)
            {
                System.out.println("Both numbers are positive and their sum is less than 100.");
            }

            else
            {
                System.out.println("Either one or both numbers are not positive, or their sum is not less than 100.");
            }
        }
    }
}