package Lec_08;
class Animal{
    void eat() {
        System.out.println("pizza");


    }
}
 class Dog extends Animal {
    void barks() {
        System.out.println("hehe");
    }
}
class Pappy extends Dog{
    void play(){
        System.out.println("haha");

    }
}
public class Inheritance01
{
    public static void main(String[] args) {
        Pappy obj=new Pappy();
//        Inheritance.Pappy obj = new Inheritance.Pappy();
        obj.barks();
        obj.eat();
        obj.play();
    }
}




//1.single level inheritance  - 1 parent 1 child
//2. multi level inheritance  - a , b ,c class
