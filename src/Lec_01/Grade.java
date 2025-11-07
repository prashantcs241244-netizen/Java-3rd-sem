package Lec_01;
import java.util.Scanner;
public class Grade {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int marks;

            System.out.print("Enter your marks (0 - 100): ");
            marks = sc.nextInt();

            char grade;

            if (marks >= 90) {
                grade = 'A';
            }else if (marks >= 75) {
                grade = 'B';
            } else if (marks >= 50) {
                grade = 'C';
            } else if (marks >= 40) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("Your Grade is: " + grade);

            if (grade == 'F') {
                System.out.println("Result: Fail");
            } else {
                System.out.println("Result: Pass");
            }

            sc.close();
        }
    }

