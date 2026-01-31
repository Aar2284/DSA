// Take a character and check if it’s a vowel or consonant.

import java.util.Scanner;

public class Q9VowelOrConsonant
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter an alphabet: ");
            char ch = sc.next().charAt(0);

            // Check if the character is a vowel
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                System.out.println(ch + " is a Vowel.");
            }
            else
            {
                System.out.println(ch + " is a Consonant.");
            }
        }
    }
}