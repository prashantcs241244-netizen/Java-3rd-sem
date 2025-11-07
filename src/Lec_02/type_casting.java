package Lec_02;

import java.util.Scanner;

public class type_casting {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        float f = 12.56f;
        int intValue = (int) f;
        System.out.println("Float value: " + f);
        System.out.println("After conversion to int: " + intValue);

    }
}
