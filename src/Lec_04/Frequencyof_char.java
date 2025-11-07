package Lec_04;

public class Frequencyof_char {
    public static void main(String[] args) {
        String str = "Prashant is powerfull";
        int freq[] = new int[256];
        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + "-" + freq[i]);
            }
        }
    }
}






