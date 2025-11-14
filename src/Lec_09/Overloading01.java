package Lec_09;
// function overloading 01
class hello {
    void sum() {
        System.out.println("hello");
    }

    void sum(int a) {
        System.out.println(a);
    }

    void sum(int a, int b) {
        System.out.println(a + b);
    }
}

public class Overloading01 {
    public static void main(String[] args){
        hello obj = new hello();

        obj.sum();
        obj. sum(5);
        obj.sum(5,6);

    }

}
