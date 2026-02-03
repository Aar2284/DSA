// Take a number and check if it lies between 100 and 999 (inclusive).

import java.util.Scanner;

public class Q8RangeCheck 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))    
        {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num >= 100 && num <= 999) 
            {
               System.out.println(num + " lies between 100 and 999.");
            } 
            
            else 
            {
                System.out.println(num + " does not lie between 100 and 999.");
            }
        }
    }
}