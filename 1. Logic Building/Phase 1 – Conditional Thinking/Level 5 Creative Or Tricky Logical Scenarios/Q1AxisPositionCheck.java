// Take coordinates (x, y) and check if the point lies on the X-axis, Y-axis, or at the origin. 

import java.util.Scanner;

public class Q1AxisPositionCheck
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the x coordinate: ");
            int x = sc.nextInt();

            System.out.println("Enter the y coordinate: ");
            int y = sc.nextInt();

            if(x == 0 && y == 0)
            {
                System.out.println("The point is at the origin.");
            }

            else if(y == 0)
            {
                System.out.println("The point lies on the X-axis.");
            }

            else if(x == 0)
            {
                System.out.println("The point lies on the Y-axis.");
            }

            else
            {
                System.out.println("The point does not lie on either axis.");
            }
        }
    }
}