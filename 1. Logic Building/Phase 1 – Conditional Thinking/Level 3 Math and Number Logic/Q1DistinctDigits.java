// Take a 3-digit number and check if all digits are distinct. 

import java.util.Scanner;

public class Q1DistinctDigits 
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
                int digit2 = (number / 10) % 10;    // Extracting the tens place
                int digit3 = number % 10;           // Extracting the units place

                if (digit1 != digit2 && digit1 != digit3 && digit2 != digit3) 
                {
                    System.out.println("All digits are distinct.");
                } 
                
                else 
                {
                    System.out.println("Digits are not distinct.");
                }
            } 
            
            else 
            {
                System.out.println("Invalid input. Please enter a 3-digit number.");
            }
        }
    }
}