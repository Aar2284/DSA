// Take a year and print the corresponding century (e.g., “19th century”, “20th century”) 

import java.util.Scanner;

public class Q10CenturyFinder 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        int century = (year + 99) / 100;

        String suffix = "th"; 

        if (century % 100 < 11 || century % 100 > 13) 
        {
            int lastDigit = century % 10;

            switch (lastDigit) {
                case 1 -> suffix = "st";
                case 2 -> suffix = "nd";
                case 3 -> suffix = "rd";
            }
        }

        System.out.println(century + suffix + " century");
    }
}