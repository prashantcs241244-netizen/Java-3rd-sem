package Lec_06;

public class str_non_repeating {
    static int val() {
        return 0;
    }

    public static void main(String[] args) {
        String str = "aabbcdd";
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i -1)) {
                count++;
            } else {
                result.append(str.charAt(i - 1)).append(count);
                count = 1;


            }

            System.out.println(count);
        }
    }
}
