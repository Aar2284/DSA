// Check if a number is divisible by both 3 and 5.

import java.util.Scanner;

public class Q4DivisibleBy3And5
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter your number: ");
            int num = sc.nextInt();

            if(num % 3 == 0 && num % 5 == 0)
            {
                System.out.println("Number "+num+" is divisible by both 3 and 5");
            }

            else
            {
                System.out.println("Number "+num+" is not divisible by both 3 and 5");
            }
        }
    }
}