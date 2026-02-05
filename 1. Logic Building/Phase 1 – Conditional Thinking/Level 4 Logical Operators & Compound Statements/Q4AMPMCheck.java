// Take 24-hour time (hours and minutes) and print whether it is AM or PM.

import java.util.Scanner;

public class Q4AMPMCheck
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the hours (0-23): ");
            int hours = sc.nextInt();

            System.out.println("Enter the minutes (0-59): ");
            int minutes = sc.nextInt();

            if(hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60)
            {
                if(hours < 12)
                {
                    System.out.println("The time is " + hours + ":" + String.format("%02d", minutes) + " AM.");
                }

                else
                {
                    int displayHours = (hours == 12) ? 12 : hours - 12;
                    System.out.println("The time is " + displayHours + ":" + String.format("%02d", minutes) + " PM.");
                }
            }

            else
            {
                System.out.println("Invalid time entered. Hours must be between 0 and 23, and minutes must be between 0 and 59.");
            }
        }
    }
}