// Take time (hours and minutes) and print the smaller angle between the hour and minute hands

import java.util.Scanner;

public class Q4ClockAngle
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the hours (1-12): ");
            int hours = sc.nextInt();

            System.out.println("Enter the minutes (0-59): ");
            int minutes = sc.nextInt();

            if(hours >= 1 && hours <= 12 && minutes >= 0 && minutes < 60)
            {
                // Calculate the angles of hour and minute hands
                double minuteAngle = minutes * 6; // 360 degrees / 60 minutes
                double hourAngle = (hours % 12) * 30 + (minutes * 0.5); // 360 degrees / 12 hours + extra for minutes

                // Calculate the difference between the two angles
                double angleDifference = Math.abs(hourAngle - minuteAngle);

                // Find the smaller angle
                double smallerAngle = Math.min(angleDifference, 360 - angleDifference);

                System.out.println("The smaller angle between the hour and minute hands is: " + smallerAngle + " degrees.");
            }

            else
            {
                System.out.println("Invalid time entered. Hours must be between 1 and 12, and minutes must be between 0 and 59.");
            }
        }
    }
}