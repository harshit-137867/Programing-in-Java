/** 9. Java Program to Find Student’s Result/Grade 
  using IF Condition  */

import java.util.Scanner;

public class StuGrade_9 {
    public static void main(String[] args) {
        int marks;
	System.out.print("Enter Grade here : ");
	Scanner sc = new Scanner(System.in);
	marks = sc.nextInt();
	

        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 75) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else if (marks >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Fail");
        }
	
	sc.close();
    }
}


