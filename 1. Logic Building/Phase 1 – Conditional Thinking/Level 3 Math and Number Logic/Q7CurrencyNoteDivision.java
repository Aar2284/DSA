// Check if an amount can be evenly divided into 2000, 500, and 100 currency notes

import java.util.Scanner;

public class Q7CurrencyNoteDivision
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the Amount: ");
            int amount = sc.nextInt();

            if(amount >= 0)
            {
                if(amount % 2000 == 0 && amount % 500 == 0 && amount % 100 == 0)
                {
                    System.out.println("The amount can be evenly divided into 2000, 500, and 100 currency notes.");
                }

                else
                {
                    System.out.println("The amount cannot be evenly divided into 2000, 500, and 100 currency notes.");
                }
            }

            else
            {
                System.out.println("Invalid amount entered. Please enter a non-negative amount.");
            }
        }
    }
}