package Lec_02;

import java.util.Scanner;

public class Reverse_of_a_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int revNum = sc.nextInt();
        int rev = 0;
        while (revNum != 0) {
            int digit = revNum % 10;
            rev = rev * 10 + digit;
            revNum /= 10;
        }
        System.out.println("Reversed number = " + rev);

    }
}
