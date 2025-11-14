package Lec_09;

public class ColumnWiseSum_array_04 {
    public static void main(String[] args) {
        int arr[][] = {{2, 3, 4}, {5, 6, 7}, {8, 9, 10}};

        for (int j = 0; j < arr.length; j++) {
            int colsum = 0;
            for (int i = 0; i < arr.length; i++) {
                colsum += arr[i][j];
            }
            System.out.println("ColumnWise sum : " + colsum);
        }
    }
}
