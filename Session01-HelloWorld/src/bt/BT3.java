package bt;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập cạnh của hình vuông: ");
        float side = sc.nextFloat();

        float perimeter = 4 * side;
        float area = side * side;

        System.out.println("Chu vi của hình vuông là: " + perimeter);
        System.out.println("Diện tích của hình vuông là: " + area);
        sc.close();
    }
}
