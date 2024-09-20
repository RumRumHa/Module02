package bt;

import java.util.Scanner;

public class Circle {
    /*
    * Xây dựng lớp Circle gồm:
    * - Các thuộc tính:
    *   + Bán kính
    *   + Màu sắc
    * - Các phương thức khởi tạo (constructor) không tham số và có tham số
    * - Các phương thức getter và setter
    * - Phương thức chuvi(), dientich(), inputData(), displayData()
    * ---------------------------------------------------
    *           Circle
    * - Thuộc tính:
    *   + radius: double
    *   + color: String
    * - Phương thức
    *   + Circle()
    *   + Circle(radius: double, color: String)
    *   + getRadius(): double
    *   + setRadius(radius: double): void
    *   + getColor(): String
    *   + setColor(color: String): void
    *   + chuvi(): double
    *   + dientich(): double
    *   + inputData(): void
    *   + displayData(): void
    * */

    private double radius;
    private String color;

    public Circle() {

    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double chuvi(double radius) {
        return 2 * Math.PI * radius;
    }
    public double dientich(double radius) {
        return Math.PI * radius * radius;
    }
    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào bán kính: ");
        this.radius = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào màu sắc: ");
        this.color = scanner.nextLine();
    }
    public void displayData() {
        System.out.printf("Bán kính: %f - Màu sắc: %s\n", this.radius, this.color);
    }
}
