package Lec_09;

public class RowiseSum_array_03 {
    public static void main(String[] args) {
        int arr[][] = {{2, 3, 4}, {5, 6, 7}, {8, 9, 10}};

        for (int i = 0; i < arr.length; i++) {
            int rowsum = 0;
            for (int j = 0; j < arr.length; j++) {
                rowsum += arr[i][j];
            }
            System.out.println("RowWise sum : " + rowsum);
        }
    }
}
