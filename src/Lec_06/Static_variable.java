package Lec_06;


public class Static_variable {
    static void sum(int a,int b ){
        System.out.println("hello");
    }


  static int a = 5;
    public static void main(String[] args){
//        sum();
        Static_variable obj = new Static_variable();//create obj
        obj.sum(5,10);
        System.out.println(a);

    }
}
