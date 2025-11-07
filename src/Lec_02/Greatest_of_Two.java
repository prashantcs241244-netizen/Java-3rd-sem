package Lec_02;

public class Greatest_of_Two {
    public static void main(String[]args) {
        int a=50;int b=100;
        if (a > b){
            System.out.println(a + " is greater than " + b);
        } else if (b > a){
            System.out.println(b + " is greater than " + a);
        }
        else{
            System.out.println("Both are equal: " + a);
        }
    }

}

