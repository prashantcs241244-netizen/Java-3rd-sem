package Lec_09;
class hello1 {

    void sum(int a, int b) {
        System.out.println(a + b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void sum(double a ,double b){
        System.out.println(a+b);
    }
}

public class Overloading02 {
    public static void main(String[] args) {
        hello1 obj = new hello1();
        obj.sum(5, 6);
        obj.sum(5, 6, 7);
        obj.sum(5, 6);
    }
}


