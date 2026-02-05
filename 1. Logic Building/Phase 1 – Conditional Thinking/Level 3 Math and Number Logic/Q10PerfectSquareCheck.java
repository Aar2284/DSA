//  Check whether a number is a perfect square (without using the square root function)

import java.util.Scanner;

public class Q10PerfectSquareCheck
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the Number: ");
            int num = sc.nextInt();

            if(num >= 0)
            {
                int i = 0;
                boolean isPerfectSquare = false;

                while(i * i <= num)
                {
                    if(i * i == num)
                    {
                        isPerfectSquare = true;
                        break;
                    }
                    i++;
                }

                if(isPerfectSquare)
                {
                    System.out.println(num + " is a perfect square.");
                }

                else
                {
                    System.out.println(num + " is not a perfect square.");
                }
            }

            else
            {
                System.out.println("Invalid number entered. Please enter a non-negative number.");
            }
        }
    }
}