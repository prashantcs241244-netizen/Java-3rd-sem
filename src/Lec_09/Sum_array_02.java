package Lec_09;

public class Sum_array_02 {
    public static void main(String[] args) {
        int arr[][] = {{2, 3, 4}, {5, 6, 7}, {8, 9, 0}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("total sum: " + sum);
    }
}
