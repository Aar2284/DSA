// Take two angles of a triangle and compute the third angle.

import java.util.Scanner;

public class Q9TriangleThirdAngle
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the first angle of the triangle: ");
            int angle1 = sc.nextInt();

            System.out.println("Enter the second angle of the triangle: ");
            int angle2 = sc.nextInt();

            if(angle1 > 0 && angle2 > 0 && (angle1 + angle2) < 180)
            {
                int angle3 = 180 - (angle1 + angle2);
                System.out.println("The third angle of the triangle is: " + angle3 + " degrees.");
            }

            else
            {
                System.out.println("Invalid angles entered. The sum of the two angles must be less than 180 degrees and both angles must be positive.");
            }
        }
    }
}