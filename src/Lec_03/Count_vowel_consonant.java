package Lec_03;

public class Count_vowel_consonant {
    public static void main(String[] args) {
        String str = "Prashant Yadav";
        int v = 0;
        for (char ch : str.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                v++;
            }
        }
        System.out.println(v);
    }
}
