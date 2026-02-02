// Take a month number (1–12) and print the number of days in that month (ignore leap years). 

import java.util.Scanner;

public class Q10DaysInMonth 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))    
        {
            System.out.print("Enter a month number (1-12): ");
            int month = sc.nextInt();

            if (month >= 1 && month <= 12) 
            {
                if (month == 2) 
                {
                    System.out.println("February has 28 days.");
                } 
                
                else if (month == 4 || month == 6 || month == 9 || month == 11) 
                {
                    System.out.println("Month " + month + " has 30 days.");
                } 
                
                else 
                {
                    System.out.println("Month " + month + " has 31 days.");
                }
            } 
            
            else 
            {
                System.out.println("Invalid month number entered. Please enter a number between 1 and 12.");
            }
        }
    }
}