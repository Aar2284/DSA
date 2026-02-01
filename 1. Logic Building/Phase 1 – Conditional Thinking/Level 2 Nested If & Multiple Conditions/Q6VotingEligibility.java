// Check voting eligibility for a given age (18+)

import java.util.Scanner;

public class Q6VotingEligibility 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))    
        {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age >= 0) 
            {
                if (age >= 18) 
                {
                    System.out.println("You are eligible to vote.");
                } 
                
                else 
                {
                    System.out.println("You are not eligible to vote.");
                }
            } 
            
            else 
            {
                System.out.println("Invalid age entered. Please enter a non-negative age.");
            }
        }
    }
}