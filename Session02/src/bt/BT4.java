package bt;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sumEven = 0;
        System.out.printf("Nhập vào khoảng cần tính:\n Bắt đầu từ: ");
        int numberStart = Integer.parseInt(scan.nextLine());
        System.out.print("Kết thúc đến: ");
        int numberEnd = Integer.parseInt(scan.nextLine());
        for (int i = numberStart; i <= numberEnd; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d ", i);
                sumEven += i;
            }
        }
        System.out.printf("Tổng các số từ %d đến %d là: %d ", numberStart, numberEnd, sumEven);
    }
}
