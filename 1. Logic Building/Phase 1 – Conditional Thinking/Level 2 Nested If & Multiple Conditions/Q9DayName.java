// Take a day number (1–7) and print the corresponding day name. 

import java.util.Scanner;

public class Q9DayName 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))    
        {
            System.out.print("Enter a day number (1-7): ");
            int dayNumber = sc.nextInt();

            switch (dayNumber) 
            {
                case 1 -> System.out.println("Day 1 is Sunday.");
                case 2 -> System.out.println("Day 2 is Monday.");
                case 3 -> System.out.println("Day 3 is Tuesday.");
                case 4 -> System.out.println("Day 4 is Wednesday.");
                case 5 -> System.out.println("Day 5 is Thursday.");
                case 6 -> System.out.println("Day 6 is Friday.");
                case 7 -> System.out.println("Day 7 is Saturday.");
                default -> System.out.println("Invalid day number entered. Please enter a number between 1 and 7.");
            }
        }
    }
}