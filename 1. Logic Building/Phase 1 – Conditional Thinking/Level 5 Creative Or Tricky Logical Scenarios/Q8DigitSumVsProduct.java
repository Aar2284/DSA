//  Take an integer (1–9999) and check if the sum of its digits is greater than the product of its digits. 

import java.util.Scanner;

public class Q8DigitSumVsProduct
{
    public static void main(String[] arg)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int num = sc.nextInt();

            if (num >= 1 && num <= 9999)
            {
                int firstDigit = num / 1000;
                int secondDigit = (num / 100) % 10;
                int thirdDigit = (num / 10) % 10;
                int fourthDigit = num % 10;

                int sum = firstDigit + secondDigit + thirdDigit + fourthDigit;
                int product = firstDigit * secondDigit * thirdDigit * fourthDigit;

                if (sum > product)
                {
                    System.out.println(sum+ "(Sum) is greater than " +product+ "(Product)");
                }

                else if (product > sum)
                {
                    System.out.println(product+ "(Product) is greater than " +sum+ "(Sum)");
                }

                else
                {
                    System.out.println("The sum and product of the digits are equal.");
                }
            }
        }
    }
}