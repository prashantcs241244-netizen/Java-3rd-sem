package Lec_07;

import java.util.Scanner;

public class Rectangle01 {

    int length;
    int breadth;

    Rectangle01( int length, int breadth) {
        this.length = length;
        this.breadth = breadth;


    }

    void calculate_area(){
        System.out.println("Enter length: " + length);
        System.out.println("Enter breadth: " + breadth);
        int area = length*breadth;
        int perimeter = 2*(length+breadth);
        System.out.println("Area = "+area);
        System.out.println("Perimeter = "+perimeter);
        System.out.println("-------------------");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int b1 = sc.nextInt();
        int l2 = sc.nextInt();
        int b2 = sc.nextInt();
        Rectangle01 obj = new Rectangle01(l1,b1);
        Rectangle01 obj1 = new Rectangle01(l2,b2);


        obj.calculate_area();
        obj1.calculate_area();

    }
}


