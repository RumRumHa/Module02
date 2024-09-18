package bt;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng của mảng: ");
        int nRow = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số cột của mảng: ");
        int nCol = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[nRow][nCol];
        for (int i = 0; i < nRow; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.printf("arr[%d][%d] = ", i, j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Mảng arr: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%5d", arr[i][j]);
            }
            System.out.printf("\n");
        }
        int max =arr[0][0];
        for (int i = 0; i < nRow; i++) {
            for (int j = 0; j < nCol; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất là: " + max);
    }
}
