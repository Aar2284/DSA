// Check if a number is divisible by 5. 

import java.util.Scanner;

class Divisibleby5  
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter an integer: ");
            int num = sc.nextInt();

            if (num % 5 == 0)
            {
                System.out.println("Number "+num+" is divisible by 5");
            }

            else
            {
                System.out.println("Number "+num+" is not divisible by 5");
            }
        }
    }
}