//  Take a password string and check basic rules (length ≥ 8 and contains at least one digit). 

import java.util.Scanner;

public class Q10PasswordValidation
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a password: ");
            String password = sc.nextLine();

            boolean hasDigit = false;

            for(char ch : password.toCharArray())
            {
                if(Character.isDigit(ch))
                {
                    hasDigit = true;
                    break;
                }
            }

            if(password.length() >= 8 && hasDigit)
            {
                System.out.println("Password is valid.");
            }

            else
            {
                System.out.println("Password is invalid. It must be at least 8 characters long and contain at least one digit.");
            }
        }
    }
}