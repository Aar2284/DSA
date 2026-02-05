// Take a character and check if it is a letter, a digit, or neither

import java.util.Scanner;

public class Q1CharacterTypeCheck
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a character: ");
            char ch = sc.next().charAt(0);

            if(Character.isLetter(ch))
            {
                System.out.println(ch + " is a letter.");
            }

            else if(Character.isDigit(ch))
            {
                System.out.println(ch + " is a digit.");
            }

            else
            {
                System.out.println(ch + " is neither a letter nor a digit.");
            }
        }
    }
}