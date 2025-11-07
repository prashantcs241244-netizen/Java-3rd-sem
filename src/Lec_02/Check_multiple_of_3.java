package Lec_02;

import java.util.Scanner;

public class Check_multiple_of_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int m = sc.nextInt();
        if (m % 3 == 0)
            System.out.println("Multiple of 3");
        else
            System.out.println("Not a multiple of 3");


    }
}
