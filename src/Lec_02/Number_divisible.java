package Lec_02;

import java.util.Scanner;

public class Number_divisible {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int divNum = sc.nextInt();
        if (divNum % 5 == 0 && divNum % 11 == 0)
            System.out.println("Divisible! ");
        else
            System.out.println("Not divisible! ");




    }
}
