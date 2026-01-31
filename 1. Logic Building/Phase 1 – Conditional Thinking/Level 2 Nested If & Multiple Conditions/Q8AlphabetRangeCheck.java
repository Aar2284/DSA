// Take an alphabet character and check if it lies between ‘a’ and ‘m’ or ‘n’ and ‘z’

import java.util.Scanner;

public class Q8AlphabetRangeCheck 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))    
        {
            System.out.print("Enter an alphabet character: ");
            char ch = sc.next().charAt(0);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
            {
                if ((ch >= 'a' && ch <= 'm') || (ch >= 'A' && ch <= 'M')) 
                {
                    System.out.println(ch + " lies between 'a' and 'm'.");
                } 
                
                else 
                {
                    System.out.println(ch + " lies between 'n' and 'z'.");
                }
            } 
            
            else 
            {
                System.out.println("Invalid input. Please enter an alphabet character.");
            }
        }
    }
}