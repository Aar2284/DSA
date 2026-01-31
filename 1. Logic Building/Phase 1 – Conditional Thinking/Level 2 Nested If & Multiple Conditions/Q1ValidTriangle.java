//  Take three sides and check if they form a valid triangle. using nested loops

import java.util.Scanner;

public class Q1ValidTriangle 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter side 1: ");
            double side1 = sc.nextDouble();

            System.out.print("Enter side 2: ");
            double side2 = sc.nextDouble();

            System.out.print("Enter side 3: ");
            double side3 = sc.nextDouble();

            if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) 
            {
                System.out.println("The sides form a valid triangle.");
            } 
            else 
            {
                System.out.println("The sides do not form a valid triangle.");
            }
        }
    }
}