package bt;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào giá trị tiền USD: ");
        int moneyUsd = sc.nextInt();
        int calcMoney = 25000 * moneyUsd;
        System.out.printf("Giá trị tiền VND cần tính là: %d", calcMoney);
        sc.close();
    }
}
