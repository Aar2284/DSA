// Check if one of two given numbers is a multiple of the other. nested loops

import java.util.Scanner;

public class Q4MultipleCheck
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))    
        {
            System.out.println("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.println("Enter second number: ");
            int num2 = sc.nextInt();

            if (num1 != 0 && num2 != 0) 
            {
                if (num1 % num2 == 0) 
                {
                    System.out.println(num1 + " is a multiple of " + num2);
                } 
                
                else if (num2 % num1 == 0) 
                {
                    System.out.println(num2 + " is a multiple of " + num1);
                } 
                
                else 
                {
                    System.out.println("Neither number is a multiple of the other.");
                }
            } 
            
            else 
            {
                System.out.println("Multiples cannot be determined with zero.");
            }
        }
    }
}