package ra.array;

import java.util.Scanner;

public class TwoDimensions {
    public static void main(String[] args) {
        //1. Cách khai báo mảng 2 chiều
        // 1.1 Khai báo với từ khóa new
        // --Syntax: Datatype[][] arrayName = new Datatype[row][col]
        // -- Khai báo mảng 2 chiều số nguyên gồm 3 dòng và 4 cột
        int[][] numbers = new int[3][4];
        // 1.2 Khai báo literal
        // -- Khai báo và khởi tạo mảng 2 chiều số nguyên gồm 2 dòng và 3 cột
        int[][] arrInt = {{1,2,3}, {4,5,6}}; //row=2, col=3
        //2. Làm việc với mảng 2 chiều
        // 2.1 Nhập giá trị các phần tử mảng numbers - 2 vòng lặp lồng nhau
        Scanner scanner = new Scanner(System.in);
        // -- Duyệt theo dòng
        //numbers.length --> row
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("numbers[%d][%d] = ", i, j);
                numbers[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        // 2.2 In mảng numbers theo ma trận
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("%5d", numbers[i][j]);
            }
            System.out.printf("\n");
        }
        // 2.3 In ra các phần tử là số nguyên tố trong mảng
        System.out.println("Các phần tử là số nguyên tố trong mảng là: ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                //Kiểm tra phần tử numbers[i][j] có phải số nguyên tố hay không
                boolean isPrime = true; //là số nguyên tố
                if (numbers[i][j] >= 2) {
                    for (int k = 2; k <= Math.sqrt(numbers[i][j]); k++) {
                        if (numbers[i][j] % k == 0) {
                            //k là ước của numbers[i][j]
                            isPrime = false;
                        }
                    }
                }else {
                    isPrime = false;
                }
                if (isPrime) {
                    System.out.printf("%d\t", numbers[i][j]);
                }
            }
        }
    }
}
