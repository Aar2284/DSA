// Check whether a given integer is single-digit, double-digit, or multi-digit. 

import java.util.Scanner;

public class Q4DigitCountType 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))    
        {
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();

            int absNumber = Math.abs(number); // Consider absolute value for digit count

            if (absNumber >= 0 && absNumber <= 9) 
            {
                System.out.println(number + " is a single-digit number.");
            } 
            
            else if (absNumber >= 10 && absNumber <= 99) 
            {
                System.out.println(number + " is a double-digit number.");
            } 
            
            else 
            {
                System.out.println(number + " is a multi-digit number.");
            }
        }
    }
}