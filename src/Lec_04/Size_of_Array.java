package Lec_04;

public class Size_of_Array {
    public static void main(String[]args){
        String str = "java is powerfull language";
        String a[] = str.split( " ");
        String largest = "";
        for(String val : a){
            if(val.length()>largest.length()){
                largest= val;
            }
        }
        System.out.println(largest);


    }

}
