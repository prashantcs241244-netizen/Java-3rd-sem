package Lec_02;

import java.util.Scanner;

public class Check_vowel_consonant {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a single character: ");
            char ch = sc.next().charAt(0);
            ch = Character.toLowerCase(ch);

            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is a vowel.");
                    break;
                default:

                    if (ch >= 'a' && ch <= 'z') {
                        System.out.println(ch + " is a consonant.");
                    } else {
                        System.out.println(ch + " is not an alphabet.");
                    }
            }

            sc.close();
        }
    }



