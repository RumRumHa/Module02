package ra.decision_marking;

import java.util.Scanner;

public class BusTicket {
    public static void main(String[] args) {
        // B1: Khai báo 1 hằng số chứa giá xe bus
        final float TICKET = 7000;
        // B2: Nhập vào tuổi người đi xe bus
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tuổi người đi xe bus: ");
        int age = Integer.parseInt(scanner.nextLine());
        //B3: Tính vé đi xe bus và in ra màn hình
        if (age < 6 && age > 60) {
            System.out.println("Miễn phí vé xe bus.");
        } else if (age >= 6 && age <= 18) {
            System.out.println("Vé xe bus: " + TICKET*0.5);
        } else {
            System.out.println("Vé xe bus: " + TICKET);
        }
    }
}
