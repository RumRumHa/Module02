package bt;

import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--------------------- Menu --------------------");
            System.out.println("1. Kiểm tra tính chẵn lẻ của một số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
            System.out.println("4. Thoát");
            System.out.print("Chọn một chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhập một số: ");
                    int num1 = Integer.parseInt(scanner.nextLine());
                    if (num1 % 2 == 0) {
                        System.out.println(num1 + " là số chẵn.");
                    } else {
                        System.out.println(num1 + " là số lẻ.");
                    }
                    break;

                case 2:
                    System.out.print("Nhập một số: ");
                    int num2 = Integer.parseInt(scanner.nextLine());
                    int count = 0;
                    for (int i = 1; i <= Math.sqrt(num2); i++) {
                        if (num2 % i == 0) {
                            count++;
                            if (i != num2 / i) {
                                count++;
                            }
                        }
                    }
                    if (count == 2) {
                        System.out.println(num2 + " là số nguyên tố.");
                    } else {
                        System.out.println(num2 + " không phải là số nguyên tố.");
                    }
                    break;

                case 3:
                    System.out.print("Nhập một số: ");
                    int num3 = Integer.parseInt(scanner.nextLine());
                    if (num3 % 3 == 0) {
                        System.out.println(num3 + " chia hết cho 3.");
                    } else {
                        System.out.println(num3 + " không chia hết cho 3.");
                    }
                    break;

                case 4:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 4);
    }
}
