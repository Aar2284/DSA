// Take a weekday number (1–7) and determine if it is a weekday or weekend. 

import java.util.Scanner;

public class Q8WeekdayOrWeekend
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a weekday number (1-7): ");
            int day = sc.nextInt();

            if(day >= 1 && day <= 5)
            {
                System.out.println("It's a weekday.");
            }

            else if(day == 6 || day == 7)
            {
                System.out.println("It's a weekend.");
            }

            else
            {
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
            }
        }
    }
}