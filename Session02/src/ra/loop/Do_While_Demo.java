package ra.loop;

import java.util.Scanner;

public class Do_While_Demo {
    public static void main(String[] args) {
        // Nhập các số từ bàn phím, tính tổng các số, kết thúc khi nhập 0
        int sumNumbers = 0;
        int number;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập vào một số: ");
            number = Integer.parseInt(scanner.nextLine());
            sumNumbers += number;
        } while (number != 0);
        System.out.println("Tổng các số vừa nhập là: " + sumNumbers);
    }
}
