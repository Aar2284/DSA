// Take a temperature value and print “Cold”, “Warm”, or “Hot” using range conditions

import java.util.Scanner;

public class Q8TemperatureCheck
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the temperature (in Degree Celcius): ");
            float temp = sc.nextFloat();

            if (temp <= 0)
            {
                System.out.println("Cold Temperature");
            }

            else if(temp > 0 && temp <= 25)
            {
                System.out.println("Warm Temperature");
            }
            
            else
            {
                System.out.println("Hot Temperature");
            }
        }
    }
}