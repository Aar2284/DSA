// Take marks (0–100) and print the corresponding grade (A/B/C/D/F). 

import java.util.Scanner;

public class Q3GradeCalculator
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))    
        {
            System.out.println("Enter you marks: ");
            int marks = sc.nextInt();

            if (marks >= 0 && marks <= 100) 
            {
                if (marks >= 90) 
                {
                    System.out.println("Grade: A");
                } 
                
                else if (marks >= 80) 
                {
                    System.out.println("Grade: B");
                } 
                
                else if (marks >= 70) 
                {
                    System.out.println("Grade: C");
                } 
                
                else if (marks >= 60) 
                {
                    System.out.println("Grade: D");
                } 
                
                else 
                {
                    System.out.println("Grade: F");
                }
            } 
            
            else 
            {
                System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
            }
        }
    }
}