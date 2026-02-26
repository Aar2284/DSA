// Take two dates (day and month) and determine which one comes first in the calendar.

import java.util.Scanner;

public class Q9DateComparison
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the first date (day and month): ");
            int day1 = sc.nextInt();
            int month1 = sc.nextInt();

            System.out.println("Enter the second date (day and month): ");
            int day2 = sc.nextInt();
            int month2 = sc.nextInt();

            if(month1 < month2 || (month1 == month2 && day1 < day2))
            {
                System.out.println("The first date " + day1 + "/" + month1 + " comes before the second date " + day2 + "/" + month2 + ".");
            }

            else if(month1 > month2 || (month1 == month2 && day1 > day2))
            {
                System.out.println("The second date " + day2 + "/" + month2 + " comes before the first date " + day1 + "/" + month1 + ".");
            }

            else
            {
                System.out.println("Both dates are the same.");
            }
        }
    }
}