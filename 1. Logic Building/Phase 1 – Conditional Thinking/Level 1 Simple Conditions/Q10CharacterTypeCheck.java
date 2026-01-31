// Take a character and check whether it’s uppercase, lowercase, a digit, or a special character. 

import java.util.Scanner;

public class Q10CharacterTypeCheck
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter a character: ");
            char ch = sc.next().charAt(0);

            if (ch >= 'A' && ch <= 'Z') 
            {
                System.out.println(ch + " is an Uppercase letter.");
            } 

            else if (ch >= 'a' && ch <= 'z') 
            {
                System.out.println(ch + " is a Lowercase letter.");
            } 

            else if (ch >= '0' && ch <= '9') 
            {
                System.out.println(ch + " is a Digit.");
            } 
            
            else 
            {
                System.out.println(ch + " is a Special character.");
            }
        }        
    }
}