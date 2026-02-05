// Take a number and print “Fizz” if divisible by 3, “Buzz” if divisible by 5, and “FizzBuzz” if divisible by both.

import java.util.Scanner;

public class Q2FizzBuzz
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the Number: ");
            int num = sc.nextInt();

            if(num % 3 == 0 && num % 5 == 0)
            {
                System.out.println("FizzBuzz");
            }

            else if(num % 3 == 0)
            {
                System.out.println("Fizz");
            }

            else if(num % 5 == 0)
            {
                System.out.println("Buzz");
            }

            else
            {
                System.out.println(num + " is not divisible by either 3 or 5.");
            }
        }
    }
}