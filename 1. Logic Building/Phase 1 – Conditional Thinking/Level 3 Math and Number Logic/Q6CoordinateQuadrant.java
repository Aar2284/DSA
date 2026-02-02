// Take coordinates (x, y) and determine which quadrant the point lies in

import java.util.Scanner;

public class Q6CoordinateQuadrant 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))    
        {
            System.out.print("Enter x coordinate: ");
            int x = sc.nextInt();

            System.out.print("Enter y coordinate: ");
            int y = sc.nextInt();

            if (x > 0 && y > 0) 
            {
                System.out.println("The point (" + x + ", " + y + ") lies in Quadrant 1.");
            } 
            
            else if (x < 0 && y > 0) 
            {
                System.out.println("The point (" + x + ", " + y + ") lies in Quadrant 2.");
            } 
            
            else if (x < 0 && y < 0) 
            {
                System.out.println("The point (" + x + ", " + y + ") lies in Quadrant 3.");
            } 
            
            else if (x > 0 && y < 0) 
            {
                System.out.println("The point (" + x + ", " + y + ") lies in Quadrant 4.");
            } 
            
            else if (x == 0 && y == 0) 
            {
                System.out.println("The point is at the Origin.");
            } 
            
            else if (x == 0) 
            {
                System.out.println("The point lies on the Y-axis.");
            } 
            
            else 
            {
                System.out.println("The point lies on the X-axis.");
            }
        }
    }
}