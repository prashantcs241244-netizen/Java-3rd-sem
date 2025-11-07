package Lec_02;

public class print1_n {
   public static void main(String[]args) {
       int n = 100;
        if (n < 1) {
            System.out.println("N should be >= 1");
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (i > 1) System.out.print(" ");
            System.out.print(i);
        }
        System.out.println();
    }

}
