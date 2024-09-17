package bt;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tự nhiên: ");
        int number = Integer.parseInt(scanner.nextLine());
        if (number % 3 == 0) {
            if (number % 5 == 0) {
                System.out.println(number + " chia hết cho 3 và 5");
            } else {
                System.out.println(number + " chia hết cho 3 nhưng không chia hết cho 5");
            }
        } else {
            if (number % 5 == 0) {
                System.out.println(number + " không chia hết cho 3 nhưng chia hết cho 5");
            } else {
                System.out.println(number + " không chia hết cho 3 và 5");
            }
        }
    }
}
