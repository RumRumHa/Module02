package bt;

import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào bán kính đường tròn: ");
        double r = sc.nextDouble();
        double perimeter = 2 * Math.PI * r;
        double area = Math.PI * r * r;

        System.out.println("Chu vi đường tròn là: " + perimeter);
        System.out.println("Diện tích đường tròn là: " + area);
        sc.close();
    }
}
