package Lec_02;

import java.util.Scanner;

public class Print_ASCII {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        int ascii = (int) c;
        System.out.println("ASCII value of " + c + " is " + ascii);

    }
}
