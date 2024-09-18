package bt;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị cần chèn: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào vị trí index cần chèn X: ");
        int index = Integer.parseInt(scanner.nextLine());
        if (index <= -1 || index >= arr.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng.");
        } else {
            int[] newArr = new int[arr.length + 1];
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            newArr[index] = x;
            for (int i = index; i < arr.length; i++) {
                newArr[i + 1] = arr[i];
            }
            System.out.print("Mảng sau khi chèn: ");
            for (int i = 0; i < newArr.length; i++) {
                System.out.printf("%d\t", newArr[i]);
            }
            System.out.printf("\n");
        }
    }
}
