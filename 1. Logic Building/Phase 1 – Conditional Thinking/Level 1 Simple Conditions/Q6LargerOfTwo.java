// Take two numbers and print the larger one. 

import java.util.Scanner;

public class Q6LargerOfTwo
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter First num: ");
            int num1 = sc.nextInt();

            System.out.println("Enter Second num: ");
            int num2 = sc.nextInt();

            if(num1 > num2)
            {
                System.out.println(num1 + " is Larger number");
            }

            else
            {
                System.out.println(num2 + " is Larger number");
            }
        }    
    }
}