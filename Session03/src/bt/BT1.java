package bt;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần xóa: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = {10, 4, 6, 7, 8, 5, 6, 7, 8, 0};
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                found = true;
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
                i--;
            }
        }
        if (!found) {
            System.out.println("Phần tử không tồn tại trong mảng.");
        } else {
            System.out.println("Mảng sau khi thay đổi: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("%d\t", arr[i]);
            }
            System.out.printf("\n");
        }
    }
}
