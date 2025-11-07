package Lec_03;

public class Str_inbuilt_func {
    public static void main(String[]args){
//        String str = "hello java";                     //create string
//        String str1 = "hello java";                    //create string
        String str = new String("hello java");         //create string
        String str1 = new String( "hello java");       //create string

//        System.out.println(str.length());               // length
        System.out.println(str.charAt(1));
//        System.out.println(str.toUpperCase());          //Upper
//        System.out.println(str.toLowerCase());          //Lower
//        System.out.println(str.indexOf("2"));           //index value
//        System.out.println(str.substring(2));
//        System.out.println(str.substring(1,5));
//        System.out.println(str.trim());                 //space removed
//        System.out.println(str.split());
        System.out.println(str==str1);                    //compair two string _address same
        System.out.println(str.equals(str1));             //compair two string



    }
}
