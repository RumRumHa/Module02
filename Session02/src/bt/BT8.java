package bt;

import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        while (true) {
            System.out.print("Nhập độ dài cạnh thứ nhất: ");
            a = Double.parseDouble(scanner.nextLine());
            System.out.print("Nhập độ dài cạnh thứ hai: ");
            b = Double.parseDouble(scanner.nextLine());
            System.out.print("Nhập độ dài cạnh thứ ba: ");
            c = Double.parseDouble(scanner.nextLine());
            if (isValidTriangle(a, b, c)) {
                System.out.println("Đây là một tam giác hợp lệ.");
                double perimeter = a + b + c;
                double area = calculateArea(a, b, c);
                System.out.println("Chu vi của tam giác: " + perimeter);
                System.out.println("Diện tích của tam giác: " + area);
                break;
            } else {
                System.out.println("Ba cạnh này không thể tạo thành tam giác. Vui lòng nhập lại.");
            }
        }
    }
    public static boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
    public static double calculateArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
