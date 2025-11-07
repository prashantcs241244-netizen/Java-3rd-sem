package Lec_02;

import java.util.Scanner;

public class Table {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for table: ");
        int tableNum = sc.nextInt();
        for (int j = 1; j <= 10; j++) {
            System.out.println(tableNum + " x " + j + " = " + (tableNum * j));
        }


    }
}
