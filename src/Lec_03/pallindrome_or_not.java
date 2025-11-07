package Lec_03;

public class pallindrome_or_not {
    public static void main (String[]args){
        String a = "aba";
        String b = "";
        for(int i = a.length()-1;i>=0;i--){            //reverse
            b+=a.charAt(i);                            //assign value in str b
        }
        if(a.equals(b)){                               //check str a = str b
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not Pallindrome");

        }
    }
}
