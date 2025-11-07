package Lec_02;
import java.util.Scanner;
public class Userinput {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string value");
        String str = sc.nextLine();
        System.out.println(str);
    }
}
