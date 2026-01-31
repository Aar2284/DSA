// Take two numbers and determine whether both are even, both are odd, or one is even and one is odd.

import java.util.Scanner;

public class Q7EvenOddComparison 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))    
        {
            System.out.println("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.println("Enter second number: ");
            int num2 = sc.nextInt();

            if (num1 % 2 == 0) 
            {
                if (num2 % 2 == 0) 
                {
                    System.out.println("Both numbers are even.");
                } 
                
                else 
                {
                    System.out.println("First number is even and second number is odd.");
                }
            } 
            
            else 
            {
                if (num2 % 2 != 0) 
                {
                    System.out.println("Both numbers are odd.");
                } 
                
                else 
                {
                    System.out.println("First number is odd and second number is even.");
                }
            }
        }
    }
}