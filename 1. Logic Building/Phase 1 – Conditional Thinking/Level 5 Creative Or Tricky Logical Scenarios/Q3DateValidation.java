// Take day and month and check if it forms a valid calendar date (ignoring leap years)

import java.util.Scanner;

public class Q3DateValidation
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the day: ");
            int day = sc.nextInt();

            System.out.println("Enter the month: ");
            int month = sc.nextInt();

            boolean isValidDate = false;

            if(month >= 1 && month <= 12)
            {
                if(month == 2)
                {
                    if(day >= 1 && day <= 28)
                    {
                        isValidDate = true;
                    }
                }

                else if(month == 4 || month == 6 || month == 9 || month == 11)
                {
                    if(day >= 1 && day <= 30)
                    {
                        isValidDate = true;
                    }
                }

                else
                {
                    if(day >= 1 && day <= 31)
                    {
                        isValidDate = true;
                    }
                }
            }

            if(isValidDate)
            {
                System.out.println("The date " + day + "/" + month + " is valid.");
            }
            
            else
            {
                System.out.println("The date " + day + "/" + month + " is invalid.");
            }
        }
    }
}