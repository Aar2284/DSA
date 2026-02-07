// Take a 3-digit number and check if the sum of the first and last digit equals the middle digit. 

import java.util.Scanner;

public class Q7DigitSumEqualsMiddle
{
    public static void main(String[] arg)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the number: ");
            int num = sc.nextInt();

            if(num >= 100 && num <= 999)
            {
                int firstDigit = num / 100;
                int middleDigit = (num / 10) % 10;
                int lastDigit = num % 10;

                if((firstDigit + lastDigit) == middleDigit)
                {
                    System.out.println("The sum of the first and last digit equals the middle digit.");
                }

                else
                {
                    System.out.println("The sum of the first and last digit does not equal the middle digit.");
                }
            }

            else
            {
                System.out.println("Please enter a valid 3-digit number.");
            }
        }
    }
}