// Take a 3-digit number and determine if the middle digit is the largest, smallest, or neither. 

import java.util.Scanner;

public class Q2MiddleDigitCheck 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))    
        {
            System.out.print("Enter a 3-digit number: ");
            int number = sc.nextInt();

            if (number >= 100 && number <= 999) 
            {
                int digit1 = number / 100;          // Extracting the hundreds place
                int digit2 = (number / 10) % 10;    // Extracting the tens place (middle digit)
                int digit3 = number % 10;           // Extracting the units place

                if (digit2 > digit1 && digit2 > digit3) 
                {
                    System.out.println("The middle digit is the largest.");
                } 
                
                else if (digit2 < digit1 && digit2 < digit3) 
                {
                    System.out.println("The middle digit is the smallest.");
                } 
                
                else 
                {
                    System.out.println("The middle digit is neither the largest nor the smallest.");
                }
            } 
            
            else 
            {
                System.out.println("Invalid input. Please enter a 3-digit number.");
            }
        }
    }
}