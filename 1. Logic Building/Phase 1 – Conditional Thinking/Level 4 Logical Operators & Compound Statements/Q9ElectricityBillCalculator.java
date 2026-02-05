// Take electricity units consumed and calculate the bill as per slabs (using if-else)

import java.util.Scanner;

public class Q9ElectricityBillCalculator
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the number of electricity units consumed: ");
            int units = sc.nextInt();
            double billAmount;

            if(units <= 100)
            {
                billAmount = units * 0.5;
            }

            else if(units <= 200)
            {
                billAmount = 100 * 0.5 + (units - 100) * 0.75;
            }

            else if(units <= 300)
            {
                billAmount = 100 * 0.5 + 100 * 0.75 + (units - 200) * 1.2;
            }

            else
            {
                billAmount = 100 * 0.5 + 100 * 0.75 + 100 * 1.2 + (units - 300) * 1.5;
            }

            System.out.println("Your electricity bill amount is: " + billAmount);
        }
    }
}