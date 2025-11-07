package Lec_02;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for factorial: ");
        int factNum = sc.nextInt();
        long fact = 1;
        for (int k = 1; k <= factNum; k++) {
            fact *= k;
        }
        System.out.println("Factorial = " + fact);

    }
}
