package Lec_08;

public class Multiple_constructor {
    public Multiple_constructor() {
        System.out.println(" sound");
        this(5);
        System.out.println(" ----------- ");
    }

    public Multiple_constructor(int a) {
        System.out.println(a + " rock");
        this(5,6);
        System.out.println(" ------------");
    }

    public Multiple_constructor(int a, int b) {
        System.out.println(a + b + " sound rock");
        System.out.println(" ------------");
    }
}

    class Main{
        public static void main(String[] args) {
            Multiple_constructor obj = new Multiple_constructor();
//            Multiple_constructor obj1 = new Multiple_constructor(5);
//            Multiple_constructor obj2 = new Multiple_constructor(5,6);

        }

    }

