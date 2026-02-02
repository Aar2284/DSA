// Take a 4-digit number and check if the first and last digits are equal. 

import java.util.Scanner;

public class Q3FirstLastDigitEqual 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))    
        {
            System.out.print("Enter a 4-digit number: ");
            int number = sc.nextInt();

            if (number >= 1000 && number <= 9999) 
            {
                int firstDigit = number / 1000;      // Extracting the first digit
                int lastDigit = number % 10;         // Extracting the last digit

                if (firstDigit == lastDigit) 
                {
                    System.out.println("The first and last digits are equal.");
                } 
                
                else 
                {
                    System.out.println("The first and last digits are not equal.");
                }
            } 
            
            else 
            {
                System.out.println("Invalid input. Please enter a 4-digit number.");
            }
        }
    }
}